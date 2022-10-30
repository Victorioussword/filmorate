package ru.yandex.practicum.filmorate.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.exception.InputDataException;
import ru.yandex.practicum.filmorate.model.User;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private final static Logger log = LoggerFactory.getLogger(UserController.class);


    Map<Integer, User> users = new HashMap<>();
    int id = 1;

    @GetMapping
    public Map<Integer, User> getUsers() {
        log.info("GET /users. Количество пользователей: {}",users.size());
        return users;
    }

    @PostMapping
    public User postUser(@Valid @RequestBody User user) {
        user.setId(id++);
        users.put(user.getId(), user);
        ageCheck(user);
        log.info("POST /users. Количество пользователей: {}",users.size());
        return user;
    }

    @PutMapping
    public User putUser(@Valid @RequestBody User user) {
        users.put(user.getId(), user);
        log.info("PUT /users. Количество пользователей: {}",users.size());
        return user;
    }


    private void ageCheck(User user) {
        LocalDate currentDay = LocalDate.now();
        if (currentDay.isBefore(user.getBirthday())) {
             throw new InputDataException("Указан не корректный возраст");
        }
    }


}