package algorithm;

import io.input.domain.Data;
import io.input.domain.Library;
import io.output.OutputForm;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class Algorithm {
    public OutputForm proceed(Data data) {
        Map<Integer, int[]> output = new HashMap<>();

        int days = data.getDays();
        int remainingDays;

        int i = 0;
        for (Library lib: data.getLibs()) {
            remainingDays = days - lib.getSignUp();
            int maxBooks = lib.getBooks().length;
            int processBooks = remainingDays*lib.getMaxBooksPerDay();
            if (maxBooks < processBooks) {
                int[] indexesArray = new int[maxBooks];
                for(int j = 0; j < maxBooks; j++) {
                    indexesArray[j] = lib.getBooks()[j].getId();
                }
                output.put(i, indexesArray);
            } else {
                int[] indexesArray = new int[processBooks];
                for(int j = 0; j < processBooks; j++) {
                    indexesArray[j] = lib.getBooks()[j].getId();
                }
                output.put(i, indexesArray);
            }
            i++;
        }
        return new OutputForm(output);
    }
}
