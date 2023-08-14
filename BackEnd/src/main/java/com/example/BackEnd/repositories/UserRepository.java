package com.example.BackEnd.repositories;

import com.example.BackEnd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
//   public Optional<User> findUserByUsername(String Username){
//        return findUserByUsername(Username);
//    }
}
