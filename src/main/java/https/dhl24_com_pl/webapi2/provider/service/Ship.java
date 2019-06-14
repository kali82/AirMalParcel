
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipper" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Addressat"/&gt;
 *         &lt;element name="receiver" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}ReceiverAddressat"/&gt;
 *         &lt;element name="neighbour" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}NeighbourAddress"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ship", propOrder = {

})
public class Ship {

    @XmlElement(required = true, nillable = true)
    protected Addressat shipper;
    @XmlElement(required = true, nillable = true)
    protected ReceiverAddressat receiver;
    @XmlElement(required = true, nillable = true)
    protected NeighbourAddress neighbour;

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link Addressat }
     *     
     */
    public Addressat getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addressat }
     *     
     */
    public void setShipper(Addressat value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverAddressat }
     *     
     */
    public ReceiverAddressat getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverAddressat }
     *     
     */
    public void setReceiver(ReceiverAddressat value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the neighbour property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourAddress }
     *     
     */
    public NeighbourAddress getNeighbour() {
        return neighbour;
    }

    /**
     * Sets the value of the neighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourAddress }
     *     
     */
    public void setNeighbour(NeighbourAddress value) {
        this.neighbour = value;
    }

}
