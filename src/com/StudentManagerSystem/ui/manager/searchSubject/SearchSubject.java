/*
 * designed by  "Amir Hosein Shekari"
 */

package com.StudentManagerSystem.ui.manager.searchSubject;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.DateUtil;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.Subject;
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
    private JFXTextField title;
    @FXML
    private JFXTextField studentCount;
    @FXML
    private JFXTextField unitVal;
    @FXML
    private JFXDatePicker testDate;

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
    private void searchSubjectHandler(){
        Subject s;
        //todo subject search is not complete
    }
}
