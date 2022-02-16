package com.example.user.service;

import com.example.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public ResponseEntity<User> createUser(User user) {
        user.setId(123);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    public ResponseEntity<User> getUser(int id) {
        User user = new User(id, "Ramesh", "Mendis", true);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
