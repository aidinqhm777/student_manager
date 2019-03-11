/*
 * created by @Amir
 */

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Subject.Time time = new Subject.Time(0,223,5,45,12,2);
        Subject s = new Subject();
        s.setClassTiming(new Subject.ClassTiming(time,time));
        s.setExamDate(LocalDate.now());
        s.setUnitVal(1);
        s.setCode(2);
        s.setIndex(1);

        FileManage.createSubject(s);
        Subject s2 = FileManage.readSubject(1);
    }
}
