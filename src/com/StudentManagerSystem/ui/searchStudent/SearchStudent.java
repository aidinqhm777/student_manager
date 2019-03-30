/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.searchStudent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SearchStudent {
    @FXML
    private void initialize() {

    }

    @FXML
    private void AdvSearchHandler(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/advancedSearch/advancedSearch.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Advanced Search");
            stage.setScene(new Scene(parent));
            stage.setAlwaysOnTop(true);
            stage.showAndWait();
        } catch (IOException e) {
            //TODO
        }
    }
}
