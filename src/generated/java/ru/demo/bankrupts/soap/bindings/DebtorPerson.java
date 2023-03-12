
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}DebtorRegisterItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameHistory" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OGRNIP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Birthplace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SNILS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorPerson", propOrder = {
    "nameHistory"
})
public class DebtorPerson
    extends DebtorRegisterItem
{

    @XmlElement(name = "NameHistory")
    protected ArrayOfString nameHistory;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "MiddleName")
    protected String middleName;
    @XmlAttribute(name = "OGRNIP")
    protected String ogrnip;
    @XmlAttribute(name = "Birthdate")
    protected String birthdate;
    @XmlAttribute(name = "Birthplace")
    protected String birthplace;
    @XmlAttribute(name = "SNILS")
    protected String snils;
    @XmlAttribute(name = "Address")
    protected String address;

    /**
     * Gets the value of the nameHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getNameHistory() {
        return nameHistory;
    }

    /**
     * Sets the value of the nameHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setNameHistory(ArrayOfString value) {
        this.nameHistory = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the ogrnip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRNIP() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRNIP(String value) {
        this.ogrnip = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the birthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * Sets the value of the birthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplace(String value) {
        this.birthplace = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
