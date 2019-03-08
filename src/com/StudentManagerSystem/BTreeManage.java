package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.util.LinkedList;

public class BTreeManage {

    private static BPlusTree<Integer,Integer> studentUniID_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer> studentID_btree =new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentName_btree = new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentLastname_btree = new BPlusTree<>();
    private static BPlusTree<String,Integer> subjectTitle_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer>subjectID_btree = new BPlusTree<>();


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
            studentUniID_btree = (BPlusTree<Integer, Integer>) FileManage_old.loadBtree_StudentUniID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentID() {
        try {
           studentID_btree = (BPlusTree<Integer, Integer>) FileManage_old.loadBtree_StudentID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentName() {
        try {
            studentName_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage_old.loadBtree_StudentName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentLastname() {
        try {
            studentLastname_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage_old.loadBtree_StudentLastName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }

    private static void saveBtree_StudentUniID() {
        // save btree if is't empty
        try {
           FileManage_old.saveBtree_StudentUniID(studentUniID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentName() {
        try {
            FileManage_old.saveBtree_StudentName(studentName_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentLastname() {
        try {
            FileManage_old.saveBtree_StudentLastName(studentLastname_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentID() {
        try {
            FileManage_old.saveBtree_StudentID(studentID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }


    //------------------------------------------------------------------------
    //------------------------------------------------------------------------


    @SuppressWarnings("unchecked")
    private static <key extends Comparable<? super key>, value> void createRecord(key input, Integer index, BPlusTree<key, value> bPlusTree) {

        if (input instanceof String){

            LinkedList<Integer> tmp = new LinkedList<>();

            if (bPlusTree.search(input) != null)
                tmp = (LinkedList<Integer>) bPlusTree.search(input);

            tmp.push(index);
                value val = (value) tmp;
                bPlusTree.insert(input, val);
        }

        else if (input instanceof Integer){

            value val = (value) index;
            bPlusTree.insert(input, val);
        }
    }
    private static <key extends Comparable<? super key>, value> value readRecord(key input , BPlusTree<key , value> bPlusTree){
        return bPlusTree.search(input);
    }
    private static <key extends Comparable<? super key>, value> void updateRecord(key input1, key input2, Integer index, BPlusTree<key, value> bPlusTree) {

        if (input1 instanceof String){
            if (!input1.equals(input2)){

               deleteRecord(input1, index, bPlusTree);
                //------------------------------------------------
                LinkedList tmp = (LinkedList<Integer>) bPlusTree.search(input2);
                if (tmp == null)
                    tmp = new LinkedList<>();
                tmp.push(index);
                bPlusTree.insert(input2 , (value) tmp);
            }
        }

        else if(input1 instanceof Integer) {

            if (input1 != input2) {
                bPlusTree.delete(input1);
                bPlusTree.insert(input2, (value) index);
            }
        }

    }
    private static <key extends Comparable<? super key>, value> void deleteRecord(key input, Integer index ,BPlusTree<key , value> bPlusTree){
        if (input instanceof String){

            LinkedList<Integer> tmp = (LinkedList<Integer>) bPlusTree.search(input);
            tmp.remove(tmp.indexOf(index));

            if (tmp.isEmpty())
                bPlusTree.delete(input);
            else
                bPlusTree.insert(input, (value) tmp);
        }

        else if (input instanceof Integer){
            bPlusTree.delete(input);
        }

    }


    //CRUD operations on student personal info

    //add student key and index to BTree

    static void createStudent(Student student) {

        createStudentUniID(student.getUniID() , student.getIndex_PersonalInfo());
        createStudentLastname(student.getLastname() , student.getIndex_PersonalInfo());
        createStudentName(student.getName() , student.getIndex_PersonalInfo());
        createStudentID(student.getId() , student.getIndex_PersonalInfo());
    }

    private static void createStudentUniID(int uniID, int index) {
//        studentUniID_btree.insert(uniID , index);
        createRecord(uniID, index, studentUniID_btree);
    }
    private static void createStudentID(int id, int index) {
//        studentID_btree.insert(id , index);
        createRecord(id, index, studentID_btree);
    }
    private static void createStudentName(String name, int index) {
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (studentName_btree.search(name) != null) {
//            tmp = studentName_btree.search(name);
//        }
//        tmp.push(index);
//        studentName_btree.insert(name , tmp);
        createRecord(name, index, studentName_btree);
    }
    private static void createStudentLastname(String lastname, int index) {
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (studentLastname_btree.search(lastname) != null)
//            tmp = studentLastname_btree.search(lastname);
//
//        tmp.push(index);
//        studentLastname_btree.insert(lastname , tmp);
        createRecord(lastname, index, studentLastname_btree);
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
        LinkedList<Integer> tmp = new LinkedList<>();
        tmp.addAll(studentName_btree.search(input));
        return tmp;
    }
    private static LinkedList<Integer> readByStudentLastname(String input) {
        LinkedList<Integer> tmp = new LinkedList<>();
        tmp.addAll(studentLastname_btree.search(input));
        return tmp;
    }


    //update

    public static void updateStudent(Student student1, Student student2) {

        updateStudentID(student1.getId(), student2.getId(), student1.getIndex_PersonalInfo());
        updateStudentUniID(student1.getUniID(), student2.getUniID(), student1.getIndex_PersonalInfo());
        updateStudentName(student1.getName(), student2.getName(), student1.getIndex_PersonalInfo());
        updateStudentLastname(student1.getLastname(), student2.getLastname(), student1.getIndex_PersonalInfo());
    }

    private static void updateStudentUniID(int uniID1, int uniID2, int index) {

//        if (uniID1 != uniID2) {
//
//            studentUniID_btree.delete(uniID1);
//            studentUniID_btree.insert(uniID2, index);
//        }
        updateRecord(uniID1 , uniID2 , index , studentUniID_btree);
    }
    private static void updateStudentID(int id1, int id2, int index) {

//        if (id1 != id2){
//            studentID_btree.delete(id1);
//            studentID_btree.insert(id2, index);
//        }
        updateRecord(id1 , id2 , index , studentID_btree);
    }
    private static void updateStudentName(String name1, String name2, int index) {

//        if (!name1.equals(name2)){
//
//            LinkedList<Integer> tmp ;
//            tmp = studentName_btree.search(name1);
//            tmp.remove(tmp.indexOf(index));
//
//            if (tmp.isEmpty())
//                studentName_btree.delete(name1);
//            else
//                studentName_btree.insert(name1 ,tmp);
//            //------------------------------------------------
//            tmp = studentName_btree.search(name2);
//            if (tmp == null)
//                tmp = new LinkedList<>();
//            tmp.push(index);
//            studentName_btree.insert(name2 , tmp);
//        }
        updateRecord(name1 , name2 , index , studentName_btree);

    }
    private static void updateStudentLastname(String lastname1, String lastname2, int index) {

//        if (lastname1.equals(lastname2)){
//
//            LinkedList<Integer> tmp ;
//            tmp = studentLastname_btree.search(lastname1);
//            tmp.remove(tmp.indexOf(index));
//
//            if (tmp.isEmpty())
//                studentLastname_btree.delete(lastname1);
//            else
//                studentLastname_btree.insert(lastname1 ,tmp);
//            //------------------------------------------------
//            tmp = studentLastname_btree.search(lastname2);
//            if (tmp == null)
//                tmp = new LinkedList<>();
//            tmp.add(index);
//            studentLastname_btree.insert(lastname2 , tmp);
//        }
        updateRecord(lastname1 , lastname2 , index , studentLastname_btree);
    }

    public static boolean checkDuplicity(int input){
        System.out.println(studentUniID_btree.search(0));
        return studentID_btree.search(input) != null;
    }

    //remove index records from BTree
    public static void deleteStudent(Student student) {
        deleteStudentID(student.getId(), student.getIndex_PersonalInfo());
        deleteStudentName(student.getName(), student.getIndex_PersonalInfo());
        deleteStudentLastname(student.getLastname(), student.getIndex_PersonalInfo());
        deleteStudentUniID(student.getUniID(), student.getIndex_PersonalInfo());
    }

    private static void deleteStudentUniID(int UniId, int index)    {
//        studentUniID_btree.delete(UniId);
        deleteRecord(UniId, index, studentUniID_btree);
    }
    private static void deleteStudentName(String name, int index)     {

//        LinkedList<Integer> tmp = studentName_btree.search(name);
//        tmp.remove(tmp.indexOf(index));
//        if (tmp.isEmpty())
//            studentName_btree.delete(name);
//        else
//            studentName_btree.insert(name ,tmp);
        deleteRecord(name, index, studentName_btree);
    }
    private static void deleteStudentLastname(String lastname, int index) {

//        LinkedList<Integer> tmp = studentLastname_btree.search(lastname);
//        tmp.remove(tmp.indexOf(index));
//        if (tmp.isEmpty())
//            studentLastname_btree.delete(lastname);
//        else
//            studentLastname_btree.insert(lastname ,tmp);
        deleteRecord(lastname, index, studentLastname_btree);
    }
    private static void deleteStudentID(int id, int index)       {
//        studentID_btree.delete(id);
        deleteRecord(id, index, studentID_btree);
    }

    //add Subject
    //-----------------------------------------------------
    public static void createSubject(Subject subject){
        createSubjectID(subject.getID() , subject.getIndex_PersonalInfo());
        createSubjectTitle(subject.getTitle() , subject.getIndex_PersonalInfo());
    }

    private static void createSubjectTitle(String title , int index){
        createRecord(title , index , subjectTitle_btree);
    }
    private static void createSubjectID(int id , int index){
        createRecord(id , index , subjectID_btree);
    }

    public static void deleteSubject(Subject subject){
        deleteSubjectID(subject.getID() , subject.getIndex_PersonalInfo());
        deleteSubjectTitle(subject.getTitle() , subject.getIndex_PersonalInfo());
    }

    private static void deleteSubjectID(int id , int index){

        deleteRecord(id , index , subjectID_btree);
    }
    private static void deleteSubjectTitle(String title , int index){
        deleteRecord(title , index , subjectTitle_btree);
    }

    public static void updateSubject(Subject subject1 , Subject subject2){
        updateSubjectID(subject1.getID() , subject2.getID() , subject1.getIndex_PersonalInfo());
        updateStudentTitle(subject1.getTitle() , subject2.getTitle() , subject1.getIndex_PersonalInfo());
    }

    private static void updateSubjectID(int id1, int id2, int index) {
        updateRecord(id1 , id2 , index , subjectID_btree);
    }
    private static void updateStudentTitle(String title1, String title2, int index) {
        updateRecord(title1 , title2 , index , subjectTitle_btree);


    }


}
