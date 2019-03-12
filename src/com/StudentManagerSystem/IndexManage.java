package com.StudentManagerSystem;

import java.io.Serializable;
import java.util.LinkedList;

public class IndexManage implements Serializable {

    private int studentCount = 0;
    private int subjectCount = 0;
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


    public int addSubject() {return subjectCount++;}
    public int deleteSubject(int index) {return 1;}

    public static int createEnrollment() {

        return 1;
    }
    public void deleteEnrollment(Enrollment enrollment) {}

}




