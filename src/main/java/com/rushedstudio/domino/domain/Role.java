package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/*
@@TODO "lombok doesn't work right now need to use getter/setter/constructor"
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@Data
@Entity
@Table(name = "usr_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_role")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<User> users;

    @NotNull
    @Column(name = "permission")
    private Permission permission;

    public Role() {
    }

    public Role(@NotNull String name, Set<User> users, @NotNull Permission permission) {
        this.name = name;
        this.users = users;
        this.permission = permission;
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
