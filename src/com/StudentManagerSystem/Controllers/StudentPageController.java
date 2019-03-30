package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.Enrollment;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.SystemManage;
import java.io.IOException;

public class StudentPageController {

    private static Student information;

    public class Input {

        String subjectID;
        String subjectCode;


//        TODO setters and getters should change data types : string to int ...
        public int getSubjectID() {
            return Integer.parseInt(subjectID);
        }

        public void setSubjectID(String subjectID) {
            this.subjectID = subjectID;
        }

        public String getSubjectCode() {
            return subjectCode;
        }

        public void setSubjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
        }
    }

    public static void addSubject(Input input) throws IOException {

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentID(information.getUniID());
        enrollment.setSubjectID(input.getSubjectID());
        SystemManage.addEnrollment(enrollment);
    }

    public static void removeSubject(Input input) throws IOException {

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentID(information.getUniID());
        enrollment.setSubjectID(input.getSubjectID());
        SystemManage.setEnrollmentTmp(enrollment);
        SystemManage.removeEnrollment();
    }

    public static void editInformation(){
        //edit information of student
    }

    public static void loadInformation() {
        information = (Student)LoginPageController.getLoggedIn(); // get the login data from login page
    }

    public static void loadInput(Input student) {
        //TODO load info to buffer
    }

    public static Student displayInformation() {
        return information;//TODO must be cloned
    }
}
