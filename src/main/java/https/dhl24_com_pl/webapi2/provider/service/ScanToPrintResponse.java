
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanToPrintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanToPrintResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="scanData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scanMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanToPrintResponse", propOrder = {

})
public class ScanToPrintResponse {

    @XmlElement(required = true, nillable = true)
    protected String scanData;
    @XmlElement(required = true, nillable = true)
    protected String scanMimeType;

    /**
     * Gets the value of the scanData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanData() {
        return scanData;
    }

    /**
     * Sets the value of the scanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanData(String value) {
        this.scanData = value;
    }

    /**
     * Gets the value of the scanMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanMimeType() {
        return scanMimeType;
    }

    /**
     * Sets the value of the scanMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanMimeType(String value) {
        this.scanMimeType = value;
    }

}
