package com.t3.springrest.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="rest_students")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    private String cpf;

    public Student(String fullName, String email, String cpf) {
        this.fullName = fullName;
        this.email = email;
        this.cpf = cpf;
    }
    
}
