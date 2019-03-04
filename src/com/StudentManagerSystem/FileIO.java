package com.StudentManagerSystem;

import java.io.*;


public class FileIO {

    //to write btree class to file
    public static void writeAnObjectToFile(String filePath, Object o) throws IOException {
        FileOutputStream f = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(f);
        oos.writeObject(o);
    }

    //to read btree class from file
    public static Object readAnObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        InputStream file = new FileInputStream(filePath);
        InputStream buffer = new BufferedInputStream(file);
        ObjectInput input = new ObjectInputStream(buffer);
        return input.readObject();
    }

    public static Object readObjectWithIndex(String filepath, int index, int size)
            throws IOException, ClassNotFoundException, NullPointerException {
        if (isEmpty(filepath, index, size)) return null;
        else
            return FileIO.bytesToObject(readIndexFromFile(filepath, index, size));
    }

    public static void writeObjectWithIndex(String filepath, Object o, int index, int size)
            throws IOException {

        byte[] b = FileIO.objectToByte(o);
        FileIO.writeIndexToFile(filepath, b, index, size);
    }

    public static void writeObjectWithIndex(String filepath, Object o, int index)
            throws IOException {
        byte[] b = FileIO.objectToByte(o);
        //automatic size
        int size = b.length;
        FileIO.writeIndexToFile(filepath, b, index, size);
    }

    public static void cleanIndex(String filepath, int index, int size)
            throws IOException {

        byte[] b = new byte[size];
        writeIndexToFile(filepath, b, index, size);
    }

    private static boolean isEmpty(String filepath, int index, int size)
            throws IOException {

        byte[] b = readIndexFromFile(filepath, index, size);
        return b[0] == 0 && b[size - 1] == 0 && b[size / 2] == 0;
    }

    private static void writeIndexToFile(String filePath, byte[] data, int index, int size)
            throws IOException {
        //check size of input Data
        if (data.length > size) throw new ArrayIndexOutOfBoundsException();
        //add state to file
        writeToFile(filePath, data, (index - 1) * size);
    }

    private static byte[] readIndexFromFile(String filePath, int index, int size)
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

    private static void writeToFile(String filePath, byte[] data, int position)
            throws IOException {
        java.io.RandomAccessFile file = new java.io.RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data);
        file.close();
    }

    private static byte[] objectToByte(Object serObj)
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

    private static Object bytesToObject(byte[] bytesIn)
            throws IOException, ClassNotFoundException {

        ByteArrayInputStream bis = new ByteArrayInputStream(bytesIn);
        ObjectInput in;
        in = new ObjectInputStream(bis);
        Object o = in.readObject();
        in.close();
        return o;
    }
}