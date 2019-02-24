package com.StudentManegerSystem;

import com.StudentManegerSystem.Btree.BPlusTree;

public class Main {
    public static void main(String[] args){
//        try {
//            FileIO.writeToFile("./src/com/data/File","xx",0);
////            System.out.println( new String (FileIO.readFromFile("File",0,4)) );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        BPlusTree<Integer,String> btree = new BPlusTree<>();
        btree.insert(1,"some");
        System.out.println(btree.search(1));
        btree.delete(2);
        System.out.println(btree.search(1));
    }
}
