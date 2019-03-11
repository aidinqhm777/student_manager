
package com.StudentManagerSystem;

import java.util.Date;
import java.util.LinkedList;

public class Subject {


    private int index;
    private int id;
    private int capacity;
    private int unitVal;

    private String title;
    private String professorName;

    private Date examDate;

    private class classTiming {

    }

    private class RequirementsSchema {

        private int[] requiredSubjects_index;

        private LinkedList<Subject> requiredSubjects;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}