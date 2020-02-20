package algorithm;

import io.output.OutputForm;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class Algorithm {
    public OutputForm proceed() {
        return null;
    }

    private float computeFactor(int concurrency, int[] array) {
        return concurrency*3 + Arrays.stream(array).sum()/array.length;
    }


}
