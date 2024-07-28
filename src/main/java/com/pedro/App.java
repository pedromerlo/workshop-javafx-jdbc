package com.pedro;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("gui/MainView.fxml"));
        ScrollPane scrollPane = loader.load();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        Scene mainScene = new Scene(scrollPane);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sample JavaFX application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}