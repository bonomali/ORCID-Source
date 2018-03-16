//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}assignee-orcid" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}assignee-name" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "assigneeOrcid", "assigneeName" })
@XmlRootElement(name = "assignee")
public class Assignee implements VisibilityType, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "assignee-orcid")
    protected AssigneeOrcid assigneeOrcid;
    @XmlElement(name = "assignee-name")
    protected AssigneeName assigneeName;
    @XmlAttribute
    protected Visibility visibility;

    /**
     * Gets the value of the assigneeOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link AssigneeOrcid }
     *     
     */
    public AssigneeOrcid getAssigneeOrcid() {
        return assigneeOrcid;
    }

    /**
     * Sets the value of the assigneeOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssigneeOrcid }
     *     
     */
    public void setAssigneeOrcid(AssigneeOrcid value) {
        this.assigneeOrcid = value;
    }

    /**
     * Gets the value of the assigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link AssigneeName }
     *     
     */
    public AssigneeName getAssigneeName() {
        return assigneeName;
    }

    /**
     * Sets the value of the assigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssigneeName }
     *     
     */
    public void setAssigneeName(AssigneeName value) {
        this.assigneeName = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Assignee)) {
            return false;
        }

        Assignee assignee = (Assignee) o;

        if (assigneeName != null ? !assigneeName.equals(assignee.assigneeName) : assignee.assigneeName != null) {
            return false;
        }
        if (assigneeOrcid != null ? !assigneeOrcid.equals(assignee.assigneeOrcid) : assignee.assigneeOrcid != null) {
            return false;
        }
        if (visibility != assignee.visibility) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = assigneeOrcid != null ? assigneeOrcid.hashCode() : 0;
        result = 31 * result + (assigneeName != null ? assigneeName.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        return result;
    }
}
