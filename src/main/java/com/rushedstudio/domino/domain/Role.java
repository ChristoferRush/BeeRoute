package com.rushedstudio.domino.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/*
@@TODO "lombok doesn't work right now need to use getter/setter/constructor"
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "usr_role")
public class Role {

    @Id
    @SequenceGenerator(name = "usr_role_id_role_seq", sequenceName = "usr_role_id_role_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_role_id_role_seq")
    @Column(name = "id_role")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

//    @ManyToOne
//    private Permission permission;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<User> userList;

    public Role() {
    }

//    public Role(@NotNull String name, Permission permission) {
//        this.name = name;
//        this.permission = permission;
//    }

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

//    public Permission getPermission() {
//        return permission;
//    }
//
//    public void setPermission(Permission permission) {
//        this.permission = permission;
//    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
