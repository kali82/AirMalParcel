
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getMyShipmentsCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getMyShipmentsCountResult"
})
@XmlRootElement(name = "getMyShipmentsCountResponse")
public class GetMyShipmentsCountResponse {

    protected int getMyShipmentsCountResult;

    /**
     * Gets the value of the getMyShipmentsCountResult property.
     * 
     */
    public int getGetMyShipmentsCountResult() {
        return getMyShipmentsCountResult;
    }

    /**
     * Sets the value of the getMyShipmentsCountResult property.
     * 
     */
    public void setGetMyShipmentsCountResult(int value) {
        this.getMyShipmentsCountResult = value;
    }

}
