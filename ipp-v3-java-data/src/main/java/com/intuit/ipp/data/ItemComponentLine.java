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
 * 				Description: Constituent line of a
 * 				group item.
 * 			
 * 
 * <p>Java class for ItemComponentLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemComponentLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UOMRef" type="{http://schema.intuit.com/finance/v3}UOMRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemComponentLine", propOrder = {
    "itemRef",
    "qty",
    "uomRef"
})
public class ItemComponentLine implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UOMRef")
    protected UOMRef uomRef;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the uomRef property.
     * 
     * @return
     *     possible object is
     *     {@link UOMRef }
     *     
     */
    public UOMRef getUOMRef() {
        return uomRef;
    }

    /**
     * Sets the value of the uomRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMRef }
     *     
     */
    public void setUOMRef(UOMRef value) {
        this.uomRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemComponentLine that = ((ItemComponentLine) object);
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef, (this.itemRef!= null), (that.itemRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsQty;
            lhsQty = this.getQty();
            BigDecimal rhsQty;
            rhsQty = that.getQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qty", lhsQty), LocatorUtils.property(thatLocator, "qty", rhsQty), lhsQty, rhsQty, (this.qty!= null), (that.qty!= null))) {
                return false;
            }
        }
        {
            UOMRef lhsUOMRef;
            lhsUOMRef = this.getUOMRef();
            UOMRef rhsUOMRef;
            rhsUOMRef = that.getUOMRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomRef", lhsUOMRef), LocatorUtils.property(thatLocator, "uomRef", rhsUOMRef), lhsUOMRef, rhsUOMRef, (this.uomRef!= null), (that.uomRef!= null))) {
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
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef, (this.itemRef!= null));
        }
        {
            BigDecimal theQty;
            theQty = this.getQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qty", theQty), currentHashCode, theQty, (this.qty!= null));
        }
        {
            UOMRef theUOMRef;
            theUOMRef = this.getUOMRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomRef", theUOMRef), currentHashCode, theUOMRef, (this.uomRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
