
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
 *         &lt;element name="GetTradeMessagesByTradeResult" type="{http://tempuri.org/}ArrayOfTradePlace" minOccurs="0"/&gt;
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
    "getTradeMessagesByTradeResult"
})
@XmlRootElement(name = "GetTradeMessagesByTradeResponse")
public class GetTradeMessagesByTradeResponse {

    @XmlElement(name = "GetTradeMessagesByTradeResult")
    protected ArrayOfTradePlace getTradeMessagesByTradeResult;

    /**
     * Gets the value of the getTradeMessagesByTradeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTradePlace }
     *     
     */
    public ArrayOfTradePlace getGetTradeMessagesByTradeResult() {
        return getTradeMessagesByTradeResult;
    }

    /**
     * Sets the value of the getTradeMessagesByTradeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTradePlace }
     *     
     */
    public void setGetTradeMessagesByTradeResult(ArrayOfTradePlace value) {
        this.getTradeMessagesByTradeResult = value;
    }

}
