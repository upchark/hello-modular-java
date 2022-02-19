package com.uk.features;

import java.util.List;
import java.util.stream.Collectors;

public class StringNewMethods {
    public static void main(String[] args) {
        String multiline = "From java 11 new methods are availavle." +
                "\n These methods are for find blank string \n \n and stripping string.";
        List<String> lines = multiline.lines().filter(str->!str.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        System.out.println(lines);
    }
}
