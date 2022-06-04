package com.fxdinamax.dinamax_fx.mvc.CardListView;

public class CardModel {
    private String title;
    private String subtitle;
    private String cifra;

    public CardModel(String title, String subtitle, String cifra) {
        super();
        this.title = title;
        this.subtitle = subtitle;
        this.cifra = cifra;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getCifra() {
        return cifra;
    }
}
