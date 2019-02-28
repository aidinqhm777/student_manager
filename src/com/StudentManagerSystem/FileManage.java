package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;
import java.io.IOException;

public class FileManage {
    //standard sizes
    private static int String_10bit = 10;
    private static int String_30bit = 30;
    private static int String_60bit = 60;

    //file paths
    private static String StudentUniID_filePath = "";
    private static String StudentName_filePath = "";
    private static String StudentLastName_filePath = "";
    private static String StudentBirthday_filePath = "";
    private static String StudentPhoneNum_filePath = "";
    private static String StudentID_filePath = "";


    private static String btree_StudentUniID_filePath = "";
    private static String btree_StudentName_filePath = "";
    private static String btree_StudentLastname_filePath = "";
    private static String btree_StudentID_filePath = "";

//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------


    //get index and read all the records. optional reading should be added TODO
    public static String[] readRecords(String index) {
        //i don't get it @Amir
        return new String[6];
    }

    private static String readStudentName(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentName_filePath, index, String_30bit);
    }
    private static String readStudentLastname(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentLastName_filePath, index, String_60bit);
    }
    private static String readStudentUniID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (String)FileIO.readObjectWithIndex(StudentUniID_filePath, index, String_10bit);
    }
    private static String readStudentID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (String)FileIO.readObjectWithIndex(StudentID_filePath, index, String_10bit);
    }
    private static String readStudentPhoneNum(int index)
            throws IOException, ClassNotFoundException {
        // 414223355
        return (String)FileIO.readObjectWithIndex(StudentPhoneNum_filePath, index, String_10bit);
    }
    private static String readStudentBirthday(int index)
            throws IOException, ClassNotFoundException {
        //   => 1397/01/01
        return (String)FileIO.readObjectWithIndex(StudentBirthday_filePath, index, String_10bit);
    }


    //get index and write all the records. optional writing should be added TODO
    public static void writeRecords(String[] records) {
        //i don't get it @Amir
    }

    private static void writeStudentName(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, o, index, String_30bit);
    }
    private static void writeStudentLastname(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, o, index, String_60bit);
    }
    private static void writeStudentUniID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniID_filePath, o, index, String_10bit);
    }
    private static void writeStudentID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentID_filePath, o, index, String_10bit);
    }
    private static void writeStudentPhoneNum(int index, Object o)
            throws IOException {
        // 414223355
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, o, index, String_10bit);
    }
    private static void writeStudentBirthday(int index, Object o)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthday_filePath, o, index, String_10bit);
    }


    private static void create_StudentUniID() {}
    private static void create_StudentName() {}
    private static void create_StudentLastname() {}
    private static void create_StudentBirthdate() {}
    private static void create_StudentPhoneNum() {}
    private static void create_StudentID() {}
    private static void create_btree_StudentUniID() {}
//    private static void updateStudent(){}


    private static void create_StudentSubs_CurrentSem() {}
    private static void create_StudentSubs_PreviousSems() {}


    public static void edit_StudentUniID() {}
    public static void edit_StudentName() {}
    public static void edit_StudentLastname() {}
    public static void edit_StudentBirthdate() {}
    public static void edit_StudentPhoneNum() {}
    public static void edit_StudentID() {}




//load and save the btree's in file
    public static BPlusTree loadBtree_StudentUniID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentUniID_filePath);
    }
    public static void saveBtree_StudentUniID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentUniID_filePath, o);
    }

    public static BPlusTree loadBtree_StudentID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentID_filePath);
    }
    public static void saveBtree_StudentID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentID_filePath, o);
    }

    public static BPlusTree loadBtree_StudentName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentName_filePath);
    }
    public static void saveBtree_StudentName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentName_filePath, o);
    }

    public static BPlusTree loadBtree_StudentLastName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentLastname_filePath);
    }
    public static void saveBtree_StudentLastName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentLastname_filePath, o);
    }


    public static void addStudent(String index) {}

}
