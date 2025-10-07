package com.codefinity;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        File[] files = {
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3.txt")
        };

        //TODO: Implement an ExecutorService initialization lock with 3 threads here and run these 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (File file : files) {
            executorService.submit(new WordCountTask(file));
        }
        executorService.shutdown();
    }
}
