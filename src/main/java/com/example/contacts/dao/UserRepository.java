package com.example.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
