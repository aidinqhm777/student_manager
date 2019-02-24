package com.StudentManegerSystem;

import java.io.IOException;

public class FileIO {

    public static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    public static void writeToFile(String filePath, String data, int position)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}  