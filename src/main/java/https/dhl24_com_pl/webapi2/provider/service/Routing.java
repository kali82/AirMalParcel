
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Routing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Routing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="senderDepot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverDepot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="senderAps" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverAps" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tourId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Routing", propOrder = {

})
public class Routing {

    @XmlElement(required = true, nillable = true)
    protected String senderDepot;
    @XmlElement(required = true, nillable = true)
    protected String receiverDepot;
    @XmlElement(required = true, nillable = true)
    protected String senderAps;
    @XmlElement(required = true, nillable = true)
    protected String receiverAps;
    @XmlElement(required = true, nillable = true)
    protected String tourId;

    /**
     * Gets the value of the senderDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderDepot() {
        return senderDepot;
    }

    /**
     * Sets the value of the senderDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderDepot(String value) {
        this.senderDepot = value;
    }

    /**
     * Gets the value of the receiverDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverDepot() {
        return receiverDepot;
    }

    /**
     * Sets the value of the receiverDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverDepot(String value) {
        this.receiverDepot = value;
    }

    /**
     * Gets the value of the senderAps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAps() {
        return senderAps;
    }

    /**
     * Sets the value of the senderAps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAps(String value) {
        this.senderAps = value;
    }

    /**
     * Gets the value of the receiverAps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAps() {
        return receiverAps;
    }

    /**
     * Sets the value of the receiverAps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAps(String value) {
        this.receiverAps = value;
    }

    /**
     * Gets the value of the tourId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourId() {
        return tourId;
    }

    /**
     * Sets the value of the tourId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourId(String value) {
        this.tourId = value;
    }

}
