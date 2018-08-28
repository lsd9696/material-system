package com.rbi.materialgroup.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id",strategy = "native")
    private Integer id;

    @Column(name = "username")
    private String userName;

    @Column(name= "password")
    private String password;

    @Column(name= "real-name")
    private String realName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "department")
    private String department;

}
