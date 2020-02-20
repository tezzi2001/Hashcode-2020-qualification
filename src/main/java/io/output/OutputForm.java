package io.output;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class OutputForm {
    Map<Integer, int[]> output;
}
