package Model.Card;

import java.util.ArrayList;

public class UnitCard extends Card{

    private int basePower;
    private int moralBoost;
    private int multipliedPower;
    private int currentBasePower;
    private boolean isHero;

    public UnitCard(String name, String description, String placeInField, int basePower, boolean isHero, ArrayList<CardAbility> cardAbilities) {
        super(name, description, placeInField, cardAbilities);
        this.basePower = basePower;
        this.isHero = isHero;
    }

    public void putInField() {}

    public void removeFromField() {}

    public int calculateStrength() {
        return (currentBasePower * multipliedPower) + moralBoost;
    }

    public void setMoralBoost(int moralBoost) {
        this.moralBoost = moralBoost;
    }

    public void setMultipliedPower(int multipliedPower) {
        this.multipliedPower = multipliedPower;
    }

    public void setCurrentBasePower(int currentBasePower) {
        this.currentBasePower = currentBasePower;
    } // don't forget to check conditions of bad weather

    public void setHero(boolean hero) {
        isHero = hero;
    }

    public int getBasePower() {
        return basePower;
    }

    public int getMoralBoost() {
        return moralBoost;
    }

    public int getMultipliedPower() {
        return multipliedPower;
    }

    public int getCurrentBasePower() {
        return currentBasePower;
    }

    public boolean isHero() {
        return isHero;
    }
}
