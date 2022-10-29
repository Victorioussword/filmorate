package ru.yandex.practicum.filmorate.controller;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UserController {
    Map<Integer, User> users = new HashMap<>();
    int id = 1;

    @GetMapping
    public Map<Integer, User> getUsers(){
        return users;
    }
    @PostMapping
    public User postUser(@RequestBody User user){
        user.setId(id++);
        users.put(user.getId(), user);
        return user;
    }

    @PutMapping
    public User putUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return user;
    }
}