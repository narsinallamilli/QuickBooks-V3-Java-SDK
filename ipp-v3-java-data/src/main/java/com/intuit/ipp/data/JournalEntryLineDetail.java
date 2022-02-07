//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: JournalEntry detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for JournalEntryLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostingType" type="{http://schema.intuit.com/finance/v3}PostingTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="Entity" type="{http://schema.intuit.com/finance/v3}EntityTypeRef" minOccurs="0"/&gt;
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxApplicableOn" type="{http://schema.intuit.com/finance/v3}TaxApplicableOnEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxInclusiveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BillableStatus" type="{http://schema.intuit.com/finance/v3}BillableStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="JournalCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="JournalEntryLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryLineDetail", propOrder = {
    "postingType",
    "entity",
    "accountRef",
    "classRef",
    "departmentRef",
    "taxCodeRef",
    "taxRateRef",
    "taxApplicableOn",
    "taxAmount",
    "taxInclusiveAmt",
    "billableStatus",
    "journalCodeRef",
    "journalEntryLineDetailEx"
})
public class JournalEntryLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PostingType")
    @XmlSchemaType(name = "string")
    protected PostingTypeEnum postingType;
    @XmlElement(name = "Entity")
    protected EntityTypeRef entity;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "DepartmentRef")
    protected ReferenceType departmentRef;
    @XmlElement(name = "TaxCodeRef")
    protected ReferenceType taxCodeRef;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "TaxApplicableOn")
    @XmlSchemaType(name = "string")
    protected TaxApplicableOnEnum taxApplicableOn;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxInclusiveAmt")
    protected BigDecimal taxInclusiveAmt;
    @XmlElement(name = "BillableStatus")
    @XmlSchemaType(name = "string")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "JournalCodeRef")
    protected ReferenceType journalCodeRef;
    @XmlElement(name = "JournalEntryLineDetailEx")
    protected IntuitAnyType journalEntryLineDetailEx;

    /**
     * Gets the value of the postingType property.
     * 
     * @return
     *     possible object is
     *     {@link PostingTypeEnum }
     *     
     */
    public PostingTypeEnum getPostingType() {
        return postingType;
    }

    /**
     * Sets the value of the postingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTypeEnum }
     *     
     */
    public void setPostingType(PostingTypeEnum value) {
        this.postingType = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeRef }
     *     
     */
    public EntityTypeRef getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeRef }
     *     
     */
    public void setEntity(EntityTypeRef value) {
        this.entity = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the departmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Sets the value of the departmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepartmentRef(ReferenceType value) {
        this.departmentRef = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    /**
     * Sets the value of the taxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxCodeRef(ReferenceType value) {
        this.taxCodeRef = value;
    }

    /**
     * Gets the value of the taxRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxRateRef() {
        return taxRateRef;
    }

    /**
     * Sets the value of the taxRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxRateRef(ReferenceType value) {
        this.taxRateRef = value;
    }

    /**
     * Gets the value of the taxApplicableOn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public TaxApplicableOnEnum getTaxApplicableOn() {
        return taxApplicableOn;
    }

    /**
     * Sets the value of the taxApplicableOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public void setTaxApplicableOn(TaxApplicableOnEnum value) {
        this.taxApplicableOn = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxInclusiveAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    /**
     * Sets the value of the taxInclusiveAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxInclusiveAmt(BigDecimal value) {
        this.taxInclusiveAmt = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the journalCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getJournalCodeRef() {
        return journalCodeRef;
    }

    /**
     * Sets the value of the journalCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setJournalCodeRef(ReferenceType value) {
        this.journalCodeRef = value;
    }

    /**
     * Gets the value of the journalEntryLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getJournalEntryLineDetailEx() {
        return journalEntryLineDetailEx;
    }

    /**
     * Sets the value of the journalEntryLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setJournalEntryLineDetailEx(IntuitAnyType value) {
        this.journalEntryLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final JournalEntryLineDetail that = ((JournalEntryLineDetail) object);
        {
            PostingTypeEnum lhsPostingType;
            lhsPostingType = this.getPostingType();
            PostingTypeEnum rhsPostingType;
            rhsPostingType = that.getPostingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postingType", lhsPostingType), LocatorUtils.property(thatLocator, "postingType", rhsPostingType), lhsPostingType, rhsPostingType, (this.postingType!= null), (that.postingType!= null))) {
                return false;
            }
        }
        {
            EntityTypeRef lhsEntity;
            lhsEntity = this.getEntity();
            EntityTypeRef rhsEntity;
            rhsEntity = that.getEntity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entity", lhsEntity), LocatorUtils.property(thatLocator, "entity", rhsEntity), lhsEntity, rhsEntity, (this.entity!= null), (that.entity!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef, (this.accountRef!= null), (that.accountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDepartmentRef;
            lhsDepartmentRef = this.getDepartmentRef();
            ReferenceType rhsDepartmentRef;
            rhsDepartmentRef = that.getDepartmentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentRef", lhsDepartmentRef), LocatorUtils.property(thatLocator, "departmentRef", rhsDepartmentRef), lhsDepartmentRef, rhsDepartmentRef, (this.departmentRef!= null), (that.departmentRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxCodeRef;
            lhsTaxCodeRef = this.getTaxCodeRef();
            ReferenceType rhsTaxCodeRef;
            rhsTaxCodeRef = that.getTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeRef", lhsTaxCodeRef), LocatorUtils.property(thatLocator, "taxCodeRef", rhsTaxCodeRef), lhsTaxCodeRef, rhsTaxCodeRef, (this.taxCodeRef!= null), (that.taxCodeRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxRateRef;
            lhsTaxRateRef = this.getTaxRateRef();
            ReferenceType rhsTaxRateRef;
            rhsTaxRateRef = that.getTaxRateRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateRef", lhsTaxRateRef), LocatorUtils.property(thatLocator, "taxRateRef", rhsTaxRateRef), lhsTaxRateRef, rhsTaxRateRef, (this.taxRateRef!= null), (that.taxRateRef!= null))) {
                return false;
            }
        }
        {
            TaxApplicableOnEnum lhsTaxApplicableOn;
            lhsTaxApplicableOn = this.getTaxApplicableOn();
            TaxApplicableOnEnum rhsTaxApplicableOn;
            rhsTaxApplicableOn = that.getTaxApplicableOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxApplicableOn", lhsTaxApplicableOn), LocatorUtils.property(thatLocator, "taxApplicableOn", rhsTaxApplicableOn), lhsTaxApplicableOn, rhsTaxApplicableOn, (this.taxApplicableOn!= null), (that.taxApplicableOn!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxAmount;
            lhsTaxAmount = this.getTaxAmount();
            BigDecimal rhsTaxAmount;
            rhsTaxAmount = that.getTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount, (this.taxAmount!= null), (that.taxAmount!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxInclusiveAmt;
            lhsTaxInclusiveAmt = this.getTaxInclusiveAmt();
            BigDecimal rhsTaxInclusiveAmt;
            rhsTaxInclusiveAmt = that.getTaxInclusiveAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmt", lhsTaxInclusiveAmt), LocatorUtils.property(thatLocator, "taxInclusiveAmt", rhsTaxInclusiveAmt), lhsTaxInclusiveAmt, rhsTaxInclusiveAmt, (this.taxInclusiveAmt!= null), (that.taxInclusiveAmt!= null))) {
                return false;
            }
        }
        {
            BillableStatusEnum lhsBillableStatus;
            lhsBillableStatus = this.getBillableStatus();
            BillableStatusEnum rhsBillableStatus;
            rhsBillableStatus = that.getBillableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableStatus", lhsBillableStatus), LocatorUtils.property(thatLocator, "billableStatus", rhsBillableStatus), lhsBillableStatus, rhsBillableStatus, (this.billableStatus!= null), (that.billableStatus!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsJournalCodeRef;
            lhsJournalCodeRef = this.getJournalCodeRef();
            ReferenceType rhsJournalCodeRef;
            rhsJournalCodeRef = that.getJournalCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalCodeRef", lhsJournalCodeRef), LocatorUtils.property(thatLocator, "journalCodeRef", rhsJournalCodeRef), lhsJournalCodeRef, rhsJournalCodeRef, (this.journalCodeRef!= null), (that.journalCodeRef!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsJournalEntryLineDetailEx;
            lhsJournalEntryLineDetailEx = this.getJournalEntryLineDetailEx();
            IntuitAnyType rhsJournalEntryLineDetailEx;
            rhsJournalEntryLineDetailEx = that.getJournalEntryLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalEntryLineDetailEx", lhsJournalEntryLineDetailEx), LocatorUtils.property(thatLocator, "journalEntryLineDetailEx", rhsJournalEntryLineDetailEx), lhsJournalEntryLineDetailEx, rhsJournalEntryLineDetailEx, (this.journalEntryLineDetailEx!= null), (that.journalEntryLineDetailEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            PostingTypeEnum thePostingType;
            thePostingType = this.getPostingType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postingType", thePostingType), currentHashCode, thePostingType, (this.postingType!= null));
        }
        {
            EntityTypeRef theEntity;
            theEntity = this.getEntity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entity", theEntity), currentHashCode, theEntity, (this.entity!= null));
        }
        {
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef, (this.accountRef!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            ReferenceType theDepartmentRef;
            theDepartmentRef = this.getDepartmentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentRef", theDepartmentRef), currentHashCode, theDepartmentRef, (this.departmentRef!= null));
        }
        {
            ReferenceType theTaxCodeRef;
            theTaxCodeRef = this.getTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeRef", theTaxCodeRef), currentHashCode, theTaxCodeRef, (this.taxCodeRef!= null));
        }
        {
            ReferenceType theTaxRateRef;
            theTaxRateRef = this.getTaxRateRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateRef", theTaxRateRef), currentHashCode, theTaxRateRef, (this.taxRateRef!= null));
        }
        {
            TaxApplicableOnEnum theTaxApplicableOn;
            theTaxApplicableOn = this.getTaxApplicableOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxApplicableOn", theTaxApplicableOn), currentHashCode, theTaxApplicableOn, (this.taxApplicableOn!= null));
        }
        {
            BigDecimal theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount, (this.taxAmount!= null));
        }
        {
            BigDecimal theTaxInclusiveAmt;
            theTaxInclusiveAmt = this.getTaxInclusiveAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmt", theTaxInclusiveAmt), currentHashCode, theTaxInclusiveAmt, (this.taxInclusiveAmt!= null));
        }
        {
            BillableStatusEnum theBillableStatus;
            theBillableStatus = this.getBillableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableStatus", theBillableStatus), currentHashCode, theBillableStatus, (this.billableStatus!= null));
        }
        {
            ReferenceType theJournalCodeRef;
            theJournalCodeRef = this.getJournalCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalCodeRef", theJournalCodeRef), currentHashCode, theJournalCodeRef, (this.journalCodeRef!= null));
        }
        {
            IntuitAnyType theJournalEntryLineDetailEx;
            theJournalEntryLineDetailEx = this.getJournalEntryLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalEntryLineDetailEx", theJournalEntryLineDetailEx), currentHashCode, theJournalEntryLineDetailEx, (this.journalEntryLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
