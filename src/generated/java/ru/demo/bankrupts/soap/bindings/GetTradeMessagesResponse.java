
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
 *         &lt;element name="GetTradeMessagesResult" type="{http://tempuri.org/}ArrayOfTradePlace" minOccurs="0"/&gt;
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
    "getTradeMessagesResult"
})
@XmlRootElement(name = "GetTradeMessagesResponse")
public class GetTradeMessagesResponse {

    @XmlElement(name = "GetTradeMessagesResult")
    protected ArrayOfTradePlace getTradeMessagesResult;

    /**
     * Gets the value of the getTradeMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTradePlace }
     *     
     */
    public ArrayOfTradePlace getGetTradeMessagesResult() {
        return getTradeMessagesResult;
    }

    /**
     * Sets the value of the getTradeMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTradePlace }
     *     
     */
    public void setGetTradeMessagesResult(ArrayOfTradePlace value) {
        this.getTradeMessagesResult = value;
    }

}
