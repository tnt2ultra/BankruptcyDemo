
package ru.demo.bankrupts.soap.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTradePlace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTradePlace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradePlace" type="{http://tempuri.org/}TradePlace" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTradePlace", propOrder = {
    "tradePlace"
})
public class ArrayOfTradePlace {

    @XmlElement(name = "TradePlace", nillable = true)
    protected List<TradePlace> tradePlace;

    /**
     * Gets the value of the tradePlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradePlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradePlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradePlace }
     * 
     * 
     */
    public List<TradePlace> getTradePlace() {
        if (tradePlace == null) {
            tradePlace = new ArrayList<TradePlace>();
        }
        return this.tradePlace;
    }

}
