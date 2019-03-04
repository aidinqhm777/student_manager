package com.StudentManagerSystem;

import java.io.Serializable;
import java.util.LinkedList;

public class IndexManage implements Serializable {

    private int studentCount = 0;
    private int lineCount = 0;
    private LinkedList<Integer> recentlyDeleted = new LinkedList<>();


    public void load() {

    }

    public void save() {
    }

    public int addStudent() {

        if (recentlyDeleted.isEmpty()) {

            studentCount++;
            return ++lineCount;
        } else
            return recentlyDeleted.pop();
    }

    public void removeStudent(int index) {

        recentlyDeleted.push(index);
        studentCount--;
    }

}




