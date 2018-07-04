package com.rushedstudio.domino.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loc_address")
public class Address {

    @Id
    @SequenceGenerator(name = "loc_address_id_loc_address_seq", sequenceName = "loc_address_id_loc_address_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_address_id_loc_address_seq")
    @Column(name = "id_loc_address")
    private Long id;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @OneToOne
    private Location location;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<UserAddress> userAddressList;

    public Address() {
    }

    public Address(String streetAddress, String homeNumber, String flatNumber, String postalCode, Location location, City city) {
        this.streetAddress = streetAddress;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.location = location;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<UserAddress> getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(List<UserAddress> userAddressList) {
        this.userAddressList = userAddressList;
    }
}
