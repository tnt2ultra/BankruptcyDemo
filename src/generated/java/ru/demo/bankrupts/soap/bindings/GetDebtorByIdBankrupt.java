
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
 *         &lt;element name="idBankrupt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "idBankrupt"
})
@XmlRootElement(name = "GetDebtorByIdBankrupt")
public class GetDebtorByIdBankrupt {

    protected int idBankrupt;

    /**
     * Gets the value of the idBankrupt property.
     * 
     */
    public int getIdBankrupt() {
        return idBankrupt;
    }

    /**
     * Sets the value of the idBankrupt property.
     * 
     */
    public void setIdBankrupt(int value) {
        this.idBankrupt = value;
    }

}
