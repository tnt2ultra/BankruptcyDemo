
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMList" type="{http://tempuri.org/}ArrayOfArbitrManagerRegisterItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMList", propOrder = {
    "amList"
})
public class AMList {

    @XmlElement(name = "AMList")
    protected ArrayOfArbitrManagerRegisterItem amList;

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

}
