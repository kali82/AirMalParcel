
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateReturnShipmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateReturnShipmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentInfo" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReturnShipmentInfo"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaryWaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ship" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReturnShip"/&gt;
 *         &lt;element name="pieceList" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfReturnpackage"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateReturnShipmentRequest", propOrder = {

})
public class CreateReturnShipmentRequest {

    @XmlElement(required = true, nillable = true)
    protected ReturnShipmentInfo shipmentInfo;
    @XmlElement(required = true, nillable = true)
    protected String content;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected String primaryWaybillNumber;
    @XmlElement(required = true, nillable = true)
    protected ReturnShip ship;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfReturnpackage pieceList;

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnShipmentInfo }
     *     
     */
    public ReturnShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnShipmentInfo }
     *     
     */
    public void setShipmentInfo(ReturnShipmentInfo value) {
        this.shipmentInfo = value;
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
     * Gets the value of the ship property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnShip }
     *     
     */
    public ReturnShip getShip() {
        return ship;
    }

    /**
     * Sets the value of the ship property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnShip }
     *     
     */
    public void setShip(ReturnShip value) {
        this.ship = value;
    }

    /**
     * Gets the value of the pieceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnpackage }
     *     
     */
    public ArrayOfReturnpackage getPieceList() {
        return pieceList;
    }

    /**
     * Sets the value of the pieceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnpackage }
     *     
     */
    public void setPieceList(ArrayOfReturnpackage value) {
        this.pieceList = value;
    }

}
