package com.uk.features;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<Integer> gears = Arrays.asList(1,2,3);
        Integer[] gearArr = gears.toArray(Integer[]::new);
    }
}
