package com.rushedstudio.domino.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "usr_user")
public class User {

    @Id
    @SequenceGenerator(name = "usr_user_id_user_seq", sequenceName = "usr_user_id_user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_user_id_user_seq")
    @Column(name = "id_user")
    private Long id;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @ManyToOne
    private Role role;

    @OneToOne
    private Account account;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<UserAddress> userAddressList;

    public User() {
    }

    public User(@NotNull String firstName, @NotNull String lastName, @NotNull @Email String email, Role role, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<UserAddress> getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(List<UserAddress> userAddressList) {
        this.userAddressList = userAddressList;
    }
}
