package fr.m2i.crm.model;

import fr.m2i.crm.state.CustomerState;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "company_name", length = 100)
    private String companyName;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "first_name", length = 100)
    private String firstname;

    @Column(name = "last_name", length = 100)
    private String lastname;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "zip_code", length = 12)
    private String zipCode;

    @Enumerated(EnumType.ORDINAL)
    //@ColumnDefault("0")
    @Column(name = "state",columnDefinition = "INT(1) DEFAULT '0' NOT NULL")
    private CustomerState state;

    public Customer(String address, String city, String companyName, String country, String email, String firstname, String lastname, String phone, String zipCode, CustomerState state) {
        this.address = address;
        this.city = city;
        this.companyName = companyName;
        this.country = country;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.zipCode = zipCode;
        this.state = state;
    }

    public CustomerState getState() {
        return state;
    }

    public void setState(CustomerState state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", state=" + state +
                '}';
    }
}
