
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
 *         &lt;element name="authData" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}AuthData"/&gt;
 *         &lt;element name="itemsToPrint" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfReturnitemtoprint"/&gt;
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
    "authData",
    "itemsToPrint"
})
@XmlRootElement(name = "getReturnByWaybill")
public class GetReturnByWaybill {

    @XmlElement(required = true)
    protected AuthData authData;
    @XmlElement(required = true)
    protected ArrayOfReturnitemtoprint itemsToPrint;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the itemsToPrint property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnitemtoprint }
     *     
     */
    public ArrayOfReturnitemtoprint getItemsToPrint() {
        return itemsToPrint;
    }

    /**
     * Sets the value of the itemsToPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnitemtoprint }
     *     
     */
    public void setItemsToPrint(ArrayOfReturnitemtoprint value) {
        this.itemsToPrint = value;
    }

}
