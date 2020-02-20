package io.input.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@lombok.Data
public class Data {
    private int days;
    private Library[] libs;
    private Book[] books;
    private int booksNum;
}
