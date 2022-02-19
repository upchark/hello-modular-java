package com.uk.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionChanges {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1,2,3,4).collect(Collectors.toList());
        Integer firstEven = numbers.stream().filter(g->g%2==0).findFirst().orElseThrow();
        System.out.println(firstEven);
    }
}
