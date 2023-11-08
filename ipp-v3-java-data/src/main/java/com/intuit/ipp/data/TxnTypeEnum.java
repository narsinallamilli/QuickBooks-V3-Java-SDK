//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TxnTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APCreditCard"/&gt;
 *     &lt;enumeration value="ARRefundCreditCard"/&gt;
 *     &lt;enumeration value="Bill"/&gt;
 *     &lt;enumeration value="BillPaymentCheck"/&gt;
 *     &lt;enumeration value="BuildAssembly"/&gt;
 *     &lt;enumeration value="CarryOver"/&gt;
 *     &lt;enumeration value="CashPurchase"/&gt;
 *     &lt;enumeration value="Charge"/&gt;
 *     &lt;enumeration value="Check"/&gt;
 *     &lt;enumeration value="CreditCardPayment"/&gt;
 *     &lt;enumeration value="CreditMemo"/&gt;
 *     &lt;enumeration value="Deposit"/&gt;
 *     &lt;enumeration value="EFPLiabilityCheck"/&gt;
 *     &lt;enumeration value="EFTBillPayment"/&gt;
 *     &lt;enumeration value="EFTRefund"/&gt;
 *     &lt;enumeration value="Estimate"/&gt;
 *     &lt;enumeration value="InventoryAdjustment"/&gt;
 *     &lt;enumeration value="InventoryTransfer"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="ItemReceipt"/&gt;
 *     &lt;enumeration value="JournalEntry"/&gt;
 *     &lt;enumeration value="LiabilityAdjustment"/&gt;
 *     &lt;enumeration value="Paycheck"/&gt;
 *     &lt;enumeration value="PayrollLiabilityCheck"/&gt;
 *     &lt;enumeration value="PurchaseOrder"/&gt;
 *     &lt;enumeration value="PriorPayment"/&gt;
 *     &lt;enumeration value="ReceivePayment"/&gt;
 *     &lt;enumeration value="RefundCheck"/&gt;
 *     &lt;enumeration value="ReimburseCharge"/&gt;
 *     &lt;enumeration value="SalesOrder"/&gt;
 *     &lt;enumeration value="SalesReceipt"/&gt;
 *     &lt;enumeration value="SalesTaxPaymentCheck"/&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *     &lt;enumeration value="TimeActivity"/&gt;
 *     &lt;enumeration value="VendorCredit"/&gt;
 *     &lt;enumeration value="YTDAdjustment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TxnTypeEnum")
@XmlEnum
public enum TxnTypeEnum {

    @XmlEnumValue("APCreditCard")
    AP_CREDIT_CARD("APCreditCard"),
    @XmlEnumValue("ARRefundCreditCard")
    AR_REFUND_CREDIT_CARD("ARRefundCreditCard"),
    @XmlEnumValue("Bill")
    BILL("Bill"),
    @XmlEnumValue("BillPaymentCheck")
    BILL_PAYMENT_CHECK("BillPaymentCheck"),
    @XmlEnumValue("BuildAssembly")
    BUILD_ASSEMBLY("BuildAssembly"),
    @XmlEnumValue("CarryOver")
    CARRY_OVER("CarryOver"),
    @XmlEnumValue("CashPurchase")
    CASH_PURCHASE("CashPurchase"),
    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("CreditCardPayment")
    CREDIT_CARD_PAYMENT("CreditCardPayment"),
    @XmlEnumValue("CreditMemo")
    CREDIT_MEMO("CreditMemo"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("EFPLiabilityCheck")
    EFP_LIABILITY_CHECK("EFPLiabilityCheck"),
    @XmlEnumValue("EFTBillPayment")
    EFT_BILL_PAYMENT("EFTBillPayment"),
    @XmlEnumValue("EFTRefund")
    EFT_REFUND("EFTRefund"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("InventoryAdjustment")
    INVENTORY_ADJUSTMENT("InventoryAdjustment"),
    @XmlEnumValue("InventoryTransfer")
    INVENTORY_TRANSFER("InventoryTransfer"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("ItemReceipt")
    ITEM_RECEIPT("ItemReceipt"),
    @XmlEnumValue("JournalEntry")
    JOURNAL_ENTRY("JournalEntry"),
    @XmlEnumValue("LiabilityAdjustment")
    LIABILITY_ADJUSTMENT("LiabilityAdjustment"),
    @XmlEnumValue("Paycheck")
    PAYCHECK("Paycheck"),
    @XmlEnumValue("PayrollLiabilityCheck")
    PAYROLL_LIABILITY_CHECK("PayrollLiabilityCheck"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("PriorPayment")
    PRIOR_PAYMENT("PriorPayment"),
    @XmlEnumValue("ReceivePayment")
    RECEIVE_PAYMENT("ReceivePayment"),
    @XmlEnumValue("RefundCheck")
    REFUND_CHECK("RefundCheck"),
    @XmlEnumValue("ReimburseCharge")
    REIMBURSE_CHARGE("ReimburseCharge"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesReceipt")
    SALES_RECEIPT("SalesReceipt"),
    @XmlEnumValue("SalesTaxPaymentCheck")
    SALES_TAX_PAYMENT_CHECK("SalesTaxPaymentCheck"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("TimeActivity")
    TIME_ACTIVITY("TimeActivity"),
    @XmlEnumValue("VendorCredit")
    VENDOR_CREDIT("VendorCredit"),
    @XmlEnumValue("YTDAdjustment")
    YTD_ADJUSTMENT("YTDAdjustment");
    private final String value;

    TxnTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TxnTypeEnum fromValue(String v) {
        for (TxnTypeEnum c: TxnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
