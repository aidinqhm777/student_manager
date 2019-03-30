/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.managers;

import com.StudentManagerSystem.dataContainer.Enrollment;

import java.io.Serializable;
import java.util.LinkedList;

public class IndexManage implements Serializable {

    private int studentCount = 0;
    private int lineCountStudent = 0;
    private int lineCountSubject = 0;
    private int lineCountEnrollment = 0;
    private LinkedList<Integer> recentlyDeletedStudents = new LinkedList<>();
    private LinkedList<Integer> recentlyDeletedSubjects = new LinkedList<>();
    private LinkedList<Integer> recentlyDeletedEnrollments = new LinkedList<>();


    int addStudent() {

        if (recentlyDeletedStudents.isEmpty()) {

            studentCount++;
            return ++lineCountStudent;
        } else
            return recentlyDeletedStudents.pop();
    }
    void removeStudent(int index) {

        recentlyDeletedStudents.push(index);
        studentCount--;
    }


    public int addSubject() {

         if (recentlyDeletedSubjects.isEmpty()) {

             return ++lineCountSubject;
         } else
             return recentlyDeletedSubjects.pop();
     }
    public void deleteSubject(int index) {

        recentlyDeletedSubjects.push(index);
    }


    public void createEnrollment(Enrollment enrollment) {

        if (recentlyDeletedEnrollments.isEmpty())
            enrollment.setEnrollmentIndex(++lineCountEnrollment);

        else
            enrollment.setEnrollmentIndex(recentlyDeletedStudents.pop());
    }
    static void updateEnrollment(Enrollment enrollment) {}
    public void deleteEnrollment(Enrollment enrollment) {

        recentlyDeletedStudents.push(enrollment.getEnrollmentIndex());
    }





}




