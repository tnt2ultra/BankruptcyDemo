
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeOrganizerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeOrganizerList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradeOrganizerList" type="{http://tempuri.org/}ArrayOfCompanyTradeOrganizerRegisterItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeOrganizerList", propOrder = {
    "tradeOrganizerList"
})
public class TradeOrganizerList {

    @XmlElement(name = "TradeOrganizerList")
    protected ArrayOfCompanyTradeOrganizerRegisterItem tradeOrganizerList;

    /**
     * Gets the value of the tradeOrganizerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyTradeOrganizerRegisterItem }
     *     
     */
    public ArrayOfCompanyTradeOrganizerRegisterItem getTradeOrganizerList() {
        return tradeOrganizerList;
    }

    /**
     * Sets the value of the tradeOrganizerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyTradeOrganizerRegisterItem }
     *     
     */
    public void setTradeOrganizerList(ArrayOfCompanyTradeOrganizerRegisterItem value) {
        this.tradeOrganizerList = value;
    }

}
