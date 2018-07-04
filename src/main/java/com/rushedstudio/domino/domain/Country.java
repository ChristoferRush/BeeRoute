package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "loc_country")
public class Country {

    @Id
    @SequenceGenerator(name = "loc_country_id_country_seq", sequenceName = "loc_country_id_country_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_country_id_country_seq")
    @Column(name = "id_country")
    private Short id;

    @NotNull
    @Column(name = "iso")
    private String iso;

    @NotNull
    @Column(name = "code")
    private String code;

    @NotNull
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<State> stateList;

    @JsonIgnore
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<City> cityList;

    public Country() {
    }

    public Country(@NotNull String iso, @NotNull String code, @NotNull String name) {
        this.iso = iso;
        this.code = code;
        this.name = name;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStateList() {
        return stateList;
    }

    public void setStateList(List<State> stateList) {
        this.stateList = stateList;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public String toString() {
        return iso + " - " + code + " - " + name.toUpperCase();
    }
}
