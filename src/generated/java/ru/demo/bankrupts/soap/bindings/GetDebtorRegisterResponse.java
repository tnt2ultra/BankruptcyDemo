
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
 *         &lt;element name="GetDebtorRegisterResult" type="{http://tempuri.org/}DebtorList" minOccurs="0"/&gt;
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
    "getDebtorRegisterResult"
})
@XmlRootElement(name = "GetDebtorRegisterResponse")
public class GetDebtorRegisterResponse {

    @XmlElement(name = "GetDebtorRegisterResult")
    protected DebtorList getDebtorRegisterResult;

    /**
     * Gets the value of the getDebtorRegisterResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorList }
     *     
     */
    public DebtorList getGetDebtorRegisterResult() {
        return getDebtorRegisterResult;
    }

    /**
     * Sets the value of the getDebtorRegisterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorList }
     *     
     */
    public void setGetDebtorRegisterResult(DebtorList value) {
        this.getDebtorRegisterResult = value;
    }

}
