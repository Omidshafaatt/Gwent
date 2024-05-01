package Model.Card;

import java.util.ArrayList;

public class SpellCard extends Card{

    public SpellCard(String name, String description, String placeInField, ArrayList<CardAbility> cardAbilities) {
        super(name, description, placeInField, cardAbilities);
    }

    public void putInField() {}

    public void removeFromField() {}
}
