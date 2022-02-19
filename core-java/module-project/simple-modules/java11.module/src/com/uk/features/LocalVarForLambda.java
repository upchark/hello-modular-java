package com.uk.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVarForLambda {
    public static void main(String[] args) {
        List<String> gears = Arrays.asList("1", "2", "3");
        String result = gears.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
