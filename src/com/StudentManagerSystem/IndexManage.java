package Com.StudentManagerSystem;

import java.util.LinkedList;

public class IndexManage {

    private static int studentCount = 0;
    private static int lineCount = 0;
    private static LinkedList <Integer> recentlyDeleted = new LinkedList<>();



    public static void load() {}
    public static void save() {}

    public static int addStudent() {

        if (recentlyDeleted.isEmpty()) {

            studentCount++;
            return ++lineCount;
        }
        else
            return recentlyDeleted.pop();
    }
    public static void removeStudent(int index) {

        recentlyDeleted.push(index);
        studentCount--;
    }

}




