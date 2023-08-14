package com.example.BackEnd.services;

import com.example.BackEnd.entities.User;
import com.example.BackEnd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    public void deleteAll(){
        repository.deleteAll();
    }
}
