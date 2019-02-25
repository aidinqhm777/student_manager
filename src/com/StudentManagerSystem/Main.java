package com.StudentManagerSystem;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        String filePath = "./src/com/StudentManagerSystem/data/File";
        int sizeOfTest = 61;


        Test t =new  Test();
        Test t2 =new  Test();
        t.data = 22;
        t2.data = 1456221112;

        try {
            FileIO.writeObjectOfindex(filePath, t, 1, sizeOfTest);
            FileIO.writeObjectOfindex(filePath, t2, 2, sizeOfTest);

            Test t4 = (Test) FileIO.readObjectOfIndex(filePath,1, sizeOfTest);
            Test t5 = (Test) FileIO.readObjectOfIndex(filePath,2, sizeOfTest);

            System.out.println(t5.data);
            System.out.println(t4.data);

        } catch (IOException | ClassNotFoundException e) {
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
