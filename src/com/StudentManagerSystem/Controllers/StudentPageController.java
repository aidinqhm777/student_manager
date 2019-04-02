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
    public static void updateSubjectGpCode(int studentid , int subjectid , Enrollment updated) throws Exception{
        EnrollmentSearcher enrollmentSearcher = new EnrollmentSearcher();
        enrollmentSearcher.setSearchByStudent(true);
        enrollmentSearcher.setStudentID(studentid);
        enrollmentSearcher.setSubjectID(subjectid);
        LinkedList<Enrollment> enrollents = SystemManage.searchEnrollment(enrollmentSearcher);
        Enrollment enrollment = enrollents.pop();
        SystemManage.editEnrollment(enrollment , updated);
    }
    public static LinkedList showSubjectsInformation(int id) throws Exception{
         LinkedList subjects = new LinkedList<Subject>();
        EnrollmentSearcher enrollmentSearcher = new EnrollmentSearcher();
        enrollmentSearcher.setSearchByStudent(true);
        enrollmentSearcher.setStudentID(id);
        LinkedList<Enrollment> enrollements = SystemManage.searchEnrollment(enrollmentSearcher);
        while (!enrollements.isEmpty()){
            Enrollment enrollment;
            enrollment= enrollements.pop();
            subjects.push(enrollment.getSubject());
        }
        return subjects;
    }
    public static LinkedList searchSubject(int id)throws IOException, ClassNotFoundException{
        SubjectSearcher subjectSearcher = new SubjectSearcher();
        subjectSearcher.setSearchById(true);
        subjectSearcher.setId(id);
        return SystemManage.searchSubject(subjectSearcher);
    }
    public static void loadInformation(int uniID) throws IOException, ClassNotFoundException {
        //TODO sets properties to information
        StudentSearcher searcher = new StudentSearcher();
        searcher.setUniID(uniID);
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
    public static Student displayInformation() {
        return information;
    }

}
