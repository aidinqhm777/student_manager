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

    public static Object find_StudentUniID(int uniID) {

        return StudentUniID.search(uniID);
    }






    private static String find_StudentName() {



        return "1";
    }
    private static String add_StudentName() {return "1";}
    private static String remove_StudentName() {return "1";}
    private static String update_StudentName() {return "1";}

}