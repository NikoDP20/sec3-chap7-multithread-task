package com.codefinity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

public class WordCountTask implements Callable<String> {
    private final File file;

    public WordCountTask(File file) {
        this.file = file;
    }

    @Override
    public String call() {
        //TODO: Implement reading a string from a file,
        // counting the number of words, and output all the information to the console
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
            String result = "File: " + file.getName() + ", Word Count: " + wordCount;
            System.out.println(result);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error processing file: " + file.getName();
        }
    }
}





