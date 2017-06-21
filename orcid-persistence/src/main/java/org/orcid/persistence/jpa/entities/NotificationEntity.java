/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.persistence.jpa.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.orcid.jaxb.model.notification_v2.NotificationType;

/**
 * @author Will Simpson
 */
@Entity
@Table(name = "notification")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "notification_type")
// @formatter:off
@NamedNativeQueries({ @NamedNativeQuery(name = NotificationEntity.FIND_ORCIDS_WITH_UNSENT_NOTIFICATIONS, 
        query = "SELECT DISTINCT(n.orcid), p.send_email_frequency_days, COALESCE(p.completed_date, p.date_created) " + 
                " FROM notification n, profile p " +
                " WHERE n.sent_date IS NULL " +
                " AND n.orcid = p.orcid " +
                " AND p.send_email_frequency_days < :never " +
                " AND p.claimed = true " +
                " AND p.profile_deactivation_date IS NULL " +
                " AND NOT p.record_locked;"),
    @NamedNativeQuery(name = NotificationEntity.FIND_NOTIFICATIONS_TO_SEND_BY_ORCID,
        query = "SELECT * FROM notification " + 
        " WHERE id IN " +
        " ( " +
        "       SELECT n.id FROM notification n, (SELECT MAX(sent_date) AS max_sent_date FROM notification WHERE orcid=:orcid) x " +
        "       WHERE n.orcid=:orcid  " +
        "       AND ( " +
        "       (n.sent_date IS NULL AND unix_timestamp(:effective_date) > (unix_timestamp(x.max_sent_date) + (:record_email_frequency * 24 * 60 * 60))) " +
        "       OR " +
        "       (x.max_sent_date IS NULL AND unix_timestamp(:effective_date) > (unix_timestamp(:record_active_date) + (:record_email_frequency * 24 * 60 * 60))) " +
        "       ) " + 
        " );"
    )})
// @formatter:on
abstract public class NotificationEntity extends SourceAwareEntity<Long> implements ProfileAware {

    public static final String FIND_ORCIDS_WITH_UNSENT_NOTIFICATIONS = "findOrcidsWithUnsentNotifications";
    
    public static final String FIND_NOTIFICATIONS_TO_SEND_BY_ORCID = "findNotificationsToSendByOrcid";
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private ProfileEntity profile;
    private NotificationType notificationType;
    private String notificationSubject;
    private String notificationIntro;
    private Date sentDate;
    private Date readDate;
    private Date archivedDate;
    private Date actionedDate;    
    private boolean sendable;
    
    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "notification_seq")
    @SequenceGenerator(name = "notification_seq", sequenceName = "notification_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orcid", nullable = false)
    @Override
    public ProfileEntity getProfile() {
        return profile;
    }

    public void setProfile(ProfileEntity profile) {
        this.profile = profile;
    }

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "notification_type", insertable = false, updatable = false)
    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Column(name = "sent_date")
    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    @Column(name = "read_date")
    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    @Column(name = "archived_date")
    public Date getArchivedDate() {
        return archivedDate;
    }

    public void setArchivedDate(Date archivedDate) {
        this.archivedDate = archivedDate;
    }

    public boolean isSendable() {
        return sendable;
    }

    public void setSendable(boolean sendable) {
        this.sendable = sendable;
    }

    @Column(name = "actioned_date")
    public Date getActionedDate() {
        return actionedDate;
    }

    public void setActionedDate(Date actionedDate) {
        this.actionedDate = actionedDate;
    }

    @Column(name = "notification_subject")
    public String getNotificationSubject() {
        return notificationSubject;
    }

    public void setNotificationSubject(String notificationSubject) {
        this.notificationSubject = notificationSubject;
    }

    @Column(name = "notification_intro")
    public String getNotificationIntro() {
        return notificationIntro;
    }

    public void setNotificationIntro(String notificationIntro) {
        this.notificationIntro = notificationIntro;
    }     
}
