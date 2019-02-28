/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;

public class SystemManage {

    private static class StudentTmp{

        private static String uniID;
        private static String name;
        private static String lastname;
        private static String phoneNum;
        private static String birthDate;
        private static String id;
        private static String index;

        public static String getUniID() {
            return uniID;
        }

        public static void setUniID(String uniID) {
            StudentTmp.uniID = uniID;
        }

        public static String getName() {
            return name;
        }

        public static void setName(String name) {
            StudentTmp.name = name;
        }

        public static String getLastname() {
            return lastname;
        }

        public static void setLastname(String lastname) {
            StudentTmp.lastname = lastname;
        }

        public static String getPhoneNum() {
            return phoneNum;
        }

        public static void setPhoneNum(String phoneNum) {
            StudentTmp.phoneNum = phoneNum;
        }

        public static String getBirthDate() {
            return birthDate;
        }

        public static void setBirthDate(String birthDate) {
            StudentTmp.birthDate = birthDate;
        }

        public static String getId() {
            return id;
        }

        public static void setId(String id) {
            StudentTmp.id = id;
        }

        public static String getIndex() {
            return index;
        }

        public static void setIndex(String index) {
            StudentTmp.index = index;
        }
    }
    private static class SubjectTmp{}

    private static void addStudent() {

        String index = IndexManage.addStudent();
        BTreeManage.addStudent(StudentTmp.uniID,StudentTmp.name,StudentTmp.lastname);
        FileManage.addStudent(index);
    }
    private static void updateStudent() {

        String index = StudentTmp.getIndex();
        FileManage.updateStudent(StudentTmp.getName(),




        );
    }
    //finds the possible students and inserts data in studenttmp class
//    private static String searchByUniID(String uniID) {
//
//        int temp = Integer.parseInt(uniID);
//        BTreeManage.find_StudentUniID(temp);
//    }
//    private static String searchByName(String searchField) {}
//    private static String searchByLastname(String searchField) {}
//    private static String searchByID(String searchField)

    //buttons
    public static void searchStudent(String inputKey, String searchField) {

        String index;
        String[] records;

        index = BTreeManage.genericSearch(searchField,inputKey);
        records = FileManage.readRecords(index);
        setProps(records[0], records[1], records[2], records[3], records[4], records[5]);

    }
    public static void signupStudent(String name, String lastname, String phoneNum, String birthdate, String id) {

        String uniId = IDManage.createNewID();
        setProps(uniId, name, lastname, phoneNum, birthdate, id);
        addStudent();
    }
    public static void updateStudent(String name, String lastname, String phoneNum, String birthdate, String id, String uniID) {

        setProps(uniID, name, lastname, phoneNum, birthdate, id);


    }
    public static void removeStudent() {}

    //get and set properties
    private static void setProps(String uniId, String name, String lastname, String phoneNum, String birthdate, String id) {

        StudentTmp.setUniID(uniId);
        StudentTmp.setName(name);
        StudentTmp.setLastname(lastname);
        StudentTmp.setPhoneNum(phoneNum);
        StudentTmp.setBirthDate(birthdate);
        StudentTmp.setId(id);
    }
    public static String[] getProps() {return new String[6];}
}
