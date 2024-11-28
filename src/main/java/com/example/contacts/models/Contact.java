package com.example.contacts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {
    @Id
    private int contact_id;
    private int name;
    private int nick_name;
    private int work;
    private int image;
    private int description;
    private int phone;
    private int email;
    @ManyToOne
    private User user;

    public Contact() {

    }

    public Contact(int contact_id, int name, int nick_name, int work, int image, int description, int phone,
            int email) {
        this.contact_id = contact_id;
        this.name = name;
        this.nick_name = nick_name;
        this.work = work;
        this.image = image;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getNick_name() {
        return nick_name;
    }

    public void setNick_name(int nick_name) {
        this.nick_name = nick_name;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
