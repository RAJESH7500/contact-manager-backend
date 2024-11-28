package com.example.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.contacts.dao.UserRepository;
import com.example.contacts.helpers.Response;
import com.example.contacts.models.User;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@Valid @RequestBody User user, BindingResult result) {
        Response response = new Response();
        if (result.hasErrors()) {
            response.setStatus(400);
            response.setMessage(result.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        user.setActive(true);
        user.setRole("user");
        user.setImage("user.png");

        userRepository.save(user);

        response.setMessage("Register success");
        response.setStatus(201);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
