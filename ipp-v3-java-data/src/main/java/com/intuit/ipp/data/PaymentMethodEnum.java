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
 * <p>Java class for PaymentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AmEx"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Check"/&gt;
 *     &lt;enumeration value="DebitCard"/&gt;
 *     &lt;enumeration value="Discover"/&gt;
 *     &lt;enumeration value="ECheck"/&gt;
 *     &lt;enumeration value="GiftCard"/&gt;
 *     &lt;enumeration value="MasterCard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="OtherCreditCard"/&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodEnum")
@XmlEnum
public enum PaymentMethodEnum {

    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("ECheck")
    E_CHECK("ECheck"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherCreditCard")
    OTHER_CREDIT_CARD("OtherCreditCard"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    PaymentMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodEnum fromValue(String v) {
        for (PaymentMethodEnum c: PaymentMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
