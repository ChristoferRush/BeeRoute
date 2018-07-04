package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loc_state")
public class State {

    @Id
    @SequenceGenerator(name = "loc_state_id_state_seq", sequenceName = "loc_state_id_state_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_state_id_state_seq")
    @Column(name = "id_state")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<City> cityList;

    public State() {
    }

    public State(String name, Country country) {
        this.name = name;
        this.country = country;
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

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
