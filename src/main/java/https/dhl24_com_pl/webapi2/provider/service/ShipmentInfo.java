
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dropOffType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billing" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Billing"/&gt;
 *         &lt;element name="specialServices" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfService"/&gt;
 *         &lt;element name="shipmentTime" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ShipmentTime"/&gt;
 *         &lt;element name="labelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInfo", propOrder = {

})
public class ShipmentInfo {

    @XmlElement(required = true, nillable = true)
    protected String dropOffType;
    @XmlElement(required = true, nillable = true)
    protected String serviceType;
    @XmlElement(required = true, nillable = true)
    protected Billing billing;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfService specialServices;
    @XmlElement(required = true, nillable = true)
    protected ShipmentTime shipmentTime;
    @XmlElement(required = true, nillable = true)
    protected String labelType;

    /**
     * Gets the value of the dropOffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffType() {
        return dropOffType;
    }

    /**
     * Sets the value of the dropOffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffType(String value) {
        this.dropOffType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link Billing }
     *     
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Billing }
     *     
     */
    public void setBilling(Billing value) {
        this.billing = value;
    }

    /**
     * Gets the value of the specialServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfService }
     *     
     */
    public ArrayOfService getSpecialServices() {
        return specialServices;
    }

    /**
     * Sets the value of the specialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfService }
     *     
     */
    public void setSpecialServices(ArrayOfService value) {
        this.specialServices = value;
    }

    /**
     * Gets the value of the shipmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTime }
     *     
     */
    public ShipmentTime getShipmentTime() {
        return shipmentTime;
    }

    /**
     * Sets the value of the shipmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTime }
     *     
     */
    public void setShipmentTime(ShipmentTime value) {
        this.shipmentTime = value;
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

}
