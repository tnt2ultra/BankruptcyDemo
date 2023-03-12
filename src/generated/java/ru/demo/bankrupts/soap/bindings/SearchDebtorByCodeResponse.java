
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
 *         &lt;element name="SearchDebtorByCodeResult" type="{http://tempuri.org/}DebtorList" minOccurs="0"/&gt;
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
    "searchDebtorByCodeResult"
})
@XmlRootElement(name = "SearchDebtorByCodeResponse")
public class SearchDebtorByCodeResponse {

    @XmlElement(name = "SearchDebtorByCodeResult")
    protected DebtorList searchDebtorByCodeResult;

    /**
     * Gets the value of the searchDebtorByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorList }
     *     
     */
    public DebtorList getSearchDebtorByCodeResult() {
        return searchDebtorByCodeResult;
    }

    /**
     * Sets the value of the searchDebtorByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorList }
     *     
     */
    public void setSearchDebtorByCodeResult(DebtorList value) {
        this.searchDebtorByCodeResult = value;
    }

}
