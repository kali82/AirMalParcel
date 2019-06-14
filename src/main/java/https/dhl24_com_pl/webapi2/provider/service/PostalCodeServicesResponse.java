
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalCodeServicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalCodeServicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="domesticExpress9" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="domesticExpress12" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliveryEvening" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pickupOnSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliverySaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="exPickupFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exPickupTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drPickupFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drPickupTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalCodeServicesResponse", propOrder = {

})
public class PostalCodeServicesResponse {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean domesticExpress9;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean domesticExpress12;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deliveryEvening;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean pickupOnSaturday;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deliverySaturday;
    @XmlElement(required = true, nillable = true)
    protected String exPickupFrom;
    @XmlElement(required = true, nillable = true)
    protected String exPickupTo;
    @XmlElement(required = true, nillable = true)
    protected String drPickupFrom;
    @XmlElement(required = true, nillable = true)
    protected String drPickupTo;

    /**
     * Gets the value of the domesticExpress9 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomesticExpress9() {
        return domesticExpress9;
    }

    /**
     * Sets the value of the domesticExpress9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomesticExpress9(Boolean value) {
        this.domesticExpress9 = value;
    }

    /**
     * Gets the value of the domesticExpress12 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomesticExpress12() {
        return domesticExpress12;
    }

    /**
     * Sets the value of the domesticExpress12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomesticExpress12(Boolean value) {
        this.domesticExpress12 = value;
    }

    /**
     * Gets the value of the deliveryEvening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryEvening() {
        return deliveryEvening;
    }

    /**
     * Sets the value of the deliveryEvening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryEvening(Boolean value) {
        this.deliveryEvening = value;
    }

    /**
     * Gets the value of the pickupOnSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupOnSaturday() {
        return pickupOnSaturday;
    }

    /**
     * Sets the value of the pickupOnSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupOnSaturday(Boolean value) {
        this.pickupOnSaturday = value;
    }

    /**
     * Gets the value of the deliverySaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliverySaturday() {
        return deliverySaturday;
    }

    /**
     * Sets the value of the deliverySaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliverySaturday(Boolean value) {
        this.deliverySaturday = value;
    }

    /**
     * Gets the value of the exPickupFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExPickupFrom() {
        return exPickupFrom;
    }

    /**
     * Sets the value of the exPickupFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExPickupFrom(String value) {
        this.exPickupFrom = value;
    }

    /**
     * Gets the value of the exPickupTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExPickupTo() {
        return exPickupTo;
    }

    /**
     * Sets the value of the exPickupTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExPickupTo(String value) {
        this.exPickupTo = value;
    }

    /**
     * Gets the value of the drPickupFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrPickupFrom() {
        return drPickupFrom;
    }

    /**
     * Sets the value of the drPickupFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrPickupFrom(String value) {
        this.drPickupFrom = value;
    }

    /**
     * Gets the value of the drPickupTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrPickupTo() {
        return drPickupTo;
    }

    /**
     * Sets the value of the drPickupTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrPickupTo(String value) {
        this.drPickupTo = value;
    }

}
