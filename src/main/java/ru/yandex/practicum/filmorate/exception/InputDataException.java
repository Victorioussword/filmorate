package ru.yandex.practicum.filmorate.exception;

public class InputDataException extends RuntimeException {
    public InputDataException(String message) {
        super((message));
    }
}