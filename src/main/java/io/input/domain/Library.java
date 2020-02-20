package io.input.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Library {
    private  Book[] books;
    private int signUp;
    private int maxBooksPerDay;
}
