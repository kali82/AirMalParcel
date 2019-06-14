
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemToLabelDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemToLabelDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaryWaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dispatchNotificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelHeader" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billing" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Billing"/&gt;
 *         &lt;element name="shipmentTime" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ShipmentTimeLabelData"/&gt;
 *         &lt;element name="routing" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Routing"/&gt;
 *         &lt;element name="shipper" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ShipperAddressLabelData"/&gt;
 *         &lt;element name="receiver" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReceiverAddressLabelData"/&gt;
 *         &lt;element name="neighbour" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}NeighbourAddress"/&gt;
 *         &lt;element name="servicepoint" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ServicePoint"/&gt;
 *         &lt;element name="service" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}LabelDataServiceDefinition"/&gt;
 *         &lt;element name="pieceList" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfPiecedefinitionlabeldata"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemToLabelDataResponse", propOrder = {

})
public class ItemToLabelDataResponse {

    @XmlElement(required = true, nillable = true)
    protected String shipmentId;
    @XmlElement(required = true, nillable = true)
    protected String primaryWaybillNumber;
    @XmlElement(required = true, nillable = true)
    protected String dispatchNotificationNumber;
    @XmlElement(required = true, nillable = true)
    protected String labelHeader;
    @XmlElement(required = true, nillable = true)
    protected String content;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected Billing billing;
    @XmlElement(required = true, nillable = true)
    protected ShipmentTimeLabelData shipmentTime;
    @XmlElement(required = true, nillable = true)
    protected Routing routing;
    @XmlElement(required = true, nillable = true)
    protected ShipperAddressLabelData shipper;
    @XmlElement(required = true, nillable = true)
    protected ReceiverAddressLabelData receiver;
    @XmlElement(required = true, nillable = true)
    protected NeighbourAddress neighbour;
    @XmlElement(required = true, nillable = true)
    protected ServicePoint servicepoint;
    @XmlElement(required = true, nillable = true)
    protected LabelDataServiceDefinition service;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPiecedefinitionlabeldata pieceList;

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
     * Gets the value of the primaryWaybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWaybillNumber() {
        return primaryWaybillNumber;
    }

    /**
     * Sets the value of the primaryWaybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWaybillNumber(String value) {
        this.primaryWaybillNumber = value;
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
     * Gets the value of the labelHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelHeader() {
        return labelHeader;
    }

    /**
     * Sets the value of the labelHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelHeader(String value) {
        this.labelHeader = value;
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
     * Gets the value of the shipmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTimeLabelData }
     *     
     */
    public ShipmentTimeLabelData getShipmentTime() {
        return shipmentTime;
    }

    /**
     * Sets the value of the shipmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTimeLabelData }
     *     
     */
    public void setShipmentTime(ShipmentTimeLabelData value) {
        this.shipmentTime = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setRouting(Routing value) {
        this.routing = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperAddressLabelData }
     *     
     */
    public ShipperAddressLabelData getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperAddressLabelData }
     *     
     */
    public void setShipper(ShipperAddressLabelData value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverAddressLabelData }
     *     
     */
    public ReceiverAddressLabelData getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverAddressLabelData }
     *     
     */
    public void setReceiver(ReceiverAddressLabelData value) {
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
     * Gets the value of the servicepoint property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePoint }
     *     
     */
    public ServicePoint getServicepoint() {
        return servicepoint;
    }

    /**
     * Sets the value of the servicepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePoint }
     *     
     */
    public void setServicepoint(ServicePoint value) {
        this.servicepoint = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link LabelDataServiceDefinition }
     *     
     */
    public LabelDataServiceDefinition getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelDataServiceDefinition }
     *     
     */
    public void setService(LabelDataServiceDefinition value) {
        this.service = value;
    }

    /**
     * Gets the value of the pieceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPiecedefinitionlabeldata }
     *     
     */
    public ArrayOfPiecedefinitionlabeldata getPieceList() {
        return pieceList;
    }

    /**
     * Sets the value of the pieceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPiecedefinitionlabeldata }
     *     
     */
    public void setPieceList(ArrayOfPiecedefinitionlabeldata value) {
        this.pieceList = value;
    }

}
