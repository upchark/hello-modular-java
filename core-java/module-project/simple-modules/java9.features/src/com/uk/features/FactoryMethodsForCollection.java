package com.uk.features;

import java.util.List;
import java.util.Map;

public class FactoryMethodsForCollection {
    public static void main(String[] args) {
        listFactoryMethods();
        mapFactoryMethods();
    }

    private static void mapFactoryMethods() {
        /*Returns an unmodifiable map containing two mappings. See Unmodifiable Maps for details.*/
        Map<String, Integer> gears = Map.of("gear1", 100, "gear2", 200);
        System.out.println(gears);
    }

    private static void listFactoryMethods() {
        /*Returns an unmodifiable list containing four elements. See Unmodifiable Lists for details.*/
        List<Integer> numbers = List.of(1,3,2,5);
        System.out.println(numbers);
    }
}
