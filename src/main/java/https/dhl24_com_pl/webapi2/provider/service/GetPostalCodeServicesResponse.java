
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
 *         &lt;element name="getPostalCodeServicesResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}PostalCodeServicesResponse"/&gt;
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
    "getPostalCodeServicesResult"
})
@XmlRootElement(name = "getPostalCodeServicesResponse")
public class GetPostalCodeServicesResponse {

    @XmlElement(required = true)
    protected PostalCodeServicesResponse getPostalCodeServicesResult;

    /**
     * Gets the value of the getPostalCodeServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeServicesResponse }
     *     
     */
    public PostalCodeServicesResponse getGetPostalCodeServicesResult() {
        return getPostalCodeServicesResult;
    }

    /**
     * Sets the value of the getPostalCodeServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeServicesResponse }
     *     
     */
    public void setGetPostalCodeServicesResult(PostalCodeServicesResponse value) {
        this.getPostalCodeServicesResult = value;
    }

}
