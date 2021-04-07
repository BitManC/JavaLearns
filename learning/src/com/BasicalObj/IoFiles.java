package com.BasicalObj;

import java.io.File;
import java.io.IOException;

/**
 *
 */




public class IoFiles {

    public static void main(String[] args) throws IOException {
        String path = "/Users/yifz/JavaAll/learning/src/com/basicalObj/abc" ;
        read(path);
    }

    public static void read(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();

    }
}
