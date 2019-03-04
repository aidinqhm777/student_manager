package Com.StudentManagerSystem;

import Com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class FileManage {

    //standard sizes
    private static int String_10bit = 17;
    private static int String_20bit = 17;
    private static int String_30bit = 37;
    private static int INTEGER = 81;

    private static int nameSize = String_30bit;
    private static int lastNameSize = String_30bit;
    private static int IDSize = INTEGER;
    private static int uniIDSize = INTEGER;
    private static int birthdateSize = String_20bit;
    private static int phoneNumberSize = String_20bit;

    //file paths
    private static String StudentUniID_filePath = "./src/Com/StudentManagerSystem/Data/UniID";
    private static String StudentName_filePath = "./src/Com/StudentManagerSystem/Data/Name";
    private static String StudentLastName_filePath = "./src/Com/StudentManagerSystem/Data/Lastname";
    private static String StudentBirthDate_filePath = "./src/Com/StudentManagerSystem/Data/BirthDate";
    private static String StudentPhoneNum_filePath = "./src/Com/StudentManagerSystem/Data/PhoneNum";
    private static String StudentID_filePath = "./src/Com/StudentManagerSystem/Data/ID";

    private static String btree_StudentUniID_filePath = "./src/Com/StudentManagerSystem/Data/Btree_UniID";
    private static String btree_StudentName_filePath = "./src/Com/StudentManagerSystem/Data/Btree_Name";
    private static String btree_StudentLastName_filePath = "./src/Com/StudentManagerSystem/Data/Btree_Lastname";
    private static String btree_StudentID_filePath = "./src/Com/StudentManagerSystem/Data/Btree_ID";
    private static String class_UniIDManage_filePath = "./src/Com/StudentManagerSystem/Data/UniIDManage";
    private static String class_IndexManage_filePath = "./src/Com/StudentManagerSystem/Data/IndexManage";

//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------


    public static void createStudent(Student student) throws IOException {
        int index = student.getIndex_PersonalInfo();
        createStudentName(index, student.getName());
        createStudentLastname(index, student.getLastname());
        createStudentID(index, student.getId());
        createStudentUniID(index, student.getUniID());
        createStudentPhoneNum(index, student.getPhoneNum());
        createStudentBirthdate(index, student.getBirthDate());
    }

    private static void createStudentName(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, o, index, nameSize);
    }

    private static void createStudentLastname(int index, Object o)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, o, index, lastNameSize);
    }

    private static void createStudentUniID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniID_filePath, o, index, uniIDSize);
    }

    private static void createStudentID(int index, Object o)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentID_filePath, o, index, IDSize);
    }

    private static void createStudentPhoneNum(int index, Object o)
            throws IOException {
        // 414223355
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, o, index, phoneNumberSize);
    }

    private static void createStudentBirthdate(int index, Object o)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthDate_filePath, o, index, birthdateSize);
    }


    public static Student readStudent(int index) throws IOException, ClassNotFoundException {
        Student s = new Student();
        s.setIndex_PersonalInfo(index);
        s.setName(readStudentName(index));
        s.setLastname(readStudentLastname(index));
        s.setUniID(readStudentUniID(index));
        s.setId(readStudentID(index));
        s.setBirthDate(readStudentBirthdate(index));
        s.setPhoneNum(readStudentPhoneNum(index));
        return s;
    }

    private static String readStudentName(int index)
            throws IOException, ClassNotFoundException {
        return (String) FileIO.readObjectWithIndex(StudentName_filePath, index, nameSize);
    }

    private static String readStudentLastname(int index)
            throws IOException, ClassNotFoundException {
        return (String) FileIO.readObjectWithIndex(StudentLastName_filePath, index, lastNameSize);
    }

    private static int readStudentUniID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (Integer) FileIO.readObjectWithIndex(StudentUniID_filePath, index, uniIDSize);
    }

    private static int readStudentID(int index)
            throws IOException, ClassNotFoundException {
        // 1111111111
        return (Integer) FileIO.readObjectWithIndex(StudentID_filePath, index, IDSize);
    }

    private static String readStudentPhoneNum(int index)
            throws IOException, ClassNotFoundException {
        // 414223355
        return (String) FileIO.readObjectWithIndex(StudentPhoneNum_filePath, index, phoneNumberSize);
    }

    private static String readStudentBirthdate(int index)
            throws IOException, ClassNotFoundException {
        //   => 1397/01/01
        return (String) FileIO.readObjectWithIndex(StudentBirthDate_filePath, index, birthdateSize);
    }

//TODO fix it
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

    public static void updateStudentName(String name, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, name, index, nameSize);
    }

    public static void updateStudentLastName(String lastName, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, lastName, index, lastNameSize);
    }

    public static void updateStudentUniID(int uniID, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, uniID, index, uniIDSize);
    }

    public static void updateStudentID(int ID, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, ID, index, IDSize);
    }

    public static void updateStudentPhoneNumber(String phoneNumber, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, phoneNumber, index, phoneNumberSize);
    }

    public static void updateStudentBirthdate(String birthdate, int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentName_filePath, birthdate, index, birthdateSize);
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
        FileIO.writeObjectWithIndex(StudentName_filePath, emptyString(nameSize), index, nameSize);
    }

    private static void deleteStudentLastname(int index)
            throws IOException {
        FileIO.writeObjectWithIndex(StudentLastName_filePath, emptyString(lastNameSize), index, lastNameSize);
    }

    private static void deleteStudentUniID(int index)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentUniID_filePath, emptyInteger(), index, uniIDSize);
    }

    private static void deleteStudentID(int index)
            throws IOException {
        // 1111111111
        FileIO.writeObjectWithIndex(StudentID_filePath, emptyInteger(), index, IDSize);
    }

    private static void deleteStudentPhoneNum(int index)
            throws IOException {
        // 414223355
        FileIO.writeObjectWithIndex(StudentPhoneNum_filePath, emptyString(phoneNumberSize), index, phoneNumberSize);
    }

    private static void deleteStudentBirthdate(int index)
            throws IOException {
        //   => 1397/01/01
        FileIO.writeObjectWithIndex(StudentBirthDate_filePath, emptyString(birthdateSize), index, birthdateSize);
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