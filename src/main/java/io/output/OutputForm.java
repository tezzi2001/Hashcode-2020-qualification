package io.output;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OutputForm {
    private int[] libsOrderIndexes;
    private int[] booksIndexesInOrder;
}
