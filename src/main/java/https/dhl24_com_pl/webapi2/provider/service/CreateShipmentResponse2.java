
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateShipmentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentNotificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="packagesTrackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dispatchNotificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Label"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateShipmentResponse", propOrder = {

})
public class CreateShipmentResponse2 {

    @XmlElement(required = true, nillable = true)
    protected String shipmentNotificationNumber;
    @XmlElement(required = true, nillable = true)
    protected String shipmentTrackingNumber;
    @XmlElement(required = true, nillable = true)
    protected String packagesTrackingNumbers;
    @XmlElement(required = true, nillable = true)
    protected String dispatchNotificationNumber;
    @XmlElement(required = true, nillable = true)
    protected Label label;

    /**
     * Gets the value of the shipmentNotificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNotificationNumber() {
        return shipmentNotificationNumber;
    }

    /**
     * Sets the value of the shipmentNotificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNotificationNumber(String value) {
        this.shipmentNotificationNumber = value;
    }

    /**
     * Gets the value of the shipmentTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    /**
     * Sets the value of the shipmentTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingNumber(String value) {
        this.shipmentTrackingNumber = value;
    }

    /**
     * Gets the value of the packagesTrackingNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagesTrackingNumbers() {
        return packagesTrackingNumbers;
    }

    /**
     * Sets the value of the packagesTrackingNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagesTrackingNumbers(String value) {
        this.packagesTrackingNumbers = value;
    }

    /**
     * Gets the value of the dispatchNotificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchNotificationNumber() {
        return dispatchNotificationNumber;
    }

    /**
     * Sets the value of the dispatchNotificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchNotificationNumber(String value) {
        this.dispatchNotificationNumber = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

}
