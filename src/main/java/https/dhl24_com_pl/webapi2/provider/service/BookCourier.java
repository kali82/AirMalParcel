
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authData" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}AuthData"/&gt;
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pickupTimeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pickupTimeTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentIdList" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfString"/&gt;
 *         &lt;element name="shipmentOrderInfo" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ShipmentOrderInfo"/&gt;
 *         &lt;element name="courierWithLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authData",
    "pickupDate",
    "pickupTimeFrom",
    "pickupTimeTo",
    "additionalInfo",
    "shipmentIdList",
    "shipmentOrderInfo",
    "courierWithLabel"
})
@XmlRootElement(name = "bookCourier")
public class BookCourier {

    @XmlElement(required = true, nillable = true)
    protected AuthData authData;
    @XmlElement(required = true, nillable = true)
    protected String pickupDate;
    @XmlElement(required = true, nillable = true)
    protected String pickupTimeFrom;
    @XmlElement(required = true, nillable = true)
    protected String pickupTimeTo;
    @XmlElement(required = true, nillable = true)
    protected String additionalInfo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString shipmentIdList;
    @XmlElement(required = true, nillable = true)
    protected ShipmentOrderInfo shipmentOrderInfo;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean courierWithLabel;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the pickupTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeFrom() {
        return pickupTimeFrom;
    }

    /**
     * Sets the value of the pickupTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeFrom(String value) {
        this.pickupTimeFrom = value;
    }

    /**
     * Gets the value of the pickupTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeTo() {
        return pickupTimeTo;
    }

    /**
     * Sets the value of the pickupTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeTo(String value) {
        this.pickupTimeTo = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the shipmentIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getShipmentIdList() {
        return shipmentIdList;
    }

    /**
     * Sets the value of the shipmentIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setShipmentIdList(ArrayOfString value) {
        this.shipmentIdList = value;
    }

    /**
     * Gets the value of the shipmentOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderInfo }
     *     
     */
    public ShipmentOrderInfo getShipmentOrderInfo() {
        return shipmentOrderInfo;
    }

    /**
     * Sets the value of the shipmentOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderInfo }
     *     
     */
    public void setShipmentOrderInfo(ShipmentOrderInfo value) {
        this.shipmentOrderInfo = value;
    }

    /**
     * Gets the value of the courierWithLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCourierWithLabel() {
        return courierWithLabel;
    }

    /**
     * Sets the value of the courierWithLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCourierWithLabel(Boolean value) {
        this.courierWithLabel = value;
    }

}
