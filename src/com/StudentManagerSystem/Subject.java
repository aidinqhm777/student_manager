
package com.StudentManagerSystem;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

public class Subject {


    private int index;
    private int id;
    private int code;
    private int capacity;
    private int unitVal;
    private int studentCount;

    private String title;
    private String professorName;

    private ClassTiming classTiming;
    private RequirementsSchema requirements;


    private LocalDate examDate;

    private class ClassTiming {

    }

    private class RequirementsSchema {

        private int[] requiredSubjects_index;

        private LinkedList<Subject> requiredSubjects;
    }






    public Subject copy(Subject subject) {

        return this;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public ClassTiming getClassTiming() {
        return classTiming;
    }

    public void setClassTiming(ClassTiming classTiming) {
        this.classTiming = classTiming;
    }

    public RequirementsSchema getRequirements() {
        return requirements;
    }

    public void setRequirements(RequirementsSchema requirements) {
        this.requirements = requirements;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getUnitVal() {
        return unitVal;
    }

    public void setUnitVal(int unitVal) {
        this.unitVal = unitVal;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}