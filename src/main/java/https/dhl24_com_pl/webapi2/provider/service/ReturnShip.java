
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnShip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnShip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipper" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReturnAddressat"/&gt;
 *         &lt;element name="receiver" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReturnAddressat"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnShip", propOrder = {

})
public class ReturnShip {

    @XmlElement(required = true, nillable = true)
    protected ReturnAddressat shipper;
    @XmlElement(required = true, nillable = true)
    protected ReturnAddressat receiver;

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAddressat }
     *     
     */
    public ReturnAddressat getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAddressat }
     *     
     */
    public void setShipper(ReturnAddressat value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAddressat }
     *     
     */
    public ReturnAddressat getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAddressat }
     *     
     */
    public void setReceiver(ReturnAddressat value) {
        this.receiver = value;
    }

}
