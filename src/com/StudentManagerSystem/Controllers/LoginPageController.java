package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.StudentSearcher;
import com.StudentManagerSystem.SystemManage;
import java.io.IOException;

public class LoginPageController {

    private static Input input;
    private static Object loggedIn;
    private static String Password;

    public class Input {

        String username;
        String password;
        int userType;
        /**
         * 0 = student
         * 1 = student Manager
         * 2 = admin
         */

        public Input(String username, String password, int userType) {
            this.username = username;
            this.password = password;
            this.userType = userType;
        }

    }

    //methods
    static public boolean login(Input input)
            throws IOException, ClassNotFoundException {
        //TODO input get
        //TODO not Completed
        return SystemManage.authenticateAdministrator(Integer.parseInt(input.username), input.password);
    }

    private static void getPassword(String username, int userType)
            throws IOException, ClassNotFoundException {
        Object loggedIn = null;
        String password ="";

        switch (userType){

            case 0:{
                StudentSearcher searcher = new StudentSearcher();
                searcher.setUniID( Integer.parseInt(username) );
                searcher.setSearchByUniID(true);
                Student tmp = SystemManage.searchStudent(searcher).get(0);
                loggedIn = tmp;
                password = tmp.getPassword();
                break;
            }

            case 1:{
                //TODO
                break;
            }

            case 2:{
                //TODO
                break;
            }
        }

        setPassword(password);
        setLoggedIn(loggedIn);
    }

    //getter and setters
    static Object getLoggedIn() {
        return loggedIn;
    }
    private static void setLoggedIn(Object loggedIn) {
        LoginPageController.loggedIn = loggedIn;
    }
    private static void setPassword(String password) {
        Password = password;
    }
}
