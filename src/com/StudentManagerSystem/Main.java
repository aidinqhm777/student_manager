/*
 * created by @Amir
 */

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Subject s = new Subject(1,1,1,1,"salam","ali",LocalDate.now());

        FileManage.updateSubject(s,new Subject(1,2,2,2,"kalim","ali",LocalDate.now()));
        FileManage.deleteSubject(s);
        Subject tmp = FileManage.readSubject(1);
    }
}
