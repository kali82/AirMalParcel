
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentTimeLabelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentTimeLabelData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="labelExpDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentStartHour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentEndHour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentTimeLabelData", propOrder = {

})
public class ShipmentTimeLabelData {

    @XmlElement(required = true, nillable = true)
    protected String labelExpDate;
    @XmlElement(required = true, nillable = true)
    protected String shipmentDate;
    @XmlElement(required = true, nillable = true)
    protected String shipmentStartHour;
    @XmlElement(required = true, nillable = true)
    protected String shipmentEndHour;

    /**
     * Gets the value of the labelExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelExpDate() {
        return labelExpDate;
    }

    /**
     * Sets the value of the labelExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelExpDate(String value) {
        this.labelExpDate = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDate(String value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the shipmentStartHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStartHour() {
        return shipmentStartHour;
    }

    /**
     * Sets the value of the shipmentStartHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStartHour(String value) {
        this.shipmentStartHour = value;
    }

    /**
     * Gets the value of the shipmentEndHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentEndHour() {
        return shipmentEndHour;
    }

    /**
     * Sets the value of the shipmentEndHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentEndHour(String value) {
        this.shipmentEndHour = value;
    }

}
