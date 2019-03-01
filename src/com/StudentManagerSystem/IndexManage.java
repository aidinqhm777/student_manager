package com.StudentManagerSystem;

import java.util.LinkedList;

public class IndexManage {

    private static int studentCount = 1;
//    private static int[] recentlyDeleted = new int[2000];
    static LinkedList <Integer> recentlyDeleted = new LinkedList<>();



    public static int addStudent() {return studentCount++;}
    public static void removeStudent(int index) {}



//    public static void remove(int index){

//        Btree.remove(index);
//        recentlyDeleted.push(index);
//    }

}
