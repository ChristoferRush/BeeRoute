package com.rushedstudio.domino.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usr_account")
public class Account {

    @Id
    @SequenceGenerator(name = "usr_account_id_account_seq", sequenceName = "usr_account_id_account_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_account_id_account_seq")
    @Column(name = "id_account")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "passwd")
    private String passwd;

    @OneToOne
    private User user;

    public Account() {
    }

    public Account(String name, String passwd, User user) {
        this.name = name;
        this.passwd = passwd;
        this.user = user;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
