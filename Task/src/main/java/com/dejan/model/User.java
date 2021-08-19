package com.dejan.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "password", nullable = false)
    private String password;
    private String firstName;
    private String lastName;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Machin machin;

    public User() {
    }

    public User(Long id, String password, String firstName, String lastName, Machin machin) {
        this.id =
                id;
        this.password =
                password;
        this.firstName =
                firstName;
        this.lastName =
                lastName;
        this.machin =
                machin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =
                id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password =
                password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName =
                firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName =
                lastName;
    }

    public Machin getMachin() {
        return machin;
    }

    public void setMachin(Machin machin) {
        this.machin =
                machin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", machin=" + machin +
                '}';
    }
}
