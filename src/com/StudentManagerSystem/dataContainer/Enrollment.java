
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.dataContainer;

public class Enrollment {


    private int studentID;
    private int subjectID;
    private int studentIndex;
    private int subjectIndex;

    private int enrollmentIndex;




    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getEnrollmentIndex() {
        return enrollmentIndex;
    }

    public void setEnrollmentIndex(int enrollmentIndex) {
        this.enrollmentIndex = enrollmentIndex;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public int getSubjectIndex() {
        return subjectIndex;
    }

    public void setSubjectIndex(int subjectIndex) {
        this.subjectIndex = subjectIndex;
    }

}
