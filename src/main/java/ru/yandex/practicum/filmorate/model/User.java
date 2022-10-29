package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {


    @NotNull
    private final int id;

    @NotNull
    @Email
    private final String email;

    @NotNull
    @NotBlank
    private final String login;

    @NotNull
    @NotBlank
    private final String name;

    @NotNull
    private final LocalDate birthday;


}