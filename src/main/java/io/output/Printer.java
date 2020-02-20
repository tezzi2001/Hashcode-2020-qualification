package io.output;

import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@UtilityClass
public class Printer {
    public void print(OutputForm form, String fileName) {
        File file = new File("src/main/resources/output" + fileName + ".out");

        try(PrintWriter writer = new PrintWriter(file)) {
            writer.print(form.getOutput().size() + System.lineSeparator());
            for (Integer i: form.getOutput().keySet()) {
                writer.print(i + " " + form.getOutput().get(i).length + System.lineSeparator());
                for (int j: form.getOutput().get(i)) writer.print(j + " ");
                writer.print(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
