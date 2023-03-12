
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSroRegisterResult" type="{http://tempuri.org/}SROList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSroRegisterResult"
})
@XmlRootElement(name = "GetSroRegisterResponse")
public class GetSroRegisterResponse {

    @XmlElement(name = "GetSroRegisterResult")
    protected SROList getSroRegisterResult;

    /**
     * Gets the value of the getSroRegisterResult property.
     * 
     * @return
     *     possible object is
     *     {@link SROList }
     *     
     */
    public SROList getGetSroRegisterResult() {
        return getSroRegisterResult;
    }

    /**
     * Sets the value of the getSroRegisterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SROList }
     *     
     */
    public void setGetSroRegisterResult(SROList value) {
        this.getSroRegisterResult = value;
    }

}
