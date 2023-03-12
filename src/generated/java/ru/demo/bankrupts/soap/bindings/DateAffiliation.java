
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateAffiliation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAffiliation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateInclude" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateExclude" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CauseExclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAffiliation", propOrder = {
    "dateInclude",
    "dateExclude",
    "causeExclude"
})
public class DateAffiliation {

    @XmlElement(name = "DateInclude", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInclude;
    @XmlElement(name = "DateExclude", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExclude;
    @XmlElement(name = "CauseExclude")
    protected String causeExclude;

    /**
     * Gets the value of the dateInclude property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInclude() {
        return dateInclude;
    }

    /**
     * Sets the value of the dateInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInclude(XMLGregorianCalendar value) {
        this.dateInclude = value;
    }

    /**
     * Gets the value of the dateExclude property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExclude() {
        return dateExclude;
    }

    /**
     * Sets the value of the dateExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExclude(XMLGregorianCalendar value) {
        this.dateExclude = value;
    }

    /**
     * Gets the value of the causeExclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseExclude() {
        return causeExclude;
    }

    /**
     * Sets the value of the causeExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseExclude(String value) {
        this.causeExclude = value;
    }

}
