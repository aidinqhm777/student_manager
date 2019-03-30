///*
// * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// * Vestibulum commodo. Ut rhoncus gravida arcu.
// */
//
//package com.StudentManagerSystem.Controllers;
//
//import com.StudentManagerSystem.Password;
//import com.StudentManagerSystem.Searcher;
//import com.StudentManagerSystem.SystemManage;
//
//import java.io.IOException;
//import java.util.LinkedList;
//
//public class LoginPageController {
//
//    private Input input;
//
//
//
//
//
//    public class Input {
//
//        String username;
//        String password;
//        int userType = -1;
//
//        public int getUsername() {
//            return Integer.parseInt(username);
//        }
//
//        public void setUsername(String username) {
//            this.username = username;
//        }
//
//        public int getPassword() {
//            return Integer.parseInt(password);
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//    }
//
//    public boolean loginButton(Input input1) throws IOException, ClassNotFoundException {
//
//        setInput(input1);
////      todo  rest should be conditional
//
////        if is student
//        Searcher searcher = new Searcher();
//        searcher.setSearchByUniID(true);
//        searcher.setUniID(input.getUsername());
//        LinkedList searchResult = SystemManage.searchStudent(searcher);
//    }
//
//    private static boolean login(Input input) throws IOException, ClassNotFoundException {
//
//        if (authenticate(input)) {
////            loadPage(input.userType, input.getUsername());
//            return true;
//        }
//
//        else
//            return false;
//    }
//
//    private static boolean authenticate(Input input) {
//
////        return Password.authenticate(input);
//    }
//
//    private static void loadPage(int type, String username) throws IOException, ClassNotFoundException {
//
//        if(type == 0) {
//
//            Searcher searcher = new Searcher();
//            searcher.setSearchByID(true);
//            searcher.setUniID(Integer.parseInt(username));
////            StudentPage.loadInformation(SystemManage.searchStudent(searcher).peek());
//        }
//    }
//
//    public Input getInput() {
//        return input;
//    }
//
//    public void setInput(Input input) {
//        this.input = input;
//    }
//}
