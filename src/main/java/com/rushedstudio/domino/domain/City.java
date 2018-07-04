package com.rushedstudio.domino.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loc_city")
public class City {

    @Id
    @SequenceGenerator(name = "loc_city_id_city_seq", sequenceName = "loc_city_id_city_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_city_id_city_seq")
    @Column(name = "id_city")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Country country;

    @ManyToOne
    private State state;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Address> addressList;

    public City() {
    }

    public City(String name, Country country, State state) {
        this.name = name;
        this.country = country;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
