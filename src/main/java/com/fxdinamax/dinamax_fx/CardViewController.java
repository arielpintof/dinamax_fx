package com.fxdinamax.dinamax_fx;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CardViewController implements Initializable {

    private HBox container;
    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Node[] node = new Node[3];
        for(int i = 0; i < node.length; i++){
            try{
                node[i] = FXMLLoader.load(getClass().getResource("fxml/card-view.fxml"));
                container.getChildren().add(node[i]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
