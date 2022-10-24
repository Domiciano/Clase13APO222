package com.example.introfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view.fxml")
        );
        Parent node = fxmlLoader.load();
        Scene scene = new Scene(node);
        Stage window = new Stage();
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}