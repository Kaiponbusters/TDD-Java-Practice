package com.kaiponbusters;

import java.util.Arrays;
import java.util.stream.Stream;


public class stringCalc {
    public static int stringCalc(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }

        int[] numbersIntSeparate = Stream.of(numbers.split("[,\n;:]"))
                                                    .mapToInt(Integer::parseInt)
                                                    .toArray();

        int limitArgumentValue = 0;
        boolean hasNegativeNumbers = Arrays.stream(numbersIntSeparate)
                                           .anyMatch(n -> n < limitArgumentValue);

        if(hasNegativeNumbers) {
            throw new IllegalArgumentException("負の数は対応していません");
        }

        int sum = Arrays.stream(numbersIntSeparate)
                        .sum();
        return sum;
    }
}
