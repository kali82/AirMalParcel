
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
 *         &lt;element name="getReturnParamsResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}GetReturnParamsResponse"/&gt;
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
    "getReturnParamsResult"
})
@XmlRootElement(name = "getReturnParamsResponse")
public class GetReturnParamsResponse {

    @XmlElement(required = true)
    protected GetReturnParamsResponse2 getReturnParamsResult;

    /**
     * Gets the value of the getReturnParamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetReturnParamsResponse2 }
     *     
     */
    public GetReturnParamsResponse2 getGetReturnParamsResult() {
        return getReturnParamsResult;
    }

    /**
     * Sets the value of the getReturnParamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReturnParamsResponse2 }
     *     
     */
    public void setGetReturnParamsResult(GetReturnParamsResponse2 value) {
        this.getReturnParamsResult = value;
    }

}
