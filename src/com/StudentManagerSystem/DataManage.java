package com.StudentManagerSystem;

public class DataManage {

   static class StudentTmp{

        static String uniID;
        static String name;
        static String lastname;
        static String phoneNum;
        static String birthDate;
        static String id;
    }



    private static void readRecord(String input) {}
    private static void addRecord(String input) {}
    private static void updateRecord(String input) {}
    private static void removeRecord(String input) {

       int temp = Integer.parseInt(DataManage.StudentTmp.uniID);
       IndexManage.remove(temp);
    }


    //finds the possible students and inserts data in studenttmp class
    private static void searchByUniID(String uniID) {

       int temp = Integer.parseInt(uniID);
       BTreeManage.find_StudentUniID(temp);
    }
    private static void searchByName(String searchField) {}
    private static void searchByLastname(String searchField) {}
    private static void searchByID(String searchField) {}


    //buttons
    public static void searchStudent() {}
    public static void removeStudent() {}
    public static void updateStudent() {}
    public static void signupStudent() {}

}
