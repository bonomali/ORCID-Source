//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.orcid.org/ns/orcid}fuzzy-date">
 *       &lt;attribute name="media-type" type="{http://www.orcid.org/ns/orcid}media-type" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "publication-date")
public class PublicationDate extends FuzzyDate implements Serializable {

    public PublicationDate() {
    }

    public PublicationDate(Year year, Month month, Day day) {
        super(year, month, day);
    }

    public PublicationDate(FuzzyDate other) {
        super(other);
    }

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "media-type")
    protected MediaType mediaType;

    /**
     * Gets the value of the mediaType property.
     * 
     * @return possible object is {@link MediaType }
     * 
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *            allowed object is {@link MediaType }
     * 
     */
    public void setMediaType(MediaType value) {
        this.mediaType = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((mediaType == null) ? 0 : mediaType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PublicationDate other = (PublicationDate) obj;
        if (mediaType != other.mediaType)
            return false;
        return true;
    }

}
