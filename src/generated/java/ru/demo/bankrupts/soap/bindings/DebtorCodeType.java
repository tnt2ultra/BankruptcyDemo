
package ru.demo.bankrupts.soap.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DebtorCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CompanyInn"/&gt;
 *     &lt;enumeration value="PersonInn"/&gt;
 *     &lt;enumeration value="Ogrn"/&gt;
 *     &lt;enumeration value="Ogrnip"/&gt;
 *     &lt;enumeration value="Snils"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebtorCodeType")
@XmlEnum
public enum DebtorCodeType {

    @XmlEnumValue("CompanyInn")
    COMPANY_INN("CompanyInn"),
    @XmlEnumValue("PersonInn")
    PERSON_INN("PersonInn"),
    @XmlEnumValue("Ogrn")
    OGRN("Ogrn"),
    @XmlEnumValue("Ogrnip")
    OGRNIP("Ogrnip"),
    @XmlEnumValue("Snils")
    SNILS("Snils");
    private final String value;

    DebtorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebtorCodeType fromValue(String v) {
        for (DebtorCodeType c: DebtorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
