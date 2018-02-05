package com.handsonjava.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaCollections {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a","b","c","d");
        input.forEach(
        (charss) -> System.out.print(charss));
    }
}
