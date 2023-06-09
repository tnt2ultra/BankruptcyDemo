
package ru.demo.bankrupts.soap.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSroRegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSroRegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SRO" type="{http://tempuri.org/}SroRegisterItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSroRegisterItem", propOrder = {
    "sro"
})
public class ArrayOfSroRegisterItem {

    @XmlElement(name = "SRO", nillable = true)
    protected List<SroRegisterItem> sro;

    /**
     * Gets the value of the sro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SroRegisterItem }
     * 
     * 
     */
    public List<SroRegisterItem> getSRO() {
        if (sro == null) {
            sro = new ArrayList<SroRegisterItem>();
        }
        return this.sro;
    }

}
