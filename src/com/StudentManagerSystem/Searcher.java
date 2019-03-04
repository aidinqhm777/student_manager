
package com.StudentManagerSystem;

import java.util.LinkedList;

public class Searcher {

    private int index = -1;
    private int uniID = -1;
    private int id = -1;
    private String name;
    private String lastname;
    private Boolean searchByUniID;
    private Boolean searchByID;
    private Boolean searchByName;
    private Boolean searchByLastname;

    private LinkedList<Student> students;
    private LinkedList<Integer> indexes_name;
    private LinkedList<Integer> indexes_lastname;
    private LinkedList<Integer> indexes;

    public Searcher() {}

    public void reset() {

        searchByID = false;
        searchByName = false;
        searchByLastname = false;
        searchByUniID = false;
    }
    public void pushStudent(Student student) {
        students.push(student);
    }
    public void pushIndexes(int index) {
        indexes.push(index);
    }
    public Student popStudent() {return students.pop();}
    public int popIndexes() {return indexes.pop();}
    //TODO important
    public void matchFoundIndexes(){

        indexes.clear();
        if (!searchByID && !searchByUniID) {

            for (int i = 0; i < indexes_name.size(); i++) {
                for (int j = 0; j < indexes_lastname.size(); j++) {
                    if (indexes_lastname.get(i).equals(indexes_name.get(j))) {
                        indexes.add(indexes_lastname.get(i));
                        break;
                    }
                }
            }
        }
        else
            indexes.push(index);
    }

    //-----------------------------------------------
    //-----------------------------------------------
    //-----------------------------------------------
    //------------GETTERS AND SETTERS----------------
    //-----------------------------------------------
    //-----------------------------------------------
    //-----------------------------------------------


    public int getUniID() {
        return uniID;
    }

    public void setUniID(int uniID) {
        this.uniID = uniID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getSearchByUniID() {
        return searchByUniID;
    }

    public void setSearchByUniID(Boolean searchByUniID) {
        this.searchByUniID = searchByUniID;
    }

    public Boolean getSearchByID() {
        return searchByID;
    }

    public void setSearchByID(Boolean searchByID) {
        this.searchByID = searchByID;
    }

    public Boolean getSearchByName() {
        return searchByName;
    }

    public void setSearchByName(Boolean searchByName) {
        this.searchByName = searchByName;
    }

    public Boolean getSearchByLastname() {
        return searchByLastname;
    }

    public void setSearchByLastname(Boolean searchByLastname) {
        this.searchByLastname = searchByLastname;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public LinkedList<Integer> getIndexes_name() {
        return indexes_name;
    }

    public void setIndexes_name(LinkedList<Integer> indexes) {
        this.indexes_name = indexes;
    }

    public LinkedList<Integer> getIndexes_lastname() {
        return indexes_lastname;
    }

    public void setIndexes_lastname(LinkedList<Integer> indexes_lastname) {
        this.indexes_lastname = indexes_lastname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public LinkedList<Integer> getIndexes() {
        return indexes;
    }

    public void setIndexes(LinkedList<Integer> indexes) {
        this.indexes = indexes;
    }
}
