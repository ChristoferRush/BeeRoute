package com.rushedstudio.domino.domain;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @SequenceGenerator(name = "location_sequence", sequenceName = "seq_location_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_sequence")
    @Column(name = "id_location")
    private Long id;

    private String street;

    private String homeNumber;

    private String postalCode;

    private String city;

    private String country;

    private String state;

}
