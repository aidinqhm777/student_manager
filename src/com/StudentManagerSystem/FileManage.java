package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

public class FileManage {

    private static String StudentUniID_address = "";
    private static String StudentName_address = "";
    private static String StudentLastname_address = "";
    private static String StudentBirthdate_address = "";
    private static String StudentPhoneNum_address = "";
    private static String StudentID_address = "";
    private static String btreeStudentUniID_address = "file address";
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------


    //get index and read all the records. optional reading should be added TODO
    public static String[] readRecords(String index) {return new String[6];}

    private static String readStudentName(String index) {return "";}
    private static String readStudentLastname(String index) {return "";}
    private static String readStudentUniID(String index) {return "";}
    private static String readStudentID(String index) {return "";}
    private static String readStudentPhoneNum(String index) {return "";}
    private static String readStudentBirthdate(String index) {return "";}


    //get index and write all the records. optional writing should be added TODO
    public static void writeRecords(String[] records) {}

    private static void writeStudentName(String record) {}
    //add the others TODO







    private static void create_StudentUniID() {}
    private static void create_StudentName() {}
    private static void create_StudentLastname() {}
    private static void create_StudentBirthdate() {}
    private static void create_StudentPhoneNum() {}
    private static void create_StudentID() {}
    private static void create_btree_StudentUniID() {}


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
