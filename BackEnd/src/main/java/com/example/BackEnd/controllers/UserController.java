package com.example.BackEnd.controllers;

import com.example.BackEnd.entities.User;
import com.example.BackEnd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://localhost:8080")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;


    @PostMapping("save")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
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
