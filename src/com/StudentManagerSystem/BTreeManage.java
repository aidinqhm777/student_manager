package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class BTreeManage {

    private static BPlusTree StudentUniID;
    private static BPlusTree StudentName;
    private static BPlusTree StudentLastname;
    private static BPlusTree StudentID;


//    save load btrees
//    find insert delete info from or to btrees indirectly

    private static void loadBtree_StudentUniID() {
        // load btree if empty
        try {
            if (StudentUniID  == null) StudentUniID = FileManage.loadBtree_StudentUniID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentName() {
    }
    private static void loadBtree_StudentLastname() {
    }
    private static void loadBtree_StudentID() {
    }

    private static void saveBtree_StudentUniID() {
        // save btree if is't empty
        try {
            if (StudentUniID != null) FileManage.saveBtree_StudentUniID(StudentUniID);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentName() {
    }
    private static void saveBtree_StudentLastname() {
    }
    private static void saveBtree_StudentID() {

    }



//    Searches--------------

//    public static String genericSearch(String inputKey, String searchField) {
//
//
//        //catch error if searchField is not right TODO
//        switch (searchField){
//
//            case "name":
//                index = searchByName(searchField);
//
//            case "lastName":
//                index = searchByLastname(searchField);
//
//            case "id":
//                index = searchByUniID(searchField);
//
//            case "uniID":
//                index = searchByID(searchField);
//
//            default:
//                index = searchByID(searchField);
//        }
//        return "";
//    }

    //------------------------------------------------------------------------
    //------------------------------------------------------------------------


    //CRUD operations on student personal info

    //add student key and index to BTree

    public static void createStudent(Student student) {}

    private static void createStudentuniID(int uniID, int index) {}
    private static void createStudentID(int id, int index) {}
    private static void createStudentName(String name, int index) {}
    private static void createStudentLastname(String lastname, int index) {}



    //update

    public static void updateStudent(Student student) {}

    private static void updateStudentUniID(int uniID) {}
    private static void updateStudentID(int id) {}
    private static void updateStudentName(String name) {}
    private static void updateStudentLastname(String lastname) {}



    //find and return index

    public static int readStudent(String inputKey, String searchField) {return 1;}

    private static int readByStudentUniID(String searchField)    {return 1;}
    private static int readByStudentName(String searchField)     {return 1;}
    private static int readByStudentLastname(String searchField) {return 1;}
    private static int readByStudentID(String searchField)       {return 1;}



    //remove index records from BTree

    public static void deleteStudent(int uniID) {}

    private static void deleteStudentUniID()    {}
    private static void deleteStudentName()     {}
    private static void deleteStudentLastname() {}
    private static void deleteStudentID()       {}









}