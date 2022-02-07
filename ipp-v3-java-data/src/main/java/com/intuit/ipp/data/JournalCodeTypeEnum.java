//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournalCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JournalCodeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Expenses"/&gt;
 *     &lt;enumeration value="Sales"/&gt;
 *     &lt;enumeration value="Bank"/&gt;
 *     &lt;enumeration value="Nouveaux"/&gt;
 *     &lt;enumeration value="Wages"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JournalCodeTypeEnum")
@XmlEnum
public enum JournalCodeTypeEnum {

    @XmlEnumValue("Expenses")
    EXPENSES("Expenses"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Nouveaux")
    NOUVEAUX("Nouveaux"),
    @XmlEnumValue("Wages")
    WAGES("Wages"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    JournalCodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JournalCodeTypeEnum fromValue(String v) {
        for (JournalCodeTypeEnum c: JournalCodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
