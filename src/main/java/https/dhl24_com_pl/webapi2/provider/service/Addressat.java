
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Addressat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addressat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="preaviso" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}PreavisoContact"/&gt;
 *         &lt;element name="contact" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}PreavisoContact"/&gt;
 *         &lt;element name="address" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}Address"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addressat", propOrder = {

})
public class Addressat {

    @XmlElement(required = true, nillable = true)
    protected PreavisoContact preaviso;
    @XmlElement(required = true, nillable = true)
    protected PreavisoContact contact;
    @XmlElement(required = true, nillable = true)
    protected Address address;

    /**
     * Gets the value of the preaviso property.
     * 
     * @return
     *     possible object is
     *     {@link PreavisoContact }
     *     
     */
    public PreavisoContact getPreaviso() {
        return preaviso;
    }

    /**
     * Sets the value of the preaviso property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreavisoContact }
     *     
     */
    public void setPreaviso(PreavisoContact value) {
        this.preaviso = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link PreavisoContact }
     *     
     */
    public PreavisoContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreavisoContact }
     *     
     */
    public void setContact(PreavisoContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
