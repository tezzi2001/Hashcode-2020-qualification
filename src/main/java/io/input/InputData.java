package io.input;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class InputData  {
    private int books;
    private int libraries ;
    private int days;
    private int[] scoresBooks ;
    private int countBooks;
    private int signProcess;
    private int booksPerDay;
    private int[] id;

}