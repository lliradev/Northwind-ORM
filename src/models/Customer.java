package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LLira
 */
@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue
    private int customerID;

    @Column(name = "CompanyName", nullable = false, length = 80)
    private String companyName;

    @Column(name = "ContactName", nullable = true, length = 60)
    private String contactName;

    @Column(name = "ContactTitle", nullable = true, length = 60)
    private String contactTitle;

    @Column(name = "Address", nullable = true, length = 120)
    private String address;

    @Column(name = "City", nullable = true, length = 30)
    private String city;

    @Column(name = "Region", nullable = true, length = 30)
    private String region;

    @Column(name = "PostalCode", nullable = true, length = 20)
    private String postalCode;

    @Column(name = "Country", nullable = true, length = 30)
    private String country;

    @Column(name = "Phone", nullable = true, length = 48)
    private String phone;

    @Column(name = "Fax", nullable = true, length = 48)
    private String fax;

    public Customer() {}

    public Customer(int customerID, String companyName, String contactName, String contactTitle, String address, String city, String region, String postalCode, String country, String phone, String fax) {
        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName + ", contactTitle=" + contactTitle + ", address=" + address + ", city=" + city + ", region=" + region + ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone + ", fax=" + fax + '}';
    }

}//End class