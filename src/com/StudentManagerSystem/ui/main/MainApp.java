/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainApp {
    @FXML
    private BorderPane rootPane;

    @FXML
    private void initialize() {
        try {
            Parent managerHome = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/managerHome/managerHome.fxml"));
            rootPane.setCenter(managerHome);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void homeButtonHandler(){
        try {
            Parent managerHome = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/managerHome/managerHome.fxml"));
            rootPane.setCenter(managerHome);
        } catch (IOException e) {
             //TODO
        }

    }

    @FXML
    private void addStudentButtonHandler(){
        try {
            Parent studentPage = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/addStudent/addStudent.fxml"));
            rootPane.setCenter(studentPage);
        } catch (IOException e) {
               //TODO
        }

    }

    @FXML
    private void searchStudentButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/searchStudent/searchStudent.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void addEditCourseButtonHandler(){
        //TODO
    }
}
