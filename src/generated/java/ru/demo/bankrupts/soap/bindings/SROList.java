
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SROList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SROList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SROList" type="{http://tempuri.org/}ArrayOfSroRegisterItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SROList", propOrder = {
    "sroList"
})
public class SROList {

    @XmlElement(name = "SROList")
    protected ArrayOfSroRegisterItem sroList;

    /**
     * Gets the value of the sroList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSroRegisterItem }
     *     
     */
    public ArrayOfSroRegisterItem getSROList() {
        return sroList;
    }

    /**
     * Sets the value of the sroList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSroRegisterItem }
     *     
     */
    public void setSROList(ArrayOfSroRegisterItem value) {
        this.sroList = value;
    }

}
