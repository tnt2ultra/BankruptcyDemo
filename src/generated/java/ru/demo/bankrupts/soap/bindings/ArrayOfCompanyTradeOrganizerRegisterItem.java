
package ru.demo.bankrupts.soap.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompanyTradeOrganizerRegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompanyTradeOrganizerRegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradeOrganizer" type="{http://tempuri.org/}CompanyTradeOrganizerRegisterItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompanyTradeOrganizerRegisterItem", propOrder = {
    "tradeOrganizer"
})
public class ArrayOfCompanyTradeOrganizerRegisterItem {

    @XmlElement(name = "TradeOrganizer", nillable = true)
    protected List<CompanyTradeOrganizerRegisterItem> tradeOrganizer;

    /**
     * Gets the value of the tradeOrganizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeOrganizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeOrganizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyTradeOrganizerRegisterItem }
     * 
     * 
     */
    public List<CompanyTradeOrganizerRegisterItem> getTradeOrganizer() {
        if (tradeOrganizer == null) {
            tradeOrganizer = new ArrayList<CompanyTradeOrganizerRegisterItem>();
        }
        return this.tradeOrganizer;
    }

}
