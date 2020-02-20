package algorithm;

import io.output.OutputForm;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.Map;

@UtilityClass
public class Algorithm {
    public OutputForm proceed() {
        return null;
    }

    private float computeFactor(int concurrency, int[] array) {
        return concurrency*3 + Arrays.stream(array).sum()/array.length;
    }
}
