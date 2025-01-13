package fr.isep.xuan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainScreen extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane() ;
        Button btn = new Button("Pick me") ;
        gridPane.add(btn, 0, 0) ;
        Scene scene = new Scene(gridPane, 320, 240) ;
        stage.setTitle("Hello !") ;
        stage.setScene(scene) ;
        stage.show() ;
    }
}
