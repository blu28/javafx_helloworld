package com.example.helloworld;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        Button quit = new Button("quit");
        quit.setOnAction(e -> Platform.exit());

        VBox root = new VBox(10, label, quit);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 240, 120);

        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}