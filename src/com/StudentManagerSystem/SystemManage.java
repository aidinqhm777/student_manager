package com.StudentManagerSystem;

import java.io.IOException;
import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;

public class SystemManage {

    private static IndexManage indexManage = new IndexManage();
    private static UniIDManage uniIDManage = new UniIDManage();
    private static Student studentTmp = new Student();
    private static Student updatedStudentTmp = new Student();



    //read and save the program in files
    public static void loadProgram() throws IOException, ClassNotFoundException {
        BTreeManage.load();
        indexManage = FileManage.loadIndexManage();
        uniIDManage = FileManage.loadUniIDManage();
    }
    public static void saveProgram() throws IOException {

        BTreeManage.save();
        FileManage.saveIndexManage(indexManage);
        FileManage.saveUniIDManage(uniIDManage);
    }

    //buttons
    public static LinkedList<Student> searchStudent(Searcher searcher)
            throws IOException, ClassNotFoundException {

        Searcher foundSearch = BTreeManage.readStudent(searcher);
        foundSearch.matchFoundIndexes();
        while (!foundSearch.getIndexes().isEmpty()) {
            Student tmp = FileManage.readStudent(foundSearch.popIndexes());
            foundSearch.pushStudent(tmp);
        }
        return foundSearch.getStudents();
    }
    public static Student signupStudent() throws IOException {
        if(BTreeManage.checkDuplicity(studentTmp.getId())) throw new DuplicateFormatFlagsException("ID Error");
        int uniId = uniIDManage.createNewID();
        int index = indexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        studentTmp.setUniID(uniId);
        BTreeManage.createStudent(studentTmp);
        FileManage.createStudent(studentTmp);
        return studentTmp;
    }
    public static Student updateStudent() throws IOException {
        //TODO reconsider the code for checking duplicity
        if (studentTmp.getId() != updatedStudentTmp.getId()) { if (BTreeManage.checkDuplicity(updatedStudentTmp.getId())) throw new DuplicateFormatFlagsException("ID ERROR"); }
        FileManage.updateStudent(studentTmp, updatedStudentTmp);
        BTreeManage.updateStudent(studentTmp, updatedStudentTmp);
        studentTmp.setStudent(updatedStudentTmp);
        updatedStudentTmp = new Student();
        return studentTmp;
    }
    public static Student removeStudent() throws IOException {

        int index;
        index = studentTmp.getIndex_PersonalInfo();
        BTreeManage.deleteStudent(studentTmp);

        indexManage.removeStudent(index);
        FileManage.deleteStudent(studentTmp);// i don't know if it's needed cause if u remove the index the data i considered removed
        return studentTmp;
    }

    //get and set properties
    public static void setStudentTmp(Student student) {
        studentTmp.setStudent(student);
    }
    public static Student getStudentTmp() {
        return studentTmp;
    }
    public static void setUpdatedStudentTmp(Student student) {
        updatedStudentTmp.setStudent(student);
    }


    public static LinkedList copyLinkedList(LinkedList copyFrom){
        LinkedList copyTo = new LinkedList();
        copyTo.addAll(copyFrom);
        return copyTo;
    }

}