package com.rushedstudio.domino.domain;

import javax.persistence.*;

@Entity
@Table(name = "loc_location")
public class Location {

    @Id
    @SequenceGenerator(name = "loc_location_id_location_seq", sequenceName = "loc_location_id_location_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_location_id_location_seq")
    @Column(name = "id_location")
    private Long id;

    @OneToOne
    private Address address;

    public Location() {
    }

    public Location(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
