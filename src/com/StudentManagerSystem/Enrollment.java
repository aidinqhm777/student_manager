
package com.StudentManagerSystem;

public class Enrollment {


    private int studentID;
    private int subjectID;
    private int subjectCode;
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

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }
}
