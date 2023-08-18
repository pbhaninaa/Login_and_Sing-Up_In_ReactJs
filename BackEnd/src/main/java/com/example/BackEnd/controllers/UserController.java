package com.example.BackEnd.controllers;

import com.example.BackEnd.entities.User;
import com.example.BackEnd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        System.out.print(user);
        try {
            User savedUser = service.saveUser(user);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("getAll")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    @DeleteMapping("deleteAll")
    public String deleteAll(){
        service.deleteAll();
        return "Table formated";
    }

}
