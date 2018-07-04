package com.rushedstudio.domino.domain;

import javax.persistence.*;

@Entity
@Table(name = "usr_address")
public class UserAddress {

    @Id
    @SequenceGenerator(name = "usr_address_id_usr_address_seq", sequenceName = "usr_address_id_usr_address_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_address_id_usr_address_seq")
    @Column(name = "id_usr_address")
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Address address;

    private boolean main;

    public UserAddress(){}

    public UserAddress(User user, Address address, boolean main) {
        this.user = user;
        this.address = address;
        this.main = main;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }
}
