package com.StudentManagerSystem;

import java.io.Serializable;
import java.util.LinkedList;

public class IndexManage implements Serializable {

    private int studentCount = 1;
    private int subjectCount = 1;
    private int lineCount = 0;
    private LinkedList<Integer> recentlyDeleted = new LinkedList<>();




    int addStudent() {

        if (recentlyDeleted.isEmpty()) {

            studentCount++;
            return ++lineCount;
        } else
            return recentlyDeleted.pop();
    }
    void removeStudent(int index) {

        recentlyDeleted.push(index);
        studentCount--;
    }


     int addSubject() {return subjectCount++;}
    public int deleteSubject(int index) {return 1;}



    public static void createEnrollment(Enrollment enrollment) {


    }
    public static void updateEnrollment(Enrollment enrollment) {}
    public static void deleteEnrollment(Enrollment enrollment) {}





}




