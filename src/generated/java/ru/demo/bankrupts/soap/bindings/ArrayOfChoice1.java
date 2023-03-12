
package ru.demo.bankrupts.soap.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="DebtorPerson" type="{http://tempuri.org/}DebtorPerson"/&gt;
 *         &lt;element name="DebtorCompany" type="{http://tempuri.org/}DebtorCompany"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice1", propOrder = {
    "debtorPersonOrDebtorCompany"
})
public class ArrayOfChoice1 {

    @XmlElements({
        @XmlElement(name = "DebtorPerson", type = DebtorPerson.class, nillable = true),
        @XmlElement(name = "DebtorCompany", type = DebtorCompany.class, nillable = true)
    })
    protected List<DebtorRegisterItem> debtorPersonOrDebtorCompany;

    /**
     * Gets the value of the debtorPersonOrDebtorCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtorPersonOrDebtorCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtorPersonOrDebtorCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtorCompany }
     * {@link DebtorPerson }
     * 
     * 
     */
    public List<DebtorRegisterItem> getDebtorPersonOrDebtorCompany() {
        if (debtorPersonOrDebtorCompany == null) {
            debtorPersonOrDebtorCompany = new ArrayList<DebtorRegisterItem>();
        }
        return this.debtorPersonOrDebtorCompany;
    }

}
