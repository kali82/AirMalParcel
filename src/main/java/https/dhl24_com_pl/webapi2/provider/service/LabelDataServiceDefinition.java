
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelDataServiceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelDataServiceDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryEvening" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliveryOnSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pickupOnSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="collectOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="collectOnDeliveryValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="collectOnDeliveryForm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectOnDeliveryReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="insuranceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="returnOnDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="returnOnDeliveryReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proofOfDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="selfCollect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="predeliveryInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliveryToNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelDataServiceDefinition", propOrder = {

})
public class LabelDataServiceDefinition {

    @XmlElement(required = true, nillable = true)
    protected String product;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deliveryEvening;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deliveryOnSaturday;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean pickupOnSaturday;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean collectOnDelivery;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float collectOnDeliveryValue;
    @XmlElement(required = true, nillable = true)
    protected String collectOnDeliveryForm;
    @XmlElement(required = true, nillable = true)
    protected String collectOnDeliveryReference;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean insurance;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float insuranceValue;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean returnOnDelivery;
    @XmlElement(required = true, nillable = true)
    protected String returnOnDeliveryReference;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean proofOfDelivery;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean selfCollect;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean predeliveryInformation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean deliveryToNeighbour;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the deliveryEvening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryEvening() {
        return deliveryEvening;
    }

    /**
     * Sets the value of the deliveryEvening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryEvening(Boolean value) {
        this.deliveryEvening = value;
    }

    /**
     * Gets the value of the deliveryOnSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryOnSaturday() {
        return deliveryOnSaturday;
    }

    /**
     * Sets the value of the deliveryOnSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryOnSaturday(Boolean value) {
        this.deliveryOnSaturday = value;
    }

    /**
     * Gets the value of the pickupOnSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupOnSaturday() {
        return pickupOnSaturday;
    }

    /**
     * Sets the value of the pickupOnSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupOnSaturday(Boolean value) {
        this.pickupOnSaturday = value;
    }

    /**
     * Gets the value of the collectOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectOnDelivery() {
        return collectOnDelivery;
    }

    /**
     * Sets the value of the collectOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectOnDelivery(Boolean value) {
        this.collectOnDelivery = value;
    }

    /**
     * Gets the value of the collectOnDeliveryValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCollectOnDeliveryValue() {
        return collectOnDeliveryValue;
    }

    /**
     * Sets the value of the collectOnDeliveryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCollectOnDeliveryValue(Float value) {
        this.collectOnDeliveryValue = value;
    }

    /**
     * Gets the value of the collectOnDeliveryForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectOnDeliveryForm() {
        return collectOnDeliveryForm;
    }

    /**
     * Sets the value of the collectOnDeliveryForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectOnDeliveryForm(String value) {
        this.collectOnDeliveryForm = value;
    }

    /**
     * Gets the value of the collectOnDeliveryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectOnDeliveryReference() {
        return collectOnDeliveryReference;
    }

    /**
     * Sets the value of the collectOnDeliveryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectOnDeliveryReference(String value) {
        this.collectOnDeliveryReference = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsurance(Boolean value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the insuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInsuranceValue() {
        return insuranceValue;
    }

    /**
     * Sets the value of the insuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInsuranceValue(Float value) {
        this.insuranceValue = value;
    }

    /**
     * Gets the value of the returnOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnDelivery() {
        return returnOnDelivery;
    }

    /**
     * Sets the value of the returnOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnDelivery(Boolean value) {
        this.returnOnDelivery = value;
    }

    /**
     * Gets the value of the returnOnDeliveryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnOnDeliveryReference() {
        return returnOnDeliveryReference;
    }

    /**
     * Sets the value of the returnOnDeliveryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnOnDeliveryReference(String value) {
        this.returnOnDeliveryReference = value;
    }

    /**
     * Gets the value of the proofOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProofOfDelivery() {
        return proofOfDelivery;
    }

    /**
     * Sets the value of the proofOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProofOfDelivery(Boolean value) {
        this.proofOfDelivery = value;
    }

    /**
     * Gets the value of the selfCollect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfCollect() {
        return selfCollect;
    }

    /**
     * Sets the value of the selfCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfCollect(Boolean value) {
        this.selfCollect = value;
    }

    /**
     * Gets the value of the predeliveryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredeliveryInformation() {
        return predeliveryInformation;
    }

    /**
     * Sets the value of the predeliveryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredeliveryInformation(Boolean value) {
        this.predeliveryInformation = value;
    }

    /**
     * Gets the value of the deliveryToNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryToNeighbour() {
        return deliveryToNeighbour;
    }

    /**
     * Sets the value of the deliveryToNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryToNeighbour(Boolean value) {
        this.deliveryToNeighbour = value;
    }

}
