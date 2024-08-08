package com.example.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name" , nullable = false)
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;


    public void setId(long id) {
    }

    public Object getFirstName() {
        return firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = (String) email;
    }

    public void setLastName(Object lastName) {
        this.firstName = firstName;
    }

    public void setFirstName(Object firstName) {
        this.firstName = (String) firstName;
    }
}
