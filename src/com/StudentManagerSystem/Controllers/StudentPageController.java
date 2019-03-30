package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.*;

import java.io.IOException;
import java.util.LinkedList;

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


//    course offering
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
    public static LinkedList searchsubject(int id)throws IOException, ClassNotFoundException{
        SubjectSearcher subjectSearcher = new SubjectSearcher();
        subjectSearcher.setSearchById(true);
        subjectSearcher.setId(id);
        return SystemManage.searchSubject(subjectSearcher);
    }
    



    public static void loadInformation(int uniid) throws IOException, ClassNotFoundException {
        //TODO sets properties to information
        StudentSearcher searcher = new StudentSearcher();
        searcher.setUniID(uniid);
        searcher.setSearchByUniID(true);
        LinkedList <Student>slinkedlist= SystemManage.searchStudent(searcher);
        information.setLastname(slinkedlist.peek().getLastname());
        information.setName(slinkedlist.peek().getName());
        information.setId(slinkedlist.peek().getId());
        information.setUniID(slinkedlist.peek().getUniID());
        information.setBirthDate(slinkedlist.peek().getBirthDate());
        information.setPhoneNum(slinkedlist.peek().getPhoneNum());
        information.setIndex_PersonalInfo(slinkedlist.peek().getIndex_PersonalInfo());
    }
    public static void loadInput(Input student) {
//        TODO load info to buffer
    }
    public static Student displayInformation() {

        return information;//TODO must be cloned
    }




}
