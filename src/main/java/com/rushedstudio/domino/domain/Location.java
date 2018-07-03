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

    @Column(name = "city")
    private City city;

    @Column(name = "country")
    private Country country;


    private String state;

}
