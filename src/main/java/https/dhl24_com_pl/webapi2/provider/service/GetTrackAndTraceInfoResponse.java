
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
 *         &lt;element name="getTrackAndTraceInfoResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}TrackAndTraceResponse"/&gt;
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
    "getTrackAndTraceInfoResult"
})
@XmlRootElement(name = "getTrackAndTraceInfoResponse")
public class GetTrackAndTraceInfoResponse {

    @XmlElement(required = true)
    protected TrackAndTraceResponse getTrackAndTraceInfoResult;

    /**
     * Gets the value of the getTrackAndTraceInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAndTraceResponse }
     *     
     */
    public TrackAndTraceResponse getGetTrackAndTraceInfoResult() {
        return getTrackAndTraceInfoResult;
    }

    /**
     * Sets the value of the getTrackAndTraceInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAndTraceResponse }
     *     
     */
    public void setGetTrackAndTraceInfoResult(TrackAndTraceResponse value) {
        this.getTrackAndTraceInfoResult = value;
    }

}
