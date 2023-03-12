
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
 *         &lt;element name="GetDebtorsByLastPublicationPeriodResult" type="{http://tempuri.org/}DebtorList" minOccurs="0"/&gt;
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
    "getDebtorsByLastPublicationPeriodResult"
})
@XmlRootElement(name = "GetDebtorsByLastPublicationPeriodResponse")
public class GetDebtorsByLastPublicationPeriodResponse {

    @XmlElement(name = "GetDebtorsByLastPublicationPeriodResult")
    protected DebtorList getDebtorsByLastPublicationPeriodResult;

    /**
     * Gets the value of the getDebtorsByLastPublicationPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorList }
     *     
     */
    public DebtorList getGetDebtorsByLastPublicationPeriodResult() {
        return getDebtorsByLastPublicationPeriodResult;
    }

    /**
     * Sets the value of the getDebtorsByLastPublicationPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorList }
     *     
     */
    public void setGetDebtorsByLastPublicationPeriodResult(DebtorList value) {
        this.getDebtorsByLastPublicationPeriodResult = value;
    }

}
