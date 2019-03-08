/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;
public class Subject {
    private int index_PersonalInfo;
    private int ID;
    private String title;
    private int number;
    private String Professorname;

    public int getIndex_PersonalInfo() {
        return index_PersonalInfo;
    }

    public void setIndex_PersonalInfo(int index_PersonalInfo) {
        this.index_PersonalInfo = index_PersonalInfo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProfessorname() {
        return Professorname;
    }

    public void setProfessorname(String professorname) {
        Professorname = professorname;
    }

}