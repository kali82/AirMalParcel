
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryNameEn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pieceHeader" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="routing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="code2l" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pickupDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierMaxWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="courierMaxWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierMaxHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierMaxLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierMaxCod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierCodCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courierExchrate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="courierNstAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="courierMaxNst" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courierMaxGirth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="packstationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="packstationMaxWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="packstationMaxWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="packstationMaxHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="packstationMaxLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="postfilialeAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="postfilialeMaxWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="postfilialeMaxWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="postfilialeMaxHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="postfilialeMaxLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="zipFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailRequired" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalParam", propOrder = {

})
public class InternationalParam {

    @XmlElement(required = true, nillable = true)
    protected String countryName;
    @XmlElement(required = true, nillable = true)
    protected String countryNameEn;
    @XmlElement(required = true, nillable = true)
    protected String countryCode;
    @XmlElement(required = true, nillable = true)
    protected String product;
    @XmlElement(required = true, nillable = true)
    protected String pieceHeader;
    @XmlElement(required = true, nillable = true)
    protected String routing;
    @XmlElement(name = "code2l", required = true, nillable = true)
    protected String code2L;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pickupDays;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float courierMaxWeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxWidth;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxHeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxLength;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxCod;
    @XmlElement(required = true, nillable = true)
    protected String courierCodCurrency;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float courierExchrate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean courierNstAvailable;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxNst;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer courierMaxGirth;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean packstationAvailable;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float packstationMaxWeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer packstationMaxWidth;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer packstationMaxHeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer packstationMaxLength;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean postfilialeAvailable;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float postfilialeMaxWeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer postfilialeMaxWidth;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer postfilialeMaxHeight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer postfilialeMaxLength;
    @XmlElement(required = true, nillable = true)
    protected String zipFormat;
    @XmlElement(required = true, nillable = true)
    protected String identifier;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer emailRequired;

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameEn() {
        return countryNameEn;
    }

    /**
     * Sets the value of the countryNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameEn(String value) {
        this.countryNameEn = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

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
     * Gets the value of the pieceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceHeader() {
        return pieceHeader;
    }

    /**
     * Sets the value of the pieceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceHeader(String value) {
        this.pieceHeader = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouting(String value) {
        this.routing = value;
    }

    /**
     * Gets the value of the code2L property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode2L() {
        return code2L;
    }

    /**
     * Sets the value of the code2L property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode2L(String value) {
        this.code2L = value;
    }

    /**
     * Gets the value of the pickupDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickupDays() {
        return pickupDays;
    }

    /**
     * Sets the value of the pickupDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickupDays(Integer value) {
        this.pickupDays = value;
    }

    /**
     * Gets the value of the courierMaxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCourierMaxWeight() {
        return courierMaxWeight;
    }

    /**
     * Sets the value of the courierMaxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCourierMaxWeight(Float value) {
        this.courierMaxWeight = value;
    }

    /**
     * Gets the value of the courierMaxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxWidth() {
        return courierMaxWidth;
    }

    /**
     * Sets the value of the courierMaxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxWidth(Integer value) {
        this.courierMaxWidth = value;
    }

    /**
     * Gets the value of the courierMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxHeight() {
        return courierMaxHeight;
    }

    /**
     * Sets the value of the courierMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxHeight(Integer value) {
        this.courierMaxHeight = value;
    }

    /**
     * Gets the value of the courierMaxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxLength() {
        return courierMaxLength;
    }

    /**
     * Sets the value of the courierMaxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxLength(Integer value) {
        this.courierMaxLength = value;
    }

    /**
     * Gets the value of the courierMaxCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxCod() {
        return courierMaxCod;
    }

    /**
     * Sets the value of the courierMaxCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxCod(Integer value) {
        this.courierMaxCod = value;
    }

    /**
     * Gets the value of the courierCodCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierCodCurrency() {
        return courierCodCurrency;
    }

    /**
     * Sets the value of the courierCodCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierCodCurrency(String value) {
        this.courierCodCurrency = value;
    }

    /**
     * Gets the value of the courierExchrate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCourierExchrate() {
        return courierExchrate;
    }

    /**
     * Sets the value of the courierExchrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCourierExchrate(Float value) {
        this.courierExchrate = value;
    }

    /**
     * Gets the value of the courierNstAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCourierNstAvailable() {
        return courierNstAvailable;
    }

    /**
     * Sets the value of the courierNstAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCourierNstAvailable(Boolean value) {
        this.courierNstAvailable = value;
    }

    /**
     * Gets the value of the courierMaxNst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxNst() {
        return courierMaxNst;
    }

    /**
     * Sets the value of the courierMaxNst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxNst(Integer value) {
        this.courierMaxNst = value;
    }

    /**
     * Gets the value of the courierMaxGirth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourierMaxGirth() {
        return courierMaxGirth;
    }

    /**
     * Sets the value of the courierMaxGirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourierMaxGirth(Integer value) {
        this.courierMaxGirth = value;
    }

    /**
     * Gets the value of the packstationAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackstationAvailable() {
        return packstationAvailable;
    }

    /**
     * Sets the value of the packstationAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackstationAvailable(Boolean value) {
        this.packstationAvailable = value;
    }

    /**
     * Gets the value of the packstationMaxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackstationMaxWeight() {
        return packstationMaxWeight;
    }

    /**
     * Sets the value of the packstationMaxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackstationMaxWeight(Float value) {
        this.packstationMaxWeight = value;
    }

    /**
     * Gets the value of the packstationMaxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackstationMaxWidth() {
        return packstationMaxWidth;
    }

    /**
     * Sets the value of the packstationMaxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackstationMaxWidth(Integer value) {
        this.packstationMaxWidth = value;
    }

    /**
     * Gets the value of the packstationMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackstationMaxHeight() {
        return packstationMaxHeight;
    }

    /**
     * Sets the value of the packstationMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackstationMaxHeight(Integer value) {
        this.packstationMaxHeight = value;
    }

    /**
     * Gets the value of the packstationMaxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackstationMaxLength() {
        return packstationMaxLength;
    }

    /**
     * Sets the value of the packstationMaxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackstationMaxLength(Integer value) {
        this.packstationMaxLength = value;
    }

    /**
     * Gets the value of the postfilialeAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostfilialeAvailable() {
        return postfilialeAvailable;
    }

    /**
     * Sets the value of the postfilialeAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostfilialeAvailable(Boolean value) {
        this.postfilialeAvailable = value;
    }

    /**
     * Gets the value of the postfilialeMaxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPostfilialeMaxWeight() {
        return postfilialeMaxWeight;
    }

    /**
     * Sets the value of the postfilialeMaxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPostfilialeMaxWeight(Float value) {
        this.postfilialeMaxWeight = value;
    }

    /**
     * Gets the value of the postfilialeMaxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostfilialeMaxWidth() {
        return postfilialeMaxWidth;
    }

    /**
     * Sets the value of the postfilialeMaxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostfilialeMaxWidth(Integer value) {
        this.postfilialeMaxWidth = value;
    }

    /**
     * Gets the value of the postfilialeMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostfilialeMaxHeight() {
        return postfilialeMaxHeight;
    }

    /**
     * Sets the value of the postfilialeMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostfilialeMaxHeight(Integer value) {
        this.postfilialeMaxHeight = value;
    }

    /**
     * Gets the value of the postfilialeMaxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostfilialeMaxLength() {
        return postfilialeMaxLength;
    }

    /**
     * Sets the value of the postfilialeMaxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostfilialeMaxLength(Integer value) {
        this.postfilialeMaxLength = value;
    }

    /**
     * Gets the value of the zipFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipFormat() {
        return zipFormat;
    }

    /**
     * Sets the value of the zipFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipFormat(String value) {
        this.zipFormat = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the emailRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailRequired() {
        return emailRequired;
    }

    /**
     * Sets the value of the emailRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailRequired(Integer value) {
        this.emailRequired = value;
    }

}
