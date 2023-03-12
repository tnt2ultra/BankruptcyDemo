
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idTradeMessage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "idTradeMessage"
})
@XmlRootElement(name = "GetTradeMessageContent")
public class GetTradeMessageContent {

    protected int idTradeMessage;

    /**
     * Gets the value of the idTradeMessage property.
     * 
     */
    public int getIdTradeMessage() {
        return idTradeMessage;
    }

    /**
     * Sets the value of the idTradeMessage property.
     * 
     */
    public void setIdTradeMessage(int value) {
        this.idTradeMessage = value;
    }

}
