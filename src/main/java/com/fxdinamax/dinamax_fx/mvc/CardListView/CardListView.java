package com.fxdinamax.dinamax_fx.mvc.CardListView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

public class CardListView extends Application {

    /**
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<CardModel> data = FXCollections.observableArrayList();
        data.addAll(new CardModel("Gastos", "Total de gastos", "$"+"242.000"), new CardModel("Registros", "Total de registros", "100"));

        ListView<CardModel> listView = new ListView<CardModel>(data);
        listView.setCellFactory(new Callback<ListView<CardModel>, ListCell<CardModel>>() {
            @Override
            public ListCell<CardModel> call(ListView<CardModel> listView) {
                return new CardListCell();
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(listView);

    }
}
