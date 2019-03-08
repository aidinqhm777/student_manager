package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.util.LinkedList;

public class FileManage {

    private static LinkedList <FiledData> fieldData = new LinkedList<>();

    //standard sizes
    private static int String_10bit = 17;
    private static int String_20bit = 27;
    private static int String_30bit = 37;
    private static int INTEGER = 81;

    private static int nameSize = String_30bit;
    private static int lastNameSize = String_30bit;
    private static int IDSize = INTEGER;
    private static int uniIDSize = INTEGER;
    private static int birthdateSize = String_20bit;
    private static int phoneNumberSize = String_20bit;


    private static int lineSize = nameSize + lastNameSize + IDSize + uniIDSize + birthdateSize + phoneNumberSize;

    //file paths
    private static String StudentUniID_filePath = "./src/com/StudentManagerSystem/data/UniID";
    private static String StudentName_filePath = "./src/com/StudentManagerSystem/data/Name";
    private static String StudentLastName_filePath = "./src/com/StudentManagerSystem/data/Lastname";
    private static String StudentBirthDate_filePath = "./src/com/StudentManagerSystem/data/BirthDate";
    private static String StudentPhoneNum_filePath = "./src/com/StudentManagerSystem/data/PhoneNum";
    private static String StudentID_filePath = "./src/com/StudentManagerSystem/data/ID";
    private static String StudentFile_filePath = "./src/com/StudentManagerSystem/data/studentFile";

    private static String btree_StudentUniID_filePath = "./src/com/StudentManagerSystem/data/Btree_UniID";
    private static String btree_StudentName_filePath = "./src/com/StudentManagerSystem/data/Btree_Name";
    private static String btree_StudentLastName_filePath = "./src/com/StudentManagerSystem/data/Btree_Lastname";
    private static String btree_StudentID_filePath = "./src/com/StudentManagerSystem/data/Btree_ID";
    private static String class_UniIDManage_filePath = "./src/com/StudentManagerSystem/data/UniIDManage";
    private static String class_IndexManage_filePath = "./src/com/StudentManagerSystem/data/IndexManage";


    private static String name_id = "name";
    private static String lastName_id = "lastName";
    private static String id_id = "id";
    private static String uniId_id = "uniId";
    private static String birthDate_id = "birthDate";
    private static String phoneNum_id = "phoneNum";
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------


    static class FiledData {
        int size;
        String id;
        Object data;

        FiledData(Object data, String id, int size) {
            this.size = size;
            this.id = id;
            this.data = data;
        }
    }

    public static void createStudent(Student student) throws IOException {
        int index = student.getIndex_PersonalInfo();
        LinkedList<byte[]> temp = new LinkedList<>();

        setStudentDataLinkedList(student);

        for (int i=0; i<fieldData.size(); i++){
            temp.add(FileIO.objectToByte(fieldData.get(i).data));
        }

        byte[] bytes = concatenate(temp);
        FileIO.writeIndexToFile(StudentFile_filePath, bytes, index, lineSize);
    }

    public static Student readStudent(int index) throws IOException, ClassNotFoundException {
        byte[] bytes = FileIO.readIndexFromFile(StudentFile_filePath, index, lineSize);
        setStudentDataLinkedList(null);
        Student s = new Student();

        s.setIndex_PersonalInfo(index);
        s.setName((String) readData(name_id,bytes));
        s.setLastname((String) readData(lastName_id,bytes));
        s.setUniID((Integer) readData(id_id,bytes));
        s.setId((Integer) readData(uniId_id,bytes));
        s.setBirthDate((String) readData(birthDate_id,bytes));
        s.setPhoneNum((String) readData(phoneNum_id,bytes));
        return s;
    }

    private static byte[] concatenate(LinkedList<byte[]> bytes) {
        // Function to merge two arrays of
        // same type
        byte[] combined = new byte[lineSize];
        for (int i=0; i< fieldData.size(); i++) {
            System.arraycopy(bytes.get(i), 0, combined, getPosition(fieldData.get(i).id), bytes.get(i).length);
        }
        return combined;
    }
    private static void setStudentDataLinkedList(Student student){
        LinkedList <FiledData> data = new LinkedList<>();
        if (student == null){
            data.add( new FiledData(null,name_id,     nameSize) );
            data.add( new FiledData(null,lastName_id, lastNameSize));
            data.add( new FiledData(null,id_id,       IDSize));
            data.add( new FiledData(null,uniId_id,    uniIDSize));
            data.add( new FiledData(null,birthDate_id,birthdateSize));
            data.add( new FiledData(null,phoneNum_id, phoneNumberSize));
        }else{
            data.add( new FiledData(String.format("%" + (nameSize-7) +"s",student.getName())           ,name_id,     nameSize) );
            data.add( new FiledData(String.format("%" + (lastNameSize-7) +"s",student.getLastname())   ,lastName_id,lastNameSize));
            data.add( new FiledData(student.getId()                                                    ,id_id,      IDSize));
            data.add( new FiledData(student.getUniID()                                                 ,uniId_id,   uniIDSize));
            data.add( new FiledData(String.format("%" + (birthdateSize-7) +"s",student.getBirthDate()) ,birthDate_id,birthdateSize));
            data.add( new FiledData(String.format("%" + (phoneNumberSize-7) +"s",student.getPhoneNum()),phoneNum_id,phoneNumberSize));
        }
        fieldData = data;
    }
    private static int getPosition(String id){
        int start=0;
        for (FiledData aFieldData : fieldData) {
            if (aFieldData.id.equals(id)) {
                break;
            }
            start += aFieldData.size;
        }
        return start;
    }
    private static FiledData getIndex(String id){
        for (FiledData aFieldData : fieldData) {
            if (aFieldData.id.equals(id)) {
                return aFieldData;
            }
        }
        return null;
    }
    private static Object readData(String id, byte[] bytes) throws IOException, ClassNotFoundException {
        byte[] tmp = new byte[getIndex(id).size];
        System.arraycopy(bytes, getPosition(id), tmp,0, getIndex(id).size);
        return FileIO.bytesToObject(tmp);
    }


    public static void updateStudent(Student studentBefore, Student studentAfter) throws IOException {
        if (studentBefore.getId() != studentAfter.getId())
            updateStudentID(studentAfter.getId(),studentAfter.getIndex_PersonalInfo());

        if (studentBefore.getUniID() != studentAfter.getUniID())
            updateStudentUniID(studentAfter.getUniID(), studentAfter.getIndex_PersonalInfo());

        if (!studentBefore.getName().equals(studentAfter.getName()))
            updateStudentName(studentAfter.getName(), studentAfter.getIndex_PersonalInfo());

        if (!studentBefore.getLastname().equals(studentAfter.getLastname()))
            updateStudentLastName(studentAfter.getLastname(), studentAfter.getIndex_PersonalInfo());

        if (!studentBefore.getPhoneNum().equals(studentAfter.getPhoneNum()))
            updateStudentPhoneNumber(studentAfter.getPhoneNum(), studentAfter.getIndex_PersonalInfo());

        if (!studentBefore.getBirthDate().equals(studentAfter.getBirthDate()))
            updateStudentBirthdate(studentAfter.getBirthDate(), studentAfter.getIndex_PersonalInfo());
    }

    private static void updateStudentName(String name, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, name, index, nameSize);
    }
    private static void updateStudentLastName(String lastName, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, lastName, index, lastNameSize);
    }
    private static void updateStudentUniID(int uniID, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentUniID_filePath, uniID, index, uniIDSize);
    }
    private static void updateStudentID(int ID, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentID_filePath, ID, index, IDSize);
    }
    private static void updateStudentPhoneNumber(String phoneNumber, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, phoneNumber, index, phoneNumberSize);
    }
    private static void updateStudentBirthdate(String birthdate, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentBirthDate_filePath, birthdate, index, birthdateSize);
    }


    //remove student's personal info records
    public static void deleteStudent(Student student) throws IOException {
        int index = student.getIndex_PersonalInfo();
        deleteStudentName(index);
        deleteStudentLastname(index);
        deleteStudentID(index);
        deleteStudentUniID(index);
        deleteStudentPhoneNum(index);
        deleteStudentBirthdate(index);
    }

    private static void deleteStudentName(int index)
            throws IOException {
        FileIO.cleanIndex(StudentName_filePath, index, nameSize);
    }
    private static void deleteStudentLastname(int index)
            throws IOException {
        FileIO.cleanIndex(StudentLastName_filePath, index, lastNameSize);
    }
    private static void deleteStudentUniID(int index)
            throws IOException {
        // 1111111111
        FileIO.cleanIndex(StudentUniID_filePath, index, uniIDSize);
    }
    private static void deleteStudentID(int index)
            throws IOException {
        // 1111111111
        FileIO.cleanIndex(StudentID_filePath, index, IDSize);
    }
    private static void deleteStudentPhoneNum(int index)
            throws IOException {
        // 414223355
        FileIO.cleanIndex(StudentPhoneNum_filePath, index, phoneNumberSize);
    }
    private static void deleteStudentBirthdate(int index)
            throws IOException {
        //   => 1397/01/01
        FileIO.cleanIndex(StudentBirthDate_filePath, index, birthdateSize);
    }


    private static String emptyString(int size) {
        return String.format("%" + (size - 7) + "s", "");
    }
    private static Integer emptyInteger() {
        return 0;
    }


    //load and save the btree's in file
    public static BPlusTree loadBtree_StudentName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentName_filePath);
    }
    public static BPlusTree loadBtree_StudentLastName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentLastName_filePath);
    }
    public static BPlusTree loadBtree_StudentID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentID_filePath);
    }
    public static BPlusTree loadBtree_StudentUniID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentUniID_filePath);
    }


    public static void saveBtree_StudentName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentName_filePath, o);
    }
    public static void saveBtree_StudentLastName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentLastName_filePath, o);
    }
    public static void saveBtree_StudentID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentID_filePath, o);
    }
    public static void saveBtree_StudentUniID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentUniID_filePath, o);
    }


    public static UniIDManage loadUniIDManage()
            throws IOException, ClassNotFoundException {
        return (UniIDManage) FileIO.readAnObjectFromFile(class_UniIDManage_filePath);
    }
    public static IndexManage loadIndexManage()
            throws IOException, ClassNotFoundException {
        return (IndexManage) FileIO.readAnObjectFromFile(class_IndexManage_filePath);
    }
    public static void saveUniIDManage(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(class_UniIDManage_filePath, o);
    }
    public static void saveIndexManage(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(class_IndexManage_filePath, o);
    }
}
