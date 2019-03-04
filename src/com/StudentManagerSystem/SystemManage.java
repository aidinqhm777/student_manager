package com.StudentManagerSystem;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class SystemManage {


    private static Student studentTmp = new Student();
    private static Student updatedStudentTmp = new Student();


    private static Student searchStudent(String inputKey, String searchField) throws IOException, ClassNotFoundException {
        int index;
        index = BTreeManage.readStudent(inputKey, searchField);
        studentTmp = FileManage.readStudent(index);
        return studentTmp;
    }

    public static void loadProgram() {
        BTreeManage.load();
        IndexManage.load();
        UniIDManage.load();
    }
    public static void saveProgram() {
        BTreeManage.save();
        IndexManage.save();
        UniIDManage.save();

    }

    //buttons
    public static LinkedList<Student> searchStudent(Searcher searcher) throws IOException, ClassNotFoundException {

        Searcher foundSearch = BTreeManage.readStudent(searcher);
        foundSearch.matchFoundIndexes();
        while (!foundSearch.getIndexes().isEmpty()) {
            Student tmp = FileManage.readStudent(foundSearch.popIndexes());
            foundSearch.pushStudent(tmp);
        }
        return foundSearch.getStudents();
    }
    public static Student signupStudent() throws IOException {
        int uniId = UniIDManage.createNewID();
        int index = IndexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        studentTmp.setUniID(uniId);
        BTreeManage.createStudent(studentTmp);
        FileManage.createStudent(studentTmp);
        return studentTmp;
    }
    public static Student updateStudent() {

        FileManage.updateStudent(studentTmp, updatedStudentTmp);
        BTreeManage.updateStudent(studentTmp, updatedStudentTmp);
        studentTmp = updatedStudentTmp;
        updatedStudentTmp = new Student();
        return studentTmp;
    }
    public static Student removeStudent() throws IOException {

        int index;
        index = studentTmp.getIndex_PersonalInfo();
        BTreeManage.deleteStudent(studentTmp);
        IndexManage.removeStudent(index);
        FileManage.deleteStudent(studentTmp);// i don't know if it's needed cause if u remove the index the data i considered removed
        return studentTmp;
    }


    //get and set properties

    public static void setStudentTmp(Student student) {
        studentTmp = student;
//        studentTmp.setUniID(student.getUniID());
//        studentTmp.setName(student.getName());
//        studentTmp.setLastname(student.getLastname());
//        studentTmp.setPhoneNum(student.getPhoneNum());
//        studentTmp.setBirthDate(student.getBirthDate());
//        studentTmp.setId(student.getId());
    }
    public static Student getStudentTmp() {
        return studentTmp;
    }
    public static void setUpdatedStudentTmp(Student student) {
         updatedStudentTmp = student;
    }
    public static void setSearcher() {}

}