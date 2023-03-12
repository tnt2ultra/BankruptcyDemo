
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
 *         &lt;element name="GetCompanyTradeOrganizerRegisterResult" type="{http://tempuri.org/}TradeOrganizerList" minOccurs="0"/&gt;
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
    "getCompanyTradeOrganizerRegisterResult"
})
@XmlRootElement(name = "GetCompanyTradeOrganizerRegisterResponse")
public class GetCompanyTradeOrganizerRegisterResponse {

    @XmlElement(name = "GetCompanyTradeOrganizerRegisterResult")
    protected TradeOrganizerList getCompanyTradeOrganizerRegisterResult;

    /**
     * Gets the value of the getCompanyTradeOrganizerRegisterResult property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOrganizerList }
     *     
     */
    public TradeOrganizerList getGetCompanyTradeOrganizerRegisterResult() {
        return getCompanyTradeOrganizerRegisterResult;
    }

    /**
     * Sets the value of the getCompanyTradeOrganizerRegisterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOrganizerList }
     *     
     */
    public void setGetCompanyTradeOrganizerRegisterResult(TradeOrganizerList value) {
        this.getCompanyTradeOrganizerRegisterResult = value;
    }

}
