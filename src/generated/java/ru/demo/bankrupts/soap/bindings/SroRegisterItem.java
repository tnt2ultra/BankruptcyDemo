
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SroRegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SroRegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMList" type="{http://tempuri.org/}ArrayOfArbitrManagerRegisterItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SROID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateReg" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="INN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UrAdress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateExclude" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CauseExclude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateLastModif" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SroRegisterItem", propOrder = {
    "amList"
})
public class SroRegisterItem {

    @XmlElement(name = "AMList")
    protected ArrayOfArbitrManagerRegisterItem amList;
    @XmlAttribute(name = "SROID", required = true)
    protected int sroid;
    @XmlAttribute(name = "FullName")
    protected String fullName;
    @XmlAttribute(name = "RegNum")
    protected String regNum;
    @XmlAttribute(name = "DateReg", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReg;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "UrAdress")
    protected String urAdress;
    @XmlAttribute(name = "Phone")
    protected String phone;
    @XmlAttribute(name = "DateExclude")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExclude;
    @XmlAttribute(name = "CauseExclude")
    protected String causeExclude;
    @XmlAttribute(name = "DateLastModif", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModif;

    /**
     * Gets the value of the amList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArbitrManagerRegisterItem }
     *     
     */
    public ArrayOfArbitrManagerRegisterItem getAMList() {
        return amList;
    }

    /**
     * Sets the value of the amList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArbitrManagerRegisterItem }
     *     
     */
    public void setAMList(ArrayOfArbitrManagerRegisterItem value) {
        this.amList = value;
    }

    /**
     * Gets the value of the sroid property.
     * 
     */
    public int getSROID() {
        return sroid;
    }

    /**
     * Sets the value of the sroid property.
     * 
     */
    public void setSROID(int value) {
        this.sroid = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the dateReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReg() {
        return dateReg;
    }

    /**
     * Sets the value of the dateReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReg(XMLGregorianCalendar value) {
        this.dateReg = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the urAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrAdress() {
        return urAdress;
    }

    /**
     * Sets the value of the urAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrAdress(String value) {
        this.urAdress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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

    /**
     * Gets the value of the dateLastModif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Sets the value of the dateLastModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModif(XMLGregorianCalendar value) {
        this.dateLastModif = value;
    }

}
