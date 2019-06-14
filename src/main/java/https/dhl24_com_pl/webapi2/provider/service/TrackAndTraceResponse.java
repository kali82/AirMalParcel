
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackAndTraceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackAndTraceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receivedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="events" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfTrackandtraceevent"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackAndTraceResponse", propOrder = {

})
public class TrackAndTraceResponse {

    @XmlElement(required = true, nillable = true)
    protected String shipmentId;
    @XmlElement(required = true, nillable = true)
    protected String receivedBy;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTrackandtraceevent events;

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
     * Gets the value of the receivedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    /**
     * Sets the value of the receivedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedBy(String value) {
        this.receivedBy = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackandtraceevent }
     *     
     */
    public ArrayOfTrackandtraceevent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackandtraceevent }
     *     
     */
    public void setEvents(ArrayOfTrackandtraceevent value) {
        this.events = value;
    }

}
