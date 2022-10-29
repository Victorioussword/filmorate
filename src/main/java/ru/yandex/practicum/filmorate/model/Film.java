package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Film {

    @NotNull
    final private int id;

    @NotNull
   // @NotBlank
    final private String name;

    @NotNull
  //  @NotBlank
    final private String desciption;

    @NotNull
    final private LocalDate releaseDate;

    @NotNull
  //  @Positive
    final private long duration;
}
