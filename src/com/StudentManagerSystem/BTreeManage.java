package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class BTreeManage {

    private static BPlusTree<Integer,Integer> StudentUniID_btree = new BPlusTree<>();
    private static BPlusTree<String,Integer> StudentName_btree = new BPlusTree<>();
    private static BPlusTree<String,Integer> StudentLastname_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer> StudentID_btree =new BPlusTree<>();


//    save load btrees
//    find insert delete info from or to btrees indirectly

    public static void load() {

        loadBtree_StudentUniID();
        loadBtree_StudentID();
        loadBtree_StudentName();
        loadBtree_StudentLastname();
    }
    public static void save() {

        saveBtree_StudentID();
        saveBtree_StudentUniID();
        saveBtree_StudentName();
        saveBtree_StudentLastname();
    }

    private static void loadBtree_StudentUniID() {
        // load btree if empty
        try {
            if (StudentUniID_btree == null) StudentUniID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_StudentUniID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentName() {
        try {
            if (StudentName_btree == null) StudentName_btree = (BPlusTree<String, Integer>) FileManage.loadBtree_StudentName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentLastname() {
        try {
            if (StudentLastname_btree == null) StudentLastname_btree = (BPlusTree<String, Integer>) FileManage.loadBtree_StudentLastName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentID() {
        try {
            if (StudentName_btree == null) StudentName_btree = (BPlusTree<String, Integer>) FileManage.loadBtree_StudentName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }

    private static void saveBtree_StudentUniID() {
        // save btree if is't empty
        try {
            if (StudentUniID_btree != null) FileManage.saveBtree_StudentUniID(StudentUniID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentName() {
        try {
            if (StudentName_btree != null) FileManage.saveBtree_StudentUniID(StudentUniID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentLastname() {
        try {
            if (StudentLastname_btree != null) FileManage.saveBtree_StudentUniID(StudentLastname_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentID() {
        try {
            if (StudentUniID_btree != null) FileManage.saveBtree_StudentUniID(StudentID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }






    //------------------------------------------------------------------------
    //------------------------------------------------------------------------


    //CRUD operations on student personal info

    //add student key and index to BTree

    public static void createStudent(Student student) {

        createStudentuniID(student.getUniID() , student.getIndex_PersonalInfo());
        createStudentLastname(student.getLastname() , student.getIndex_PersonalInfo());
        createStudentName(student.getName() , student.getIndex_PersonalInfo());
        createStudentID(student.getId() , student.getIndex_PersonalInfo());
    }

    private static void createStudentuniID(int uniID, int index) {
        StudentUniID_btree.insert(uniID , index);
    }
    private static void createStudentID(int id, int index) {
        StudentID_btree.insert(id , index);
    }
    private static void createStudentName(String name, int index) {
        StudentName_btree.insert(name , index);
    }
    private static void createStudentLastname(String lastname, int index) {
        StudentLastname_btree.insert(lastname , index);
    }



    //update

    public static void updateStudent(Student student) {}
    private static void updateStudentUniID(int uniID) {}
    private static void updateStudentID(int id) {}
    private static void updateStudentName(String name) {}
    private static void updateStudentLastname(String lastname) {}



    //find and return index

    public static int readStudent(String inputKey, String searchField) {
        return readByStudentUniID(Integer.parseInt(inputKey));
    }
    private static int readByStudentUniID(int input)    {
        return StudentUniID_btree.search(input);
    }
    private static int readByStudentName(String input)     {
        return StudentName_btree.search(input);
    }
    private static int readByStudentLastname(String input) {
        return StudentLastname_btree.search(input);
    }
    private static int readByStudentID(int  input)       {
        return StudentID_btree.search(input);
    }



    //remove index records from BTree

    public static void deleteStudent(Student student) {
        deleteStudentID(student.getId());
        deleteStudentName(student.getName());
        deleteStudentLastname(student.getLastname());
        deleteStudentUniID(student.getId());
    }

    private static void deleteStudentUniID(int UniId)    {
        StudentUniID_btree.delete(UniId);
    }
    private static void deleteStudentName(String name)     {
        StudentName_btree.delete(name);
    }
    private static void deleteStudentLastname(String lastname) {
        StudentLastname_btree.delete(lastname);
    }
    private static void deleteStudentID(int id)       {
        StudentID_btree.delete(id);

    }



}