package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;
import java.io.IOException;

public class FileManage {

    //standard sizes
    private static int String_10bit = 17;
    private static int String_30bit = 37;
    private static int String_60bit = 67;
    private static int INTEGER = 81;

    //file paths
    private static String StudentUniID_filePath = "./src/com/StudentManagerSystem/data/UniID";
    private static String StudentName_filePath = "./src/com/StudentManagerSystem/data/Name";
    private static String StudentLastName_filePath = "./src/com/StudentManagerSystem/data/Lastname";
    private static String StudentBirthDate_filePath = "./src/com/StudentManagerSystem/data/BirthDate";
    private static String StudentPhoneNum_filePath = "./src/com/StudentManagerSystem/data/PhoneNum";
    private static String StudentID_filePath = "./src/com/StudentManagerSystem/data/ID";


    private static String btree_StudentUniID_filePath = "./src/com/StudentManagerSystem/data/Btree_UniID";
    private static String btree_StudentName_filePath = "./src/com/StudentManagerSystem/data/Btree_Name";
    private static String btree_StudentLastname_filePath = "./src/com/StudentManagerSystem/data/Btree_Lastname";
    private static String btree_StudentID_filePath = "./src/com/StudentManagerSystem/data/Btree_ID";

//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------



    //get index and write all the records. optional writing should be added TODO
    public static void createStudent(Student student) throws IOException {
        int index = student.getIndex_PersonalInfo();
        createStudentName(index, student.getName());
        createStudentLastname(index, student.getLastname());
        createStudentID(index, student.getId());
        createStudentUniID(index, student.getUniID());
        createStudentPhoneNum(index, student.getPhoneNum());
        createStudentBirthdate(index, student.getBirthDate());
    }

    private static void createStudentName(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, o, index, String_30bit);
    }
    private static void createStudentLastname(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, o, index, String_60bit);
    }
    private static void createStudentUniID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniID_filePath, o, index, INTEGER);
    }
    private static void createStudentID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentID_filePath, o, index, INTEGER);
    }
    private static void createStudentPhoneNum(int index, Object o)
            throws IOException {
        // 414223355
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, o, index, String_10bit);
    }
    private static void createStudentBirthdate(int index, Object o)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthDate_filePath, o, index, String_30bit);
    }



    //get index and read all the records. optional reading should be added TODO
    public static Student readStudent(int index) throws IOException, ClassNotFoundException {
        Student s = new Student();
        s.setIndex_PersonalInfo(index);
        s.setName(readStudentName(index));
        s.setLastname(readStudentLastname(index));
        s.setUniID(readStudentUniID(index));
        s.setId(readStudentID(index));
        s.setBirthDate(readStudentBirthdate(index));
        s.setPhoneNum(readStudentPhoneNum(index));
        return s;
    }

    private static String readStudentName(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentName_filePath, index, String_30bit);
    }
    private static String readStudentLastname(int index)
            throws IOException, ClassNotFoundException {
        return (String)FileIO.readObjectWithIndex(StudentLastName_filePath, index, String_60bit);
    }
    //null pointer TODO
    private static int readStudentUniID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (Integer) FileIO.readObjectWithIndex(StudentUniID_filePath, index, INTEGER);
    }
    private static int readStudentID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (Integer) FileIO.readObjectWithIndex(StudentID_filePath, index, INTEGER);
    }
    private static String readStudentPhoneNum(int index)
            throws IOException, ClassNotFoundException {
        // 414223355
        return (String)FileIO.readObjectWithIndex(StudentPhoneNum_filePath, index, String_10bit);
    }
    private static String readStudentBirthdate(int index)
            throws IOException, ClassNotFoundException {
        //   => 1397/01/01
        return (String)FileIO.readObjectWithIndex(StudentBirthDate_filePath, index, String_30bit);
    }


    //update student's personal info records
    public static void updateStudent(Student student) {

    }

    private static String emptyString(int size){
        return String.format("%"+(size-7)+"s","");
    }
    private static Integer emptyInteger(){
        return 0;
    }


    //remove student's personal info records
    public static void deleteStudent(Student student) throws IOException {
        int index = student.getIndex_PersonalInfo();
        deleteStudentName(index);
        deleteStudentLastname(index);
        deleteStudentID(index);
        deleteStudentUniID(index);
        deleteStudentPhoneNum(index);
        deleteStudentBirthdate(index);
    }


    private static void deleteStudentName(int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, emptyString(String_30bit), index, String_30bit);
    }
    private static void deleteStudentLastname(int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, emptyString(String_60bit), index, String_60bit);
    }
    private static void deleteStudentUniID(int index)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniID_filePath, emptyInteger(), index, INTEGER);
    }
    private static void deleteStudentID(int index)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentID_filePath, emptyInteger(), index, INTEGER);
    }
    private static void deleteStudentPhoneNum(int index)
            throws IOException {
        // 414223355
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, emptyString(String_10bit), index, String_10bit);
    }
    private static void deleteStudentBirthdate(int index)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthDate_filePath, emptyString(String_30bit), index, String_30bit);
    }





    //load and save the btree's in file
    public static BPlusTree loadBtree_StudentUniID() throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentUniID_filePath);
    }
    public static void saveBtree_StudentUniID(Object o) throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentUniID_filePath, o);
    }
    public static BPlusTree loadBtree_StudentID() throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentID_filePath);
    }
    public static void saveBtree_StudentID(Object o) throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentID_filePath, o);
    }
    public static BPlusTree loadBtree_StudentName() throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentName_filePath);
    }
    public static void saveBtree_StudentName(Object o) throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentName_filePath, o);
    }
    public static BPlusTree loadBtree_StudentLastName() throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentLastname_filePath);
    }
    public static void saveBtree_StudentLastName(Object o) throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentLastname_filePath, o);
    }



}