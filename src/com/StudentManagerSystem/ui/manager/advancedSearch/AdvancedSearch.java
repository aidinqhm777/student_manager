package com.StudentManagerSystem.ui.manager.advancedSearch;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.ui.data.StudentData;
import com.StudentManagerSystem.ui.manager.searchStudent.SearchStudent;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;

public class AdvancedSearch {

    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXTextField ID;
    @FXML
    private TableView list;

    @FXML
    private  TableColumn<StudentData, String> nameCloumn;
    @FXML
    private  TableColumn<StudentData, String> lastNameCloumn;
    @FXML
    private  TableColumn<StudentData, String> uniIdCloumn;
    @FXML
    private  TableColumn<StudentData, String> IDCloumn;

    private ObservableList<StudentData> personData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        list.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->{
                    StudentManagerPageController.studentTmp = ((StudentData) newValue).getStudent();
                    Stage stage = (Stage) name.getScene().getWindow();
                    stage.close();
                });
    }

    @FXML
    private void searchByIDHandler(){
        try {
            LinkedList<Student> s = StudentManagerPageController.searchStudent(
                    null,null, Integer.parseInt(ID.getText()) ,0);

            setDataToList(s);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            //todo
        }
    }

    @FXML
    private void searchByNameHandler(){
        try {
            String nameT = name.getText().equals("") ? null :  name.getText().toLowerCase();
            String lastNameT = lastName.getText().equals("") ? null :  lastName.getText().toLowerCase();

            LinkedList<Student> s = StudentManagerPageController.searchStudent(nameT, lastNameT , 0 ,0);
            setDataToList(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            //todo
        }
    }

    @FXML
    private void selectStudentHandler(){

    }

    private void setDataToList(LinkedList<Student> s){
        personData.clear();
        for (Student student : s) {
            personData.add(new StudentData(student));
        }
        nameCloumn.setCellValueFactory(cellData ->  cellData.getValue().nameProperty());
        lastNameCloumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        IDCloumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        uniIdCloumn.setCellValueFactory(cellData -> cellData.getValue().uniIdProperty());
        list.setItems(personData);
    }

}
