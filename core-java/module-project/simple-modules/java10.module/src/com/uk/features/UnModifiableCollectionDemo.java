package com.uk.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnModifiableCollectionDemo {
    public static void main(String[] args) {
        List<Integer> gears = Stream.of(1,2,3,4).collect(Collectors.toList());
        List<Integer> fixedGears = List.copyOf(gears);
        List<Integer> fixedLowGears = gears.stream().filter(g-> g<3).collect(Collectors.toUnmodifiableList());
    }
}
