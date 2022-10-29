package ru.yandex.practicum.filmorate.controller;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.model.Film;
import ru.yandex.practicum.filmorate.model.User;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/films")
public class FilmController {

    Map<Integer, Film> films = new HashMap<>();

    @GetMapping
    public Map<Integer, Film> getUsers(){
        return films;
    }


    @PostMapping
    public Film postUser(@RequestBody Film film){
        films.put(film.getId(), film);
        return film;
    }

    @PutMapping
    public Film putUser(@RequestBody Film film) {
        films.put(film.getId(), film);
        return film;
    }


}