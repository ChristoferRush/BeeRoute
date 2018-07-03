package com.rushedstudio.domino.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "loc_country")
public class Country {

    @Id
    @SequenceGenerator(name = "country_sequence", sequenceName = "seq_country_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_sequence")
    @Column(name = "country_id")
    private Short id;

    @NotNull
    @Column(name = "country_iso")
    private String iso;

    @NotNull
    @Column(name = "country_code")
    private String code;

    @NotNull
    @Column(name = "country_name")
    private String name;

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

    public String toString() {
        return iso + " - " + code + " - " + name.toUpperCase();
    }
}
