package com.example.contacts.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String image;
    @Column(length = 500)
    private String info;
    private String role;
    private Boolean active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Contact> contacts = new ArrayList<>();

    public User(int user_id, String name, String email, String password, String image, String info, String role,
            Boolean active) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.image = image;
        this.info = info;
        this.role = role;
        this.active = active;
    }

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password
                + ", image=" + image + ", info=" + info + ", role=" + role + ", active=" + active + ", contacts="
                + contacts + "]";
    }

}
