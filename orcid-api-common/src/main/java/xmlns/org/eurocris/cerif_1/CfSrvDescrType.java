//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 11:29:18 AM GMT 
//


package xmlns.org.eurocris.cerif_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cfSrvDescr__Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cfSrvDescr__Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfSrvId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *         &lt;element name="cfDescr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfSrvDescr__Type", propOrder = {
    "cfSrvId",
    "cfDescr"
})
public class CfSrvDescrType {

    @XmlElement(required = true)
    protected String cfSrvId;
    @XmlElement(required = true)
    protected CfMLangStringType cfDescr;

    /**
     * Gets the value of the cfSrvId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfSrvId() {
        return cfSrvId;
    }

    /**
     * Sets the value of the cfSrvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfSrvId(String value) {
        this.cfSrvId = value;
    }

    /**
     * Gets the value of the cfDescr property.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getCfDescr() {
        return cfDescr;
    }

    /**
     * Sets the value of the cfDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setCfDescr(CfMLangStringType value) {
        this.cfDescr = value;
    }

}
