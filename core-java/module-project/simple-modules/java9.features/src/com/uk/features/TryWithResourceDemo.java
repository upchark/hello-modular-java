package com.uk.features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {
    public static void main(String[] args) throws IOException {
java7(null);
    }

    public static void java7(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(""));
        try (BufferedReader br2 = br) {

        }
    }

    public static void java9(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(""))) {

        }

    }
}
