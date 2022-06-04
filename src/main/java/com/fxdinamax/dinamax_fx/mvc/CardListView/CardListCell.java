package com.fxdinamax.dinamax_fx.mvc.CardListView;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CardListCell extends ListCell<CardModel> {
    private HBox content;
    private Label title;
    private Label subtitle;
    private Label cifra;

    public CardListCell(){
        super();
        title = new Label();
        subtitle = new Label();
        cifra = new Label();
        var vBox = new VBox(title, subtitle, cifra);
        content = new HBox(new Label("[Graphic]"), vBox);
    }

    @Override
    protected void updateItem(CardModel item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null && !empty) { // <== test for null item and empty parameter
            title.setText(item.getTitle());
            subtitle.setText(item.getSubtitle());
            cifra.setText(item.getCifra());
            setGraphic(content);
        } else {
            setGraphic(null);
        }
    }
}
