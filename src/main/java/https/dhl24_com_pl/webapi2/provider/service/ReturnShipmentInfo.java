
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnShipmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnShipmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookCourier" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="billing" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Billing"/&gt;
 *         &lt;element name="specialServices" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfReturnservice"/&gt;
 *         &lt;element name="shipmentTime" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReturnShipmentTime"/&gt;
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
@XmlType(name = "ReturnShipmentInfo", propOrder = {

})
public class ReturnShipmentInfo {

    @XmlElement(required = true, nillable = true)
    protected String serviceType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bookCourier;
    @XmlElement(required = true, nillable = true)
    protected Billing billing;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfReturnservice specialServices;
    @XmlElement(required = true, nillable = true)
    protected ReturnShipmentTime shipmentTime;
    @XmlElement(required = true, nillable = true)
    protected String labelType;

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
     * Gets the value of the bookCourier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookCourier() {
        return bookCourier;
    }

    /**
     * Sets the value of the bookCourier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookCourier(Boolean value) {
        this.bookCourier = value;
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
     *     {@link ArrayOfReturnservice }
     *     
     */
    public ArrayOfReturnservice getSpecialServices() {
        return specialServices;
    }

    /**
     * Sets the value of the specialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnservice }
     *     
     */
    public void setSpecialServices(ArrayOfReturnservice value) {
        this.specialServices = value;
    }

    /**
     * Gets the value of the shipmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnShipmentTime }
     *     
     */
    public ReturnShipmentTime getShipmentTime() {
        return shipmentTime;
    }

    /**
     * Sets the value of the shipmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnShipmentTime }
     *     
     */
    public void setShipmentTime(ReturnShipmentTime value) {
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
