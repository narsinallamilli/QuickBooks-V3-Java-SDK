//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes a column
 * 
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ColType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MetaData" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Columns" type="{http://schema.intuit.com/finance/v3}Columns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "colTitle",
    "colType",
    "metaData",
    "columns"
})
public class Column implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ColTitle", required = true)
    protected String colTitle;
    @XmlElement(name = "ColType", required = true)
    protected String colType;
    @XmlElement(name = "MetaData")
    protected List<NameValue> metaData;
    @XmlElement(name = "Columns")
    protected Columns columns;

    /**
     * Gets the value of the colTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColTitle() {
        return colTitle;
    }

    /**
     * Sets the value of the colTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColTitle(String value) {
        this.colTitle = value;
    }

    /**
     * Gets the value of the colType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColType() {
        return colType;
    }

    /**
     * Sets the value of the colType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColType(String value) {
        this.colType = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getMetaData() {
        if (metaData == null) {
            metaData = new ArrayList<NameValue>();
        }
        return this.metaData;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link Columns }
     *     
     */
    public Columns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Columns }
     *     
     */
    public void setColumns(Columns value) {
        this.columns = value;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param metaData
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setMetaData(List<NameValue> metaData) {
        this.metaData = metaData;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Column that = ((Column) object);
        {
            String lhsColTitle;
            lhsColTitle = this.getColTitle();
            String rhsColTitle;
            rhsColTitle = that.getColTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colTitle", lhsColTitle), LocatorUtils.property(thatLocator, "colTitle", rhsColTitle), lhsColTitle, rhsColTitle, (this.colTitle!= null), (that.colTitle!= null))) {
                return false;
            }
        }
        {
            String lhsColType;
            lhsColType = this.getColType();
            String rhsColType;
            rhsColType = that.getColType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colType", lhsColType), LocatorUtils.property(thatLocator, "colType", rhsColType), lhsColType, rhsColType, (this.colType!= null), (that.colType!= null))) {
                return false;
            }
        }
        {
            List<NameValue> lhsMetaData;
            lhsMetaData = (((this.metaData!= null)&&(!this.metaData.isEmpty()))?this.getMetaData():null);
            List<NameValue> rhsMetaData;
            rhsMetaData = (((that.metaData!= null)&&(!that.metaData.isEmpty()))?that.getMetaData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metaData", lhsMetaData), LocatorUtils.property(thatLocator, "metaData", rhsMetaData), lhsMetaData, rhsMetaData, ((this.metaData!= null)&&(!this.metaData.isEmpty())), ((that.metaData!= null)&&(!that.metaData.isEmpty())))) {
                return false;
            }
        }
        {
            Columns lhsColumns;
            lhsColumns = this.getColumns();
            Columns rhsColumns;
            rhsColumns = that.getColumns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns, (this.columns!= null), (that.columns!= null))) {
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
            String theColTitle;
            theColTitle = this.getColTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colTitle", theColTitle), currentHashCode, theColTitle, (this.colTitle!= null));
        }
        {
            String theColType;
            theColType = this.getColType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colType", theColType), currentHashCode, theColType, (this.colType!= null));
        }
        {
            List<NameValue> theMetaData;
            theMetaData = (((this.metaData!= null)&&(!this.metaData.isEmpty()))?this.getMetaData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metaData", theMetaData), currentHashCode, theMetaData, ((this.metaData!= null)&&(!this.metaData.isEmpty())));
        }
        {
            Columns theColumns;
            theColumns = this.getColumns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns, (this.columns!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
