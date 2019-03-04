package com.StudentManagerSystem;


import java.io.IOException;

public class SystemManage {

    private static IndexManage indexManage = new IndexManage();
    private static UniIDManage uniIDManage = new UniIDManage();
    private static Student studentTmp = new Student();

    private static void addStudent() throws IOException {
        int uniId = uniIDManage.createNewID();
        int index = indexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        studentTmp.setUniID(uniId);
        BTreeManage.createStudent(studentTmp);
        FileManage.createStudent(studentTmp);
    }

    public static void loadProgram() throws IOException, ClassNotFoundException {
        BTreeManage.load();
//        //TODO find a way to save and load this shit
//        indexManage.load();
//        uniIDManage.load();

        indexManage = FileManage.loadIndexManage();
        uniIDManage = FileManage.loadUniIDManage();
    }

    public static void saveProgram() throws IOException {
//        TODO find a way to save and load this shit
        BTreeManage.save();
//        indexManage.save();
//        uniIDManage.save();

        FileManage.saveIndexManage(indexManage);
        FileManage.saveUniIDManage(uniIDManage);
    }

    //buttons
    public static Student searchStudent(String inputKey, String searchField)
            throws IOException, ClassNotFoundException, NullPointerException {
        int index;
        index = BTreeManage.readStudent(inputKey, searchField);
        studentTmp = FileManage.readStudent(index);
        return studentTmp;
    }

    public static Student signUpStudent() throws IOException {
        addStudent();
        return studentTmp;
    }

//    public static Student updateStudent() {
//
//        FileManage.updateStudent(studentTmp);
//        return studentTmp;
//    }

    public static Student removeStudent() throws IOException {

        int index;
        index = studentTmp.getIndex_PersonalInfo();
        BTreeManage.deleteStudent(studentTmp);
        indexManage.removeStudent(index);
        FileManage.deleteStudent(studentTmp);// i don't know if it's needed cause if u remove the index the Data i considered removed
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

}