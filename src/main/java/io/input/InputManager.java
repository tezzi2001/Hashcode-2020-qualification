package io.input;

import io.input.domain.Book;
import io.input.domain.Data;
import io.input.domain.Library;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@UtilityClass
public class InputManager {

    public Data scan(String name) {
        try (Scanner scanner = new Scanner(new File(Data.class.getProtectionDomain().getClassLoader().getResource(name).getFile()))) {
            int booksNum = scanner.nextInt();
            int libsNum = scanner.nextInt();
            int days = scanner.nextInt();

            Book[] books = new Book[booksNum];

            for (int i = 0; i < booksNum; i++) {
                books[i] = new Book(i, scanner.nextInt());
            }

            Library[] libraries = new Library[libsNum];

            for (int i = 0; i < libsNum; i++) {
                int localBooksNum = scanner.nextInt();
                Library library = new Library(null, scanner.nextInt(), scanner.nextInt());
                Book[] localBooks = new Book[localBooksNum];

                for (int j = 0; j < localBooksNum; j++) {
                    int id = scanner.nextInt();
                    localBooks[j] = new Book(id, books[id].getScore());
                    System.err.println(localBooks[j]);
                }

                library.setBooks(localBooks);
                libraries[i] = library;
            }
            return  new Data(days, libraries, books, booksNum);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}