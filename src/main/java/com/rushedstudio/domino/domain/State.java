package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loc_state")
public class State {

    @Id
    @SequenceGenerator(name = "state_sequence", sequenceName = "seq_state_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_sequence")
    @Column(name = "state_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<City> cities;

    @JsonIgnore
    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Location> locations;

    public State() {
    }

    public State(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public State(String name, Country country, List<City> cities, List<Location> locations) {
        this.name = name;
        this.country = country;
        this.cities = cities;
        this.locations = locations;
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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
