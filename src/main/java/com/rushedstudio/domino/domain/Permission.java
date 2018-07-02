package com.rushedstudio.domino.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "usr_permission")
public class Permission {

    @Id
    @SequenceGenerator(name = "permission_sequence", sequenceName = "seq_permission", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_sequence")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column
    @OneToMany(mappedBy = "permission", fetch = FetchType.LAZY)
    private List<Role> roles;

    public Permission(){}

    public Permission(String name) {
        this.name = name;
    }
}
