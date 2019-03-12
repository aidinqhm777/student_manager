
package com.StudentManagerSystem;

public class EnrollmentSearcher {


    private int studentID;
    private int subjectID;
    private boolean searchByStudent;
    private boolean searchBySubject;


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

    public boolean isSearchByStudent() {
        return searchByStudent;
    }

    public void setSearchByStudent(boolean searchByStudent) {
        this.searchByStudent = searchByStudent;
    }

    public boolean isSearchBySubject() {
        return searchBySubject;
    }

    public void setSearchBySubject(boolean searchBySubject) {
        this.searchBySubject = searchBySubject;
    }
}
