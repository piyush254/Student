package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userService {
    @Autowired
    UserRepository userRepository;

    public String addUSer(user User) {
        userRepository.save(User);
        return "User added Successfully";
    }

    public user getuser(int id) {
            user User = userRepository.findById(id).get();
        return User;
    }
}
