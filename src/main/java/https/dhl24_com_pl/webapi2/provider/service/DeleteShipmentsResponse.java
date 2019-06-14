
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
 *         &lt;element name="deleteShipmentsResult" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfDeletenotification"/&gt;
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
    "deleteShipmentsResult"
})
@XmlRootElement(name = "deleteShipmentsResponse")
public class DeleteShipmentsResponse {

    @XmlElement(required = true)
    protected ArrayOfDeletenotification deleteShipmentsResult;

    /**
     * Gets the value of the deleteShipmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeletenotification }
     *     
     */
    public ArrayOfDeletenotification getDeleteShipmentsResult() {
        return deleteShipmentsResult;
    }

    /**
     * Sets the value of the deleteShipmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeletenotification }
     *     
     */
    public void setDeleteShipmentsResult(ArrayOfDeletenotification value) {
        this.deleteShipmentsResult = value;
    }

}
