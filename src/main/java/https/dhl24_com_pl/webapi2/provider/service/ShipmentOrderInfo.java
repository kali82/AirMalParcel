
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipper" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}AddressData"/&gt;
 *         &lt;element name="numberOfExPieces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numberOfDrPieces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heaviestPieceWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOrderInfo", propOrder = {

})
public class ShipmentOrderInfo {

    @XmlElement(required = true, nillable = true)
    protected AddressData shipper;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfExPieces;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numberOfDrPieces;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer totalWeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer heaviestPieceWeight;

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setShipper(AddressData value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the numberOfExPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfExPieces() {
        return numberOfExPieces;
    }

    /**
     * Sets the value of the numberOfExPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfExPieces(Integer value) {
        this.numberOfExPieces = value;
    }

    /**
     * Gets the value of the numberOfDrPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDrPieces() {
        return numberOfDrPieces;
    }

    /**
     * Sets the value of the numberOfDrPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDrPieces(Integer value) {
        this.numberOfDrPieces = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWeight(Integer value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the heaviestPieceWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeaviestPieceWeight() {
        return heaviestPieceWeight;
    }

    /**
     * Sets the value of the heaviestPieceWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeaviestPieceWeight(Integer value) {
        this.heaviestPieceWeight = value;
    }

}
