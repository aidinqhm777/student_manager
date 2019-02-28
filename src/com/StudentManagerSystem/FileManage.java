package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class FileManage {

    private static int String_10bit = 10;
    private static int String_30bit = 30;
    private static int String_60bit = 60;


    private static String StudentUniversityNum_filePath = "";
    private static String StudentName_filePath = "";
    private static String StudentLastname_filePath = "";
    private static String StudentBirthdate_filePath = "";
    private static String StudentPhoneNum_filePath = "";
    private static String StudentID_filePath = "";
    private static String btreeStudentUniversityNum_filePath = "file filePath";
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------


    //get index and read all the records. optional reading should be added TODO
    public static String[] readRecords(String index) {
        //همه ی ایندکس ها یکی نیست که بتونیم همشو یه جا بخونیم
        return new String[6];
    }

    private static String readStudentName(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentName_filePath, index, String_30bit);
    }
    private static String readStudentLastname(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentLastname_filePath, index, String_60bit);
    }
    private static String readStudentUniversityNum(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (String)FileIO.readObjectWithIndex(StudentUniversityNum_filePath, index, String_10bit);
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
    private static String readStudentBirthdate(int index)
            throws IOException, ClassNotFoundException {
        //   => 1397/01/01
        return (String)FileIO.readObjectWithIndex(StudentBirthdate_filePath, index, String_10bit);
    }


    //get index and write all the records. optional writing should be added TODO
    public static void writeRecords(String[] records) {}

    private static void writeStudentName(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, o, index, String_30bit);
    }
    private static void writeStudentLastname(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastname_filePath, o, index, String_60bit);
    }
    private static void writeStudentUniversityNum(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniversityNum_filePath, o, index, String_10bit);
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
    private static void writeStudentBirthdate(int index, Object o)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthdate_filePath, o, index, String_10bit);
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





    public static BPlusTree loadBtree_StudentUniID() {return new BPlusTree();}
    public static void addStudent(String index) {}

}
