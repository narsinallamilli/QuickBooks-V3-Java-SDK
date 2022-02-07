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
 * <p>Java class for BillableStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillableStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Billable"/&gt;
 *     &lt;enumeration value="NotBillable"/&gt;
 *     &lt;enumeration value="HasBeenBilled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillableStatusEnum")
@XmlEnum
public enum BillableStatusEnum {

    @XmlEnumValue("Billable")
    BILLABLE("Billable"),
    @XmlEnumValue("NotBillable")
    NOT_BILLABLE("NotBillable"),
    @XmlEnumValue("HasBeenBilled")
    HAS_BEEN_BILLED("HasBeenBilled");
    private final String value;

    BillableStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillableStatusEnum fromValue(String v) {
        for (BillableStatusEnum c: BillableStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
