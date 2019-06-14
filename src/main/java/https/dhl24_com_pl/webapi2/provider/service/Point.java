
package https.dhl24_com_pl.webapi2.provider.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{https://dhl24.com.pl/webapi2/provider/service.html?ws=1}SearchAddress"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sap" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tueOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tueClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wedOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wedClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="thuOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="thuClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="friOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="friClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="satOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="satClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sunOpen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sunClose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workInHoliday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {

})
public class Point {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected SearchAddress address;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String longitude;
    @XmlElement(required = true, nillable = true)
    protected String latitude;
    @XmlElement(required = true, nillable = true)
    protected String sap;
    @XmlElement(required = true, nillable = true)
    protected String monOpen;
    @XmlElement(required = true, nillable = true)
    protected String monClose;
    @XmlElement(required = true, nillable = true)
    protected String tueOpen;
    @XmlElement(required = true, nillable = true)
    protected String tueClose;
    @XmlElement(required = true, nillable = true)
    protected String wedOpen;
    @XmlElement(required = true, nillable = true)
    protected String wedClose;
    @XmlElement(required = true, nillable = true)
    protected String thuOpen;
    @XmlElement(required = true, nillable = true)
    protected String thuClose;
    @XmlElement(required = true, nillable = true)
    protected String friOpen;
    @XmlElement(required = true, nillable = true)
    protected String friClose;
    @XmlElement(required = true, nillable = true)
    protected String satOpen;
    @XmlElement(required = true, nillable = true)
    protected String satClose;
    @XmlElement(required = true, nillable = true)
    protected String sunOpen;
    @XmlElement(required = true, nillable = true)
    protected String sunClose;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean workInHoliday;
    @XmlElement(required = true, nillable = true)
    protected String name;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAddress }
     *     
     */
    public SearchAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAddress }
     *     
     */
    public void setAddress(SearchAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the sap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSap() {
        return sap;
    }

    /**
     * Sets the value of the sap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSap(String value) {
        this.sap = value;
    }

    /**
     * Gets the value of the monOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonOpen() {
        return monOpen;
    }

    /**
     * Sets the value of the monOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonOpen(String value) {
        this.monOpen = value;
    }

    /**
     * Gets the value of the monClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonClose() {
        return monClose;
    }

    /**
     * Sets the value of the monClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonClose(String value) {
        this.monClose = value;
    }

    /**
     * Gets the value of the tueOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTueOpen() {
        return tueOpen;
    }

    /**
     * Sets the value of the tueOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTueOpen(String value) {
        this.tueOpen = value;
    }

    /**
     * Gets the value of the tueClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTueClose() {
        return tueClose;
    }

    /**
     * Sets the value of the tueClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTueClose(String value) {
        this.tueClose = value;
    }

    /**
     * Gets the value of the wedOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWedOpen() {
        return wedOpen;
    }

    /**
     * Sets the value of the wedOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWedOpen(String value) {
        this.wedOpen = value;
    }

    /**
     * Gets the value of the wedClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWedClose() {
        return wedClose;
    }

    /**
     * Sets the value of the wedClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWedClose(String value) {
        this.wedClose = value;
    }

    /**
     * Gets the value of the thuOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThuOpen() {
        return thuOpen;
    }

    /**
     * Sets the value of the thuOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThuOpen(String value) {
        this.thuOpen = value;
    }

    /**
     * Gets the value of the thuClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThuClose() {
        return thuClose;
    }

    /**
     * Sets the value of the thuClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThuClose(String value) {
        this.thuClose = value;
    }

    /**
     * Gets the value of the friOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriOpen() {
        return friOpen;
    }

    /**
     * Sets the value of the friOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriOpen(String value) {
        this.friOpen = value;
    }

    /**
     * Gets the value of the friClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriClose() {
        return friClose;
    }

    /**
     * Sets the value of the friClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriClose(String value) {
        this.friClose = value;
    }

    /**
     * Gets the value of the satOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSatOpen() {
        return satOpen;
    }

    /**
     * Sets the value of the satOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSatOpen(String value) {
        this.satOpen = value;
    }

    /**
     * Gets the value of the satClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSatClose() {
        return satClose;
    }

    /**
     * Sets the value of the satClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSatClose(String value) {
        this.satClose = value;
    }

    /**
     * Gets the value of the sunOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunOpen() {
        return sunOpen;
    }

    /**
     * Sets the value of the sunOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunOpen(String value) {
        this.sunOpen = value;
    }

    /**
     * Gets the value of the sunClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunClose() {
        return sunClose;
    }

    /**
     * Sets the value of the sunClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunClose(String value) {
        this.sunClose = value;
    }

    /**
     * Gets the value of the workInHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkInHoliday() {
        return workInHoliday;
    }

    /**
     * Sets the value of the workInHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkInHoliday(Boolean value) {
        this.workInHoliday = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
