package com.uk.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodsForString {
    public static void main(String[] args) throws IOException {
        var tempDir = "/";
        Path path = Files.createTempFile(Path.of(tempDir), "demo", ".txt");
        Path filePath = Files.writeString(path, "Hello this is java 11 feature");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
    }
}
