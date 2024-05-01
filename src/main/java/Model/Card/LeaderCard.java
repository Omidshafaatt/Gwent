package Model.Card;

import java.util.ArrayList;

public class LeaderCard extends Card{

    private boolean isLeadersAbilityPassive;

    public LeaderCard(String name, String description, String placeInField, ArrayList<CardAbility> cardAbilityArrayList, boolean isLeadersAbilityPassive) {
        super(name, description, placeInField, cardAbilityArrayList);
        this.isLeadersAbilityPassive = isLeadersAbilityPassive;
    }

    public boolean isLeadersAbilityPassive() {
        return isLeadersAbilityPassive;
    }

    @Override
    public void putInField() {

    }

    @Override
    public void removeFromField() {

    }
}
