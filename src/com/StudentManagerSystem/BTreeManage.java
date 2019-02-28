package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

public class BTreeManage {

    private static BPlusTree StudentUniID;
    private static BPlusTree StudentName;
    private static BPlusTree StudentLastname;
    private static BPlusTree StudentID;

//    save load btrees
//    find insert delete info from or to btrees indirectly

    private static void loadBtree_StudentUniID() {

        StudentUniID = FileManage.loadBtree_StudentUniID();
    }
    public static void addStudent(String uniID, String name, String lastname) {}
    private static String find_StudentName() {



        return "1";
    }
    private static String add_StudentName() {return "1";}
    private static String remove_StudentName() {return "1";}
    private static String update_StudentName() {return "1";}

//    Searches--------------

    public static String genericSearch(String inputKey, String searchField) {


        //catch error if searchField is not right TODO
        switch (searchField){

            case "name":
                index = searchByName(searchField);

            case "lastName":
                index = searchByLastname(searchField);

            case "id":
                index = searchByUniID(searchField);

            case "uniID":
                index = searchByID(searchField);

            default:
                index = searchByID(searchField);
        }
        return "";
    }
    private static String searchByStudentUniID(String searchField)    {return "";}
    private static String searchByStudentName(String searchField)     {return "";}
    private static String searchByStudentLastname(String searchField) {return "";}
    private static String searchByStudentID(String searchField)       {return "";}

}