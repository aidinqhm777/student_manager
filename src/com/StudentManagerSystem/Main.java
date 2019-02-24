package com.StudentManagerSystem;

import java.io.IOException;

public class Main {
    static String filePath = "./src/com/StudentManagerSystem/data/File";

    public static void main(String[] args){
        try {
//            FileIO.writeIndexToFile(filePath,"hi1name",1,20);
//            FileIO.writeIndexToFile(filePath,"hi 2 name",2,20);
//            FileIO.writeIndexToFile(filePath,"hi 3",3,20);
            FileIO.writeIndexToFile(filePath,"myananansdds",1,20);
            FileIO.writeIndexToFile(filePath,"11",1,20);

            System.out.println( new String (FileIO.readIndexFromFile(filePath,1,20)));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        BPlusTree<Integer,String> btree = new BPlusTree<>();
//        btree.insert(1,"some");
//        System.out.println(btree.search(1));
//        btree.delete(2);
//        System.out.println(btree.search(1));
    }
}
