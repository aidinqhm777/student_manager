package com.StudentManagerSystem.ui.manager.login;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private AnchorPane root;

    @FXML
    private void initialize() {
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String uname = username.getText();
        String pword = password.getText();

        if (uname.equals("admin") && pword.equals("admin")){
            closeStage();
            loadMain();
        }
        else {
            username.getStyleClass().add("wrong-credentials");
            password.getStyleClass().add("wrong-credentials");
        }
    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event) {
        System.exit(0);
    }

    private void closeStage() {
        ((Stage) username.getScene().getWindow()).close();
    }

    private void loadMain() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/main/mainApp.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Student Assistant");
            stage.setScene(new Scene(parent));
            stage.show();
        }
        catch (IOException ex) {
            //TODO
        }
    }

}
