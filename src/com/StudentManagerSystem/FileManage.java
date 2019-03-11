package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.LinkedList;

public class FileManage {

    private static LinkedList <FiledData> fieldData = new LinkedList<>();
    private static int index=0;

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
    private static String studentIndex_id = "phoneNum";

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

    private static String toWords(String s){
        StringBuilder tmp = new StringBuilder(s);
        int i =0;
        while(i < tmp.length()) {
            if (tmp.charAt(i) == ' ' && tmp.charAt(i+1) == ' '){
                tmp.delete(i,i+2);
            }else if(i == 0 && tmp.charAt(i) == ' ') {
                tmp.delete(i,i+1);
            }
            else {
                i++;
            }
        }
        return tmp.toString();
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
    private static LinkedList<FiledData> setStudentDataLinkedList(Student student){
        LinkedList <FiledData> data = new LinkedList<>();
        if (student == null){
            data.add( new FiledData(String.format("%" + (nameSize-7) +"s",""), name_id,     nameSize) );
            data.add( new FiledData(String.format("%" + (lastNameSize-7) +"s",""), lastName_id,lastNameSize));
            data.add( new FiledData(0,id_id, IDSize));
            data.add( new FiledData(0,uniId_id, uniIDSize));
            data.add( new FiledData(String.format("%" + (birthdateSize-7) +"s",""), birthDate_id,birthdateSize));
            data.add( new FiledData(String.format("%" + (phoneNumberSize-7) +"s",""), phoneNum_id,phoneNumberSize));
        }else{
            index = student.getIndex_PersonalInfo();
            data.add( new FiledData(String.format("%" + (nameSize-7) +"s",student.getName())           ,name_id,     nameSize) );
            data.add( new FiledData(String.format("%" + (lastNameSize-7) +"s",student.getLastname())   ,lastName_id,lastNameSize));
            data.add( new FiledData(student.getId()                                                    ,id_id,      IDSize));
            data.add( new FiledData(student.getUniID()                                                 ,uniId_id,   uniIDSize));
            data.add( new FiledData(String.format("%" + (birthdateSize-7) +"s",student.getBirthDate()) ,birthDate_id,birthdateSize));
            data.add( new FiledData(String.format("%" + (phoneNumberSize-7) +"s",student.getPhoneNum()),phoneNum_id,phoneNumberSize));
        }
        fieldData = data;
        return data;
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
    private static FiledData getDataWithId(String id, LinkedList<FiledData> search){
        for (FiledData aFieldData : search) {
            if (aFieldData.id.equals(id)) {
                return aFieldData;
            }
        }
        return null;
    }

    private static Object readData(String id, byte[] bytes)
            throws IOException, ClassNotFoundException {
        byte[] tmp = new byte[getDataWithId(id, fieldData).size];
        System.arraycopy(bytes, getPosition(id), tmp,0, getDataWithId(id, fieldData).size);
        Object o;

        try{ o = FileIO.bytesToObject(tmp); }
        catch (StreamCorruptedException e){ o = null; }
        return o;
    }
    private static void writeData(String id, Object data, int index)
            throws IOException {
        byte[] tmp;
        tmp = FileIO.objectToByte(data);
        FileIO.writeToFile(StudentFile_filePath, tmp, index * getPosition(id));
    }


    public static void createStudent(Student student)
            throws IOException {
        int index = student.getIndex_PersonalInfo();
        LinkedList<byte[]> temp = new LinkedList<>();

        setStudentDataLinkedList(student);

        for (FiledData aFieldData : fieldData) {
            temp.add(FileIO.objectToByte(aFieldData.data));
        }

        byte[] bytes = concatenate(temp);
        FileIO.writeIndexToFile(StudentFile_filePath, bytes, index, lineSize);
    }
    public static Student readStudent(int index)
            throws IOException, ClassNotFoundException {
        byte[] bytes = FileIO.readIndexFromFile(StudentFile_filePath, index, lineSize);
        setStudentDataLinkedList(null);
        Student s = new Student();

        s.setIndex_PersonalInfo(index);
        s.setName(  toWords((String) readData(name_id,bytes))  );
        s.setLastname(  toWords((String) readData(lastName_id,bytes))  );
        s.setUniID((Integer) readData(uniId_id,bytes));
        s.setId((Integer) readData(id_id,bytes));
        s.setBirthDate(toWords((String) readData(birthDate_id,bytes)));
        s.setPhoneNum(toWords((String) readData(phoneNum_id,bytes)));
        return s;
    }
    public static void updateStudent(Student studentBefore, Student studentAfter)
            throws IOException {
         LinkedList <FiledData> before = setStudentDataLinkedList(studentBefore);
         LinkedList <FiledData> after = setStudentDataLinkedList(studentAfter);

         for (int i=0; i < before.size(); i++){
             if (before.get(i).data instanceof String){
                 if (!((String) before.get(i).data).equals((String) (after.get(i).data))){
                     writeData(after.get(i).id, after.get(i).data, studentBefore.getIndex_PersonalInfo());
                 }
             }else{
                 if (before.get(i).data != (after.get(i).data)){
                     writeData(after.get(i).id, after.get(i).data, studentBefore.getIndex_PersonalInfo());
                 }
             }
         }
    }
    public static void deleteStudent(Student student)
            throws IOException {
        byte[] bytes = new byte[lineSize];
        FileIO.writeIndexToFile(StudentFile_filePath, bytes, index, lineSize);
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
