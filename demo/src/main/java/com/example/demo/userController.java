package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    userService UserService;

    @PostMapping("/add")
    public String createUser(@RequestBody user User) {
        return UserService.addUSer(User);
    }

    @GetMapping("/getInfo")
    public user getuser(@RequestParam("q") int Id) {
        return UserService.getuser(Id);
    }
}
