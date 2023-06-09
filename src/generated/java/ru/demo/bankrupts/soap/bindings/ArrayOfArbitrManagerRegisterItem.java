
package ru.demo.bankrupts.soap.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArbitrManagerRegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArbitrManagerRegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArbitrManager" type="{http://tempuri.org/}ArbitrManagerRegisterItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArbitrManagerRegisterItem", propOrder = {
    "arbitrManager"
})
public class ArrayOfArbitrManagerRegisterItem {

    @XmlElement(name = "ArbitrManager", nillable = true)
    protected List<ArbitrManagerRegisterItem> arbitrManager;

    /**
     * Gets the value of the arbitrManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arbitrManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArbitrManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArbitrManagerRegisterItem }
     * 
     * 
     */
    public List<ArbitrManagerRegisterItem> getArbitrManager() {
        if (arbitrManager == null) {
            arbitrManager = new ArrayList<ArbitrManagerRegisterItem>();
        }
        return this.arbitrManager;
    }

}
