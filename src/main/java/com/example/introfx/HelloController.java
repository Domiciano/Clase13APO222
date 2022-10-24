package com.example.introfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {

    @FXML
    private Button openBTN;

    @FXML
    private TextField pathTF;

    @FXML
    private TextArea fileContentTA;

    @FXML
    void openFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        //Como referenciar el stage desde un controller
        Stage stage = (Stage) openBTN.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        String path = file.getAbsolutePath();
        pathTF.setText(path);
    }

}
