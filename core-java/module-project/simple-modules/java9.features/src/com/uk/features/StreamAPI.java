package com.uk.features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,1,5, 2);
        Stream<Integer> all2s = list.stream().takeWhile(Predicate.isEqual(2));
        all2s.forEach(System.out::println);
    }
}
