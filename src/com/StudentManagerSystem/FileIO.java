package com.StudentManagerSystem;

import java.io.*;

public class FileIO {

    public static byte[] readIndexFromFile(String filePath, int index, int size)
            throws IOException {
        return readFromFile(filePath, (index - 1) * size, size);
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
        if (data.length() > size) throw new ArrayIndexOutOfBoundsException();
        //fill data with empty bytes
        byte[] bytes = new byte[size - data.length()];
        String temp = new String(bytes);
        data = data + temp;
        writeToFile(filePath, data, (index - 1) * size);
    }

    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }


    public static byte[] objectToByte(Object serObj)
            throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out;
        byte[] output;
        out = new ObjectOutputStream(bos);
        out.writeObject(serObj);
        out.flush();
        output = bos.toByteArray();
        bos.close();
        return output;
    }

    public static Object bytesToObject(byte[] bytesIn)
            throws IOException, ClassNotFoundException {

        ByteArrayInputStream bis = new ByteArrayInputStream(bytesIn);
        ObjectInput in;
        in = new ObjectInputStream(bis);
        Object o = in.readObject();
        in.close();
        return o;
    }

}