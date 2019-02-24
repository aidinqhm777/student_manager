package com.StudentManagerSystem;

import java.io.*;

import static java.nio.file.attribute.PosixFilePermissions.fromString;

public class Main {
    static String filePath = "./src/com/StudentManagerSystem/data/File";

    public static void main(String[] args) {
        Test t =new  Test();
        t.data = 22;
        try {
            byte[] b= FileIO.objectToByte(t);
            Test t2 = (Test) FileIO.bytesToObject(b);
            System.out.println(t2.data);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
