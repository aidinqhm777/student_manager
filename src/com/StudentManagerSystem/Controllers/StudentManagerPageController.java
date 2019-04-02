
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.Subject;
import com.StudentManagerSystem.SystemManage;

import java.io.IOException;

public class StudentManagerPageController {

    public static void loadStudentsInformation(){}
    public static void loadSemesterSubjects(){}
    public static void loadAllSubjects(){}
    public static void loadAllSubjectsOfFaculty(){}
    public static void updateInformation(){}
    public static void addSubject(Subject subject) throws IOException, ClassNotFoundException {
        SystemManage.setSubjectTmp(subject);
        SystemManage.addSubject();
    }
    public static void removeSubject(Subject subject) throws IOException {
        SystemManage.setSubjectTmp(subject);
        SystemManage.removeSubject();
    }
    public static void updateSubject(Subject subject1 , Subject subject2) throws IOException {
        SystemManage.setSubjectTmp(subject1);
        SystemManage.setUpdatedSubjectTmp(subject2);
        SystemManage.editSubject();
    }
    public static void addStudent(Student student) throws IOException{
        SystemManage.setStudentTmp(student);
        SystemManage.signupStudent();
    }
    public static void removeStudent(Student student) throws IOException{
        SystemManage.setStudentTmp(student);
        SystemManage.removeStudent();
    }
    public static void updateStudent(Student student) throws IOException{
        SystemManage.setStudentTmp(student);
        SystemManage.updateStudent();
    }



}
