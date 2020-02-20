package io.input;

import io.input.InputData;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputManager {
    String name;

    public InputData scan() {
        try (Scanner scanner = new Scanner(new File(InputData.class.getProtectionDomain().getClassLoader().getResource(name).getFile()))) {
            int books = scanner.nextInt();
            int lib = scanner.nextInt();
            int days = scanner.nextInt();

            int[] scoreBooks = new int[books];
            for (int i = 0; i < books; i++) {
                scoreBooks[i] = scanner.nextInt();
            }
            int countBooks = 0;
            int signUp = 0;
            int booksPerDay = 0;

            int[] id = new int[0];
            for (int j = 0; j < lib; j++) {
                countBooks = scanner.nextInt();
                signUp = scanner.nextInt();
                booksPerDay = scanner.nextInt();

                id = new int[countBooks];
                for (int k = 0; k < countBooks; k++) {
                    id[k] = scanner.nextInt();
                }
            }

            return new InputData(books, lib, days, scoreBooks, countBooks, signUp, booksPerDay, id);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}