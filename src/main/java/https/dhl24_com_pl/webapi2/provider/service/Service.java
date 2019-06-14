
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="textInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectOnDeliveryForm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {

})
public class Service {

    @XmlElement(required = true, nillable = true)
    protected String serviceType;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float serviceValue;
    @XmlElement(required = true, nillable = true)
    protected String textInstruction;
    @XmlElement(required = true, nillable = true)
    protected String collectOnDeliveryForm;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getServiceValue() {
        return serviceValue;
    }

    /**
     * Sets the value of the serviceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setServiceValue(Float value) {
        this.serviceValue = value;
    }

    /**
     * Gets the value of the textInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextInstruction() {
        return textInstruction;
    }

    /**
     * Sets the value of the textInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextInstruction(String value) {
        this.textInstruction = value;
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

}
