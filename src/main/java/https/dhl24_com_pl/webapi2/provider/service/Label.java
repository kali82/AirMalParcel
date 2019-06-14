
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="labelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelContent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {

})
public class Label {

    @XmlElement(required = true, nillable = true)
    protected String labelType;
    @XmlElement(required = true, nillable = true)
    protected String labelFormat;
    @XmlElement(required = true, nillable = true)
    protected String labelContent;

    /**
     * Gets the value of the labelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelType() {
        return labelType;
    }

    /**
     * Sets the value of the labelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelType(String value) {
        this.labelType = value;
    }

    /**
     * Gets the value of the labelFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Sets the value of the labelFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFormat(String value) {
        this.labelFormat = value;
    }

    /**
     * Gets the value of the labelContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelContent() {
        return labelContent;
    }

    /**
     * Sets the value of the labelContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelContent(String value) {
        this.labelContent = value;
    }

}
