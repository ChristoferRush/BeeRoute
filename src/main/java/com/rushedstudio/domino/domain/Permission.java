package com.rushedstudio.domino.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "usr_permission")
public class Permission {

    @Id
    @SequenceGenerator(name = "usr_permission_id_permission_seq", sequenceName = "usr_permission_id_permission_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_permission_id_permission_seq")
    @Column(name = "id_permission")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column
    @OneToMany(mappedBy = "permission", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Role> roleList;

    public Permission(){}

    public Permission(String name) {
        this.name = name;
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

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
