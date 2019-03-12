package com.StudentManagerSystem;

import java.io.IOException;
import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;

public class SystemManage {

    private static IndexManage indexManage = new IndexManage();
    private static UniIDManage uniIDManage = new UniIDManage();
    private static Student studentTmp = new Student();
    private static Student updatedStudentTmp = new Student();
    private static Subject subjectTmp = new Subject();
    private static Subject updatedSubjectTmp = new Subject();
    public  static LinkedList<Pair> CampusCode = new LinkedList<>();
    private static Enrollment enrollmentTmp;

    static class Pair<T,N>{
        T key;
        N value;

        Pair(T key, N value) {
            this.key = key;
            this.value = value;
        }
    }



    //read and save the program in files
    public static void loadProgram() throws IOException, ClassNotFoundException {
        setCampusCode();
        BTreeManage.load();
        indexManage = FileManage.loadIndexManage();
        uniIDManage = FileManage.loadUniIDManage();
    }
    public static void saveProgram() throws IOException {

        BTreeManage.save();
        FileManage.saveIndexManage(indexManage);
        FileManage.saveUniIDManage(uniIDManage);
    }

    //buttons

//    STUDENTS

    public static LinkedList<Student> searchStudent(Searcher searcher)
            throws IOException, ClassNotFoundException {

        Searcher foundSearch = BTreeManage.readStudent(searcher);
        foundSearch.matchFoundIndexes();
        while (!foundSearch.getIndexes().isEmpty()) {
            Student tmp = FileManage.readStudent(foundSearch.popIndexes());
            foundSearch.pushStudent(tmp);
        }
        return foundSearch.getStudents();
    }
    public static Student signupStudent() throws IOException {
        if(BTreeManage.checkDuplicity(studentTmp)) throw new DuplicateFormatFlagsException("ID Error");
        int uniId = uniIDManage.createNewID();
        int index = indexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        studentTmp.setUniID(uniId);
        BTreeManage.createStudent(studentTmp);
        FileManage.createStudent(studentTmp);
        return studentTmp;
    }
    public static Student updateStudent() throws IOException {
        //TODO reconsider the code for checking duplicity
        if (studentTmp.getId() != updatedStudentTmp.getId()) { if (BTreeManage.checkDuplicity(updatedStudentTmp)) throw new DuplicateFormatFlagsException("ID ERROR"); }
        FileManage.updateStudent(studentTmp, updatedStudentTmp);
        BTreeManage.updateStudent(studentTmp, updatedStudentTmp);
        studentTmp.setStudent(updatedStudentTmp);
        updatedStudentTmp = new Student();
        return studentTmp;
    }
    public static Student removeStudent() throws IOException {

        int index;
        index = studentTmp.getIndex_PersonalInfo();
        BTreeManage.deleteStudent(studentTmp);

        indexManage.removeStudent(index);
        FileManage.deleteStudent(studentTmp);// i don't know if it's needed cause if u remove the index the data i considered removed
        return studentTmp;
    }



//    SEMESTERS MANAGING

    public static void addEnrollment(Enrollment enrollment) throws IOException {


        IndexManage.createEnrollment(enrollment);
        BTreeManage.createEnrollment(enrollment);
        FileManage.createEnrollment(enrollment);

    }
    public static LinkedList searchEnrollment(EnrollmentSearcher searcher)
            throws IOException, ClassNotFoundException {

        LinkedList<Integer> indexes = BTreeManage.readEnrollment(searcher);
        LinkedList<Enrollment> searchResults = new LinkedList<>();
        if (indexes == null)
            return null;
        while (!indexes.isEmpty()) {
            int index = indexes.pop();
            Enrollment tmp = FileManage.readEnrollment(index);
            searchResults.push(tmp);
        }

        return searchResults;
    }
    public static void editEnrollment() {
//
//        IndexManage.updateEnrollment(enrollmentTmp);
//        BTreeManage.updateEnrollment(enrollmentTmp);
//        FileManage.updateEnrollment(enrollmentTmp);
    }
    public static void removeEnrollment() throws IOException {

        IndexManage.deleteEnrollment(enrollmentTmp);
        BTreeManage.deleteEnrollment(enrollmentTmp);
        FileManage.deleteEnrollment(enrollmentTmp);
    }







//    COURSES AND SUBJECTS MANAGING

    public static Subject addSubject() throws IOException {

//        if(BTreeManage.checkDuplicity(subjectTmp)) throw new DuplicateFormatFlagsException("ID Error");
        int id = uniIDManage.createSubjectID();
        int index = indexManage.addSubject();
        subjectTmp.setIndex(index);
        subjectTmp.setID(id);
        BTreeManage.createSubject(subjectTmp);
        FileManage.createSubject(subjectTmp);
        return subjectTmp;

    }
    public static LinkedList<Subject> searchSubject(SubjectSearcher subjectSearcher) throws IOException, ClassNotFoundException {

        SubjectSearcher foundSearch = BTreeManage.readSubjects(subjectSearcher);
        foundSearch.matchResults();

        while (!foundSearch.getIndex().isEmpty()) {
            Subject tmp = FileManage.readSubject(foundSearch.popIndex());
            foundSearch.pushSubject(tmp);
        }
        return foundSearch.getSubjects();
    }
    public static Subject editSubject() throws IOException {

//        if (studentTmp.getId() != updatedStudentTmp.getId()) { if (BTreeManage.checkDuplicity(updatedStudentTmp.getId())) throw new DuplicateFormatFlagsException("ID ERROR"); }
        FileManage.updateSubject(subjectTmp, updatedSubjectTmp);
        BTreeManage.updateSubject(subjectTmp, updatedSubjectTmp);
        subjectTmp.copy(updatedSubjectTmp);
        updatedSubjectTmp = new Subject();
        return subjectTmp;

    }
    public static Subject removeSubject() throws IOException {

        indexManage.deleteSubject(subjectTmp.getIndex());
        BTreeManage.deleteSubject(subjectTmp);
        FileManage.deleteSubject(subjectTmp);
        return subjectTmp;
    }


    //get and set properties
    public static void setStudentTmp(Student student) {
        studentTmp.setStudent(student);
    }
    public static Student getStudentTmp() {
        return studentTmp;
    }
    public static void setUpdatedStudentTmp(Student student) {
        updatedStudentTmp.setStudent(student);
    }
    public static void setSubjectTmp(Subject subject) {
        subjectTmp.copy(subject);
    }
    public static void setUpdatedSubjectTmp(Subject subject) {

        updatedSubjectTmp.copy(subject);
    }
    private static void setCampusCode(){
        CampusCode.add(new Pair<Integer, String>(0,"computer"));
        CampusCode.add(new Pair<Integer, String>(1,"electronic"));
    }
    private static String getCampusTitle(int code){
        for (Pair pair : CampusCode) {
            if ((Integer) pair.key == code) {
                return (String) pair.value;
            }
        }
        return null;
    }
    public static void setEnrollmentTmp(Enrollment enrollment) {

        enrollment.setEnrollmentIndex(enrollmentTmp.getEnrollmentIndex());
        enrollment.setSubjectID(enrollmentTmp.getSubjectID());
        enrollment.setStudentID(enrollmentTmp.getStudentID());
        enrollment.setStudentIndex(enrollmentTmp.getStudentIndex());
        enrollment.setSubjectIndex(enrollmentTmp.getSubjectIndex());
        enrollment.setSubjectCode(enrollmentTmp.getSubjectCode());
    }
}