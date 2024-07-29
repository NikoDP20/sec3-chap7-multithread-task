package com.codefinity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WordCountTask implements Runnable {
    private final File file;

    public WordCountTask(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        //TODO: Implement reading a string from a file,
        // counting the number of words, and output all the information to the console
    }
}
