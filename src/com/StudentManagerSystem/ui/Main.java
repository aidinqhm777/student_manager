package com.StudentManagerSystem.ui;

import com.StudentManagerSystem.SystemManage;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        try { SystemManage.loadProgram(); } catch (IOException | ClassNotFoundException e) {
            try { SystemManage.saveProgram();}
            catch (IOException e1) {
                System.out.println("Problem in load the files, restart the program"); }
        }

        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/login/login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setOnHiding( event -> {System.out.println("Closing Stage");} );

    }

    public static void main(String[] args) {
        launch(args);
    }

}