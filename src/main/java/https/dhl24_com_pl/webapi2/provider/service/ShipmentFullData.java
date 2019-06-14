
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentFullData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentFullData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipper" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}AddressData"/&gt;
 *         &lt;element name="receiver" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReceiverAddressData"/&gt;
 *         &lt;element name="neighbour" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}NeighbourAddress"/&gt;
 *         &lt;element name="pieceList" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfPiecedefinition"/&gt;
 *         &lt;element name="payment" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}PaymentData"/&gt;
 *         &lt;element name="service" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ServiceDefinition"/&gt;
 *         &lt;element name="shipmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skipRestrictionCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentFullData", propOrder = {

})
public class ShipmentFullData {

    @XmlElement(required = true, nillable = true)
    protected AddressData shipper;
    @XmlElement(required = true, nillable = true)
    protected ReceiverAddressData receiver;
    @XmlElement(required = true, nillable = true)
    protected NeighbourAddress neighbour;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPiecedefinition pieceList;
    @XmlElement(required = true, nillable = true)
    protected PaymentData payment;
    @XmlElement(required = true, nillable = true)
    protected ServiceDefinition service;
    @XmlElement(required = true, nillable = true)
    protected String shipmentDate;
    protected boolean skipRestrictionCheck;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected String content;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer shipmentId;
    @XmlElement(required = true, nillable = true)
    protected String created;
    @XmlElement(required = true, nillable = true)
    protected String orderStatus;

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setShipper(AddressData value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverAddressData }
     *     
     */
    public ReceiverAddressData getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverAddressData }
     *     
     */
    public void setReceiver(ReceiverAddressData value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the neighbour property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourAddress }
     *     
     */
    public NeighbourAddress getNeighbour() {
        return neighbour;
    }

    /**
     * Sets the value of the neighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourAddress }
     *     
     */
    public void setNeighbour(NeighbourAddress value) {
        this.neighbour = value;
    }

    /**
     * Gets the value of the pieceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPiecedefinition }
     *     
     */
    public ArrayOfPiecedefinition getPieceList() {
        return pieceList;
    }

    /**
     * Sets the value of the pieceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPiecedefinition }
     *     
     */
    public void setPieceList(ArrayOfPiecedefinition value) {
        this.pieceList = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentData }
     *     
     */
    public PaymentData getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentData }
     *     
     */
    public void setPayment(PaymentData value) {
        this.payment = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinition }
     *     
     */
    public ServiceDefinition getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinition }
     *     
     */
    public void setService(ServiceDefinition value) {
        this.service = value;
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
     * Gets the value of the skipRestrictionCheck property.
     * 
     */
    public boolean isSkipRestrictionCheck() {
        return skipRestrictionCheck;
    }

    /**
     * Sets the value of the skipRestrictionCheck property.
     * 
     */
    public void setSkipRestrictionCheck(boolean value) {
        this.skipRestrictionCheck = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the shipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipmentId(Integer value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

}
