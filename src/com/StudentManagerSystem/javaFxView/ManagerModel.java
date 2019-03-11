package com.StudentManagerSystem.javaFxView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class ManagerModel extends Application {
    private BorderPane rootLayout;
    private Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        initialiseRoot();
    }

    private void initialiseRoot() throws IOException {
        //set root layout
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Manager.fxml"));
        rootLayout = loader.load();

        // Give the controller access to the main app.
        ManagerController controller = loader.getController();
        controller.setManagerModel(this);

        //set scene
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        //show root
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

    public Stage getPriamryStage(){
        return primaryStage;
    }

}
