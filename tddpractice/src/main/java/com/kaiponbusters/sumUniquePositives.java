package com.kaiponbusters;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class sumUniquePositives {
    public static int sumUniquePositives(int[] numbers) {
        int result = 0;
        Set<Integer> uniqueNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        return uniqueNumbers.stream().filter(num -> num > 0).mapToInt(Integer::intValue).sum();
    }
}
