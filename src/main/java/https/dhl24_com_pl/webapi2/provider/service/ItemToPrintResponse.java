
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemToPrintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemToPrintResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemToPrintResponse", propOrder = {

})
public class ItemToPrintResponse {

    @XmlElement(required = true, nillable = true)
    protected String shipmentId;
    @XmlElement(required = true, nillable = true)
    protected String labelType;
    @XmlElement(required = true, nillable = true)
    protected String labelName;
    @XmlElement(required = true, nillable = true)
    protected String labelData;
    @XmlElement(required = true, nillable = true)
    protected String labelMimeType;

    /**
     * Gets the value of the shipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentId(String value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the labelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelType() {
        return labelType;
    }

    /**
     * Sets the value of the labelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelType(String value) {
        this.labelType = value;
    }

    /**
     * Gets the value of the labelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * Sets the value of the labelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelName(String value) {
        this.labelName = value;
    }

    /**
     * Gets the value of the labelData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelData() {
        return labelData;
    }

    /**
     * Sets the value of the labelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelData(String value) {
        this.labelData = value;
    }

    /**
     * Gets the value of the labelMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelMimeType() {
        return labelMimeType;
    }

    /**
     * Sets the value of the labelMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelMimeType(String value) {
        this.labelMimeType = value;
    }

}
