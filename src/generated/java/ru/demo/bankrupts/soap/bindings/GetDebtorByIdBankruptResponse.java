
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
 *         &lt;element name="GetDebtorByIdBankruptResult" type="{http://tempuri.org/}DebtorRegisterItem" minOccurs="0"/&gt;
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
    "getDebtorByIdBankruptResult"
})
@XmlRootElement(name = "GetDebtorByIdBankruptResponse")
public class GetDebtorByIdBankruptResponse {

    @XmlElement(name = "GetDebtorByIdBankruptResult")
    protected DebtorRegisterItem getDebtorByIdBankruptResult;

    /**
     * Gets the value of the getDebtorByIdBankruptResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorRegisterItem }
     *     
     */
    public DebtorRegisterItem getGetDebtorByIdBankruptResult() {
        return getDebtorByIdBankruptResult;
    }

    /**
     * Sets the value of the getDebtorByIdBankruptResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorRegisterItem }
     *     
     */
    public void setGetDebtorByIdBankruptResult(DebtorRegisterItem value) {
        this.getDebtorByIdBankruptResult = value;
    }

}
