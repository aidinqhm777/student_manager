package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.util.LinkedList;

public class BTreeManage {

    private static BPlusTree<Integer,Integer> studentUniID_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer> studentID_btree =new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentName_btree = new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentLastname_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer>subjectID_btree = new BPlusTree<>();
    private static BPlusTree<String,Integer>subjecttitle_btree = new BPlusTree<>();

    // general methods




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
            studentUniID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_StudentUniID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentID() {
        try {
           studentID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_StudentID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentName() {
        try {
            studentName_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage.loadBtree_StudentName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentLastname() {
        try {
            studentLastname_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage.loadBtree_StudentLastName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }

    private static void saveBtree_StudentUniID() {
        // save btree if is't empty
        try {
           FileManage.saveBtree_StudentUniID(studentUniID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentName() {
        try {
            FileManage.saveBtree_StudentName(studentName_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentLastname() {
        try {
            FileManage.saveBtree_StudentLastName(studentLastname_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentID() {
        try {
            FileManage.saveBtree_StudentID(studentID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }


    //------------------------------------------------------------------------
    //------------------------------------------------------------------------


    //CRUD operations on student personal info

    //add student key and index to BTree

    public static void createStudent(Student student) {

        createStudentUniID(student.getUniID() , student.getIndex_PersonalInfo());
        createStudentLastname(student.getLastname() , student.getIndex_PersonalInfo());
        createStudentName(student.getName() , student.getIndex_PersonalInfo());
        createStudentID(student.getId() , student.getIndex_PersonalInfo());
    }

    private static void createStudentUniID(int uniID, int index) {
        studentUniID_btree.insert(uniID , index);
    }
    private static void createStudentID(int id, int index) {
        studentID_btree.insert(id , index);
    }
    private static void createStudentName(String name, int index) {
        LinkedList<Integer> tmp = new LinkedList<>();
//        System.out.println(studentName_btree.search("amir").size());
        if (studentName_btree.search(name) != null) {
            tmp = studentName_btree.search(name);
        }
        tmp.push(index);
        studentName_btree.insert(name , tmp);
    }
    private static void createStudentLastname(String lastname, int index) {
        LinkedList<Integer> tmp = new LinkedList<>();
        if (studentLastname_btree.search(lastname) != null)
            tmp = studentLastname_btree.search(lastname);

        tmp.push(index);
        studentLastname_btree.insert(lastname , tmp);
    }



    //find and return index

    public static Searcher readStudent(Searcher searcher) {

        if (searcher.getSearchByUniID())
            searcher.setIndex(readByStudentUniID(searcher.getUniID()));
        else if (searcher.getSearchByID())
            searcher.setIndex(readByStudentID(searcher.getId()));
        else {

            if (searcher.getSearchByName())
                searcher.setIndexes_name(readByStudentName(searcher.getName()));
            if (searcher.getSearchByLastname())
                searcher.setIndexes_lastname(readByStudentLastname(searcher.getLastname()));
        }
        return searcher;

    }

    private static int readByStudentUniID(int input)    {
        return studentUniID_btree.search(input);
    }
    private static int readByStudentID(int  input)       {
        return studentID_btree.search(input);
    }
    private static LinkedList<Integer> readByStudentName(String input) {
        return studentName_btree.search(input);
    }
    private static LinkedList<Integer> readByStudentLastname(String input) {
        return studentLastname_btree.search(input);
    }


    //update

    public static void updateStudent(Student student1, Student student2) {

        updateStudentID(student1.getId(), student2.getId(), student1.getIndex_PersonalInfo());
        updateStudentUniID(student1.getUniID(), student2.getUniID(), student1.getIndex_PersonalInfo());
        updateStudentName(student1.getName(), student2.getName(), student1.getIndex_PersonalInfo());
        updateStudentLastname(student1.getLastname(), student2.getLastname(), student1.getIndex_PersonalInfo());
    }

    private static void updateStudentUniID(int uniID1, int uniID2, int index) {

        if (uniID1 != uniID2) {

            studentUniID_btree.delete(uniID1);
            studentUniID_btree.insert(uniID2, index);
        }
    }
    private static void updateStudentID(int id1, int id2, int index) {

        if (id1 != id2){

            studentID_btree.delete(id1);
            studentID_btree.insert(id2, index);
        }
    }
    private static void updateStudentName(String name1, String name2, int index) {

        if (!name1.equals(name2)){

            LinkedList<Integer> tmp ;
            tmp = studentName_btree.search(name1);
            tmp.remove(index);

            if (tmp.isEmpty())
                studentName_btree.delete(name1);

            else
                studentName_btree.insert(name1 ,tmp);
            //------------------------------------------------
            tmp = studentName_btree.search(name2);
            tmp.push(index);
            studentName_btree.insert(name2 , tmp);
        }

    }
    private static void updateStudentLastname(String lastname1, String lastname2, int index) {

        if (lastname1.equals(lastname2)){

            LinkedList<Integer> tmp ;
            tmp = studentName_btree.search(lastname1);
            tmp.remove(index);

            if (tmp.isEmpty())
                studentName_btree.delete(lastname1);

            else
                studentName_btree.insert(lastname1 ,tmp);
            //------------------------------------------------
            tmp = studentName_btree.search(lastname2);
            tmp.push(index);
            studentName_btree.insert(lastname2 , tmp);
        }
    }



    //remove index records from BTree

    public static void deleteStudent(Student student) {
        deleteStudentID(student.getId());
        deleteStudentName(student.getName(), student.getIndex_PersonalInfo());
        deleteStudentLastname(student.getLastname(), student.getIndex_PersonalInfo());
        deleteStudentUniID(student.getUniID());
    }

    private static void deleteStudentUniID(int UniId)    {
        studentUniID_btree.delete(UniId);
    }
    private static void deleteStudentName(String name, int index)     {

        LinkedList<Integer> tmp = studentName_btree.search(name);
        tmp.remove(index);
        if (tmp.isEmpty())
            studentName_btree.delete(name);
        else
            studentName_btree.insert(name ,tmp);
    }
    private static void deleteStudentLastname(String lastname, int index) {

        LinkedList<Integer> tmp = studentLastname_btree.search(lastname);
        tmp.remove(index);
        if (tmp.isEmpty())
            studentLastname_btree.delete(lastname);
        else
            studentLastname_btree.insert(lastname ,tmp);
    }
    private static void deleteStudentID(int id)       {
        studentID_btree.delete(id);

    }

    public static void createSubject(Subject subject){
        createSubjectID(subject.getId() , subject.getIndex());
        createSubjecttitle(subject.getTitle() , subject.getIndex());
    }

    private static void createSubjectID(int id , int index){ subjectID_btree.insert(id , index);}
    private static void createSubjecttitle(String title, int index){subjecttitle_btree.insert(title , index);}

    public static void deleteSubject(Subject subject){
        deleteSubjectID(subject.getId() , subject.getIndex());
        deleteSubjecttitle(subject.getTitle() , subject.getIndex());
    }

    private static void deleteSubjectID(int id , int index){ subjectID_btree.delete(id);}
    private static void deleteSubjecttitle(String title, int index){subjecttitle_btree.delete(title);}





    public static void updateSubject(Subject subject1 , Subject subject2){}








    public static void readSubject(){}

}