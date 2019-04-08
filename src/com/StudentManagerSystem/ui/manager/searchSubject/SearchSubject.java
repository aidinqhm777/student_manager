/*
 * designed by  "Amir Hosein Shekari"
 */

package com.StudentManagerSystem.ui.manager.searchSubject;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.DateUtil;
import com.StudentManagerSystem.Student;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SearchSubject {
    @FXML
    private JFXTextField uniID;
    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXDatePicker birthDate;
    @FXML
    private JFXTextField ID;

    @FXML
    private void initialize() {

    }

    @FXML
    private void AdvSearchHandler(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/advancedSearch/advancedSearch.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Advanced Search");
            stage.setScene(new Scene(parent));
            stage.setAlwaysOnTop(true);
            stage.showAndWait();
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void searchStudentHandler(){
        try {
            Student s = StudentManagerPageController.displayInformation(Integer.parseInt(uniID.getText()));
            name.setText(s.getName());
            lastName.setText(s.getLastname());
            ID.setText(""+s.getId());
            birthDate.setValue(DateUtil.parse(s.getBirthDate()));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}