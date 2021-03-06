
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
 *         &lt;element name="shipments" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ArrayOfShipmentfulldata"/&gt;
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
    "shipments"
})
@XmlRootElement(name = "createShipments")
public class CreateShipments {

    @XmlElement(required = true, nillable = true)
    protected AuthData authData;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfShipmentfulldata shipments;

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
     * Gets the value of the shipments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentfulldata }
     *     
     */
    public ArrayOfShipmentfulldata getShipments() {
        return shipments;
    }

    /**
     * Sets the value of the shipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentfulldata }
     *     
     */
    public void setShipments(ArrayOfShipmentfulldata value) {
        this.shipments = value;
    }

}
