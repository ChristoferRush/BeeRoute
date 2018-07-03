package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loc_city")
public class City {

    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "seq_city_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_sequence")
    @Column(name = "city_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Country country;

    @ManyToOne
    private State state;

    @JsonIgnore
    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Location> locations;

    public City() {
    }

    public City(String name, State state, Country country) {
        this.name = name;
        this.state = state;
        this.country = country;
    }

    public City(String name, Country country, State state, List<Location> locations) {
        this.name = name;
        this.country = country;
        this.state = state;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
