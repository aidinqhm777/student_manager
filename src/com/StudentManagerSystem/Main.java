/*
 * created by @Amir
*/

package com.StudentManagerSystem;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String filePath = "./src/com/StudentManagerSystem/data/File";

        try {
            long a = 100;
            long b = 1000000000;
            FileIO.writeObjectWithIndex(filePath,a , 1);
            FileIO.writeObjectWithIndex(filePath,b, 2);

        } catch (IOException e) {
            e.printStackTrace();
        }






//        try {
//            System.out.println( FileIO.isEmpty(filePath, 1 , 10));
//            FileIO.cleanIndex(filePath,1,sizeOfTest);
//            System.out.println( FileIO.isEmpty(filePath, 1 , 10));
//            Test t5 = (Test) FileIO.readObjectOfIndex(filePath,1,sizeOfTest);
//            System.out.println(t5.data);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
