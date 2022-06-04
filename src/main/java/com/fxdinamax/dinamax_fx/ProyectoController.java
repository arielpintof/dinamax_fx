package com.fxdinamax.dinamax_fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ProyectoController implements Initializable {

    @FXML
    private Label fecha;
    @FXML
    private ComboBox proyecto_combobox;
    @FXML
    private Label subtitle_1;
    @FXML
    private Label cifra_1;
    @FXML
    private Label title_1;


    protected void setFecha(){
        fecha.setText("3 de Junio, 2022");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}