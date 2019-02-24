package com.StudentManagerSystem;

import java.io.IOException;

public class FileIO {

    public static byte[] readIndexFromFile(String filePath, int index, int size)
            throws IOException {
        return readFromFile(filePath, (index-1) * size, size);
    }

    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    public static void writeIndexToFile(String filePath, String data, int index, int size)
            throws IOException {
        //check size of input data
        if(data.length() > size) throw new ArrayIndexOutOfBoundsException();
        //fill data with empty bytes
        byte[] bytes = new byte[size - data.length()];
        String temp = new String(bytes);
        data = data + temp;
        writeToFile(filePath, data, (index-1) * size);
    }

    private static void writeToFile(String filePath,String data, int position)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}  