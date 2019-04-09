
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.manager.addEditCourse;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.DateUtil;
import com.StudentManagerSystem.Main;
import com.StudentManagerSystem.Subject;
import com.StudentManagerSystem.SystemManage;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.io.IOException;

public class addEditCourse {
    private boolean isAddModeActive;
    @FXML
    private JFXTextField title;
    @FXML
    private JFXTextField unitCount;
    @FXML
    private JFXTextField studentCount;
    @FXML
    private JFXTextField professorName;
    @FXML
    private JFXDatePicker testData;
    @FXML
    private JFXButton addEdit;


    @FXML
    private void initialize() {
        isAddModeActive = true;
    }

    @FXML
    private void addEditCourseHandler(){
        if (isAddModeActive){
            Subject sub = new Subject();

            sub.setTitle(title.getText());
            sub.setExamDate(testData.getValue());
            sub.setProfessorName(professorName.getText());
            sub.setUnitVal(Integer.parseInt(unitCount.getText()));
            sub.setStudentCount(Integer.parseInt(studentCount.getText()));

            try {
                sub = StudentManagerPageController.addSubject(new StudentManagerPageController.SubjectInput(sub,null));

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Successful");
                alert.setHeaderText("subject add student");
                alert.setContentText("subject id = "+sub.getID()+ " " + sub.getCode());
                alert.showAndWait();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("add subject error");
                Main.showError("cant add subject," + e.toString());
            }
        }else{
            //todo
        }
    }

    @FXML
    private void searchCourseHandler(){
        isAddModeActive = false;
        addEdit.setText("Edit");
    }
}
