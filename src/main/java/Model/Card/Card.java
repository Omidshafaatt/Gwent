package Model.Card;

import java.util.ArrayList;

public abstract class Card {
    private String name;
    private String description;
    private String placeInField;
    private boolean isUnitCard;
    private ArrayList<CardAbility> cardAbilities;

    public Card(String name, String description, String placeInField, ArrayList<CardAbility> cardAbilityArrayList) {
        this.name = name;
        this.description = description;
        this.placeInField = placeInField;
        this.cardAbilities = cardAbilityArrayList;
    }

    public String getCardName() {
        return this.name;
    }

    public String getPlaceInField() {
        return placeInField;
    }

    abstract public void putInField();

    abstract public void removeFromField();

}
