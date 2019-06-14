
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
 *         &lt;element name="getLabelsDataResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfItemtolabeldataresponse"/&gt;
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
    "getLabelsDataResult"
})
@XmlRootElement(name = "getLabelsDataResponse")
public class GetLabelsDataResponse {

    @XmlElement(required = true)
    protected ArrayOfItemtolabeldataresponse getLabelsDataResult;

    /**
     * Gets the value of the getLabelsDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemtolabeldataresponse }
     *     
     */
    public ArrayOfItemtolabeldataresponse getGetLabelsDataResult() {
        return getLabelsDataResult;
    }

    /**
     * Sets the value of the getLabelsDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemtolabeldataresponse }
     *     
     */
    public void setGetLabelsDataResult(ArrayOfItemtolabeldataresponse value) {
        this.getLabelsDataResult = value;
    }

}
