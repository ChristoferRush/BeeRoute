package com.rushedstudio.domino.domain;

import javax.persistence.*;

@Entity
@Table(name = "loc_location")
public class Location {

    @Id
    @SequenceGenerator(name = "location_sequence", sequenceName = "seq_location_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_sequence")
    @Column(name = "id_location")
    private Long id;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "number")
    private String homeNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @ManyToOne
    private City city;

    @ManyToOne
    private Country country;

    @ManyToOne
    private State state;

    public Location() {
    }

    public Location(String streetAddress, String homeNumber, String postalCode, City city, Country country, State state) {
        this.streetAddress = streetAddress;
        this.homeNumber = homeNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.state = state;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
