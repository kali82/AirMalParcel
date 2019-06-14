
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
 *         &lt;element name="getMyShipmentsResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfShipmentbasicdata"/&gt;
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
    "getMyShipmentsResult"
})
@XmlRootElement(name = "getMyShipmentsResponse")
public class GetMyShipmentsResponse {

    @XmlElement(required = true)
    protected ArrayOfShipmentbasicdata getMyShipmentsResult;

    /**
     * Gets the value of the getMyShipmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentbasicdata }
     *     
     */
    public ArrayOfShipmentbasicdata getGetMyShipmentsResult() {
        return getMyShipmentsResult;
    }

    /**
     * Sets the value of the getMyShipmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentbasicdata }
     *     
     */
    public void setGetMyShipmentsResult(ArrayOfShipmentbasicdata value) {
        this.getMyShipmentsResult = value;
    }

}
