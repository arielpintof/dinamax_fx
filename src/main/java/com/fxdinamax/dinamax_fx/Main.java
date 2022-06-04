package com.fxdinamax.dinamax_fx;

import com.fxdinamax.dinamax_fx.entities.Proyecto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Proyecto proyecto;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proyecto-view.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("proyecto-view.fxml"));
        var scene = new Scene(root);
        stage.setTitle("Dinamax");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}