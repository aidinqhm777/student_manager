/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;

import java.io.IOException;

public class LoginPage {

    public class Input {

        String username;
        String password;
        int userType = -1;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


    private static boolean login(Input input) throws IOException, ClassNotFoundException {

        if (authenticate(input)) {
            loadPage(input.userType, input.getUsername());
            return true;
        }

        else
            return false;
    }

    private static boolean authenticate(Input input) {

        return Password.authenticate(input);
    }

    private static void loadPage(int type, String username) throws IOException, ClassNotFoundException {

        if(type == 0) {

            Searcher searcher = new Searcher();
            searcher.setSearchByID(true);
            searcher.setUniID(Integer.parseInt(username));
            StudentPage.loadInformation(SystemManage.searchStudent(searcher).peek());
        }
    }


}
