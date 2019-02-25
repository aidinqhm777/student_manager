package com.StudentManagerSystem;

import java.io.*;


public class FileIO {

    public static byte[] readIndexFromFile(String filePath, int index, int size)
            throws IOException {
        return  readFromFile(filePath, (index - 1) * size, size);
    }

    public static void writeIndexToFile(String filePath, byte[] data, int index, int size)
            throws IOException {
        //check size of input data
        if (data.length > size) throw new ArrayIndexOutOfBoundsException();

//        byte[] temp = new byte[data.length + 1];
//        System.arraycopy(data, 0, temp, 1, data.length);
//        temp[0] =1;

        //add state to file
        writeToFile(filePath, data , (index - 1) * size);
    }

    public static Object readObjectOfIndex(String filepath, int index, int size)
            throws IOException, ClassNotFoundException {

        return FileIO.bytesToObject(readIndexFromFile(filepath,index,size));
    }

    public static void writeObjectOfindex(String filepath, Object o, int index, int size)
            throws IOException {

        byte[] b = FileIO.objectToByte(o);
        FileIO.writeIndexToFile(filepath, b, index, size);
    }

    public static void cleanIndex(String filepath, int index, int size)
            throws IOException {

        byte[] b = new byte[size];
        writeIndexToFile(filepath, b, index, size);
    }

    public static boolean isEmpty(String filepath, int index, int size)
            throws IOException {

        byte[] b = readIndexFromFile(filepath, index, size);
        return b[0] == 0 && b[size-1] == 0 && b[size / 2] == 0;
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

    private static void writeToFile(String filePath,byte[] data, int position)
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