package Model.Game;

import Model.Card.Card;
import Model.Card.LeaderCard;
import Model.Card.SpellCard;
import Model.User.User;

import java.util.ArrayList;

public class Player {

    private User user;
    private GameObject gameObject;
    private int remainingGems;
    private boolean hasPassed;
    private boolean canPlayLeader; // both already played leader and Emhier white flame ability affects
    private String playersFaction;
    private LeaderCard leaderCard;
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
    private ArrayList<Card> closeRowCards = new ArrayList<>();
    private ArrayList<Card> rangedRowCards = new ArrayList<>();
    private ArrayList<Card> siegeRowCards = new ArrayList<>();
    private SpellCard[] commandersHornFields = new SpellCard[3];

    public Player(User user, String playersFaction, ArrayList<Card> deck, LeaderCard leaderCard) {
        this.user = user;
        this.playersFaction = playersFaction;
        this.deck = deck;
        // give 10 random cards from the deck to hand
        this.leaderCard = leaderCard;
        this.canPlayLeader = doesOpponentHasCancelLeader();
        this.remainingGems = 2;
    }

    public User getUser() {
        return user;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public int getRemainingGems() {
        return remainingGems;
    }

    public boolean isHasPassed() {
        return hasPassed;
    }

    public boolean isCanPlayLeader() {
        return canPlayLeader;
    }

    public String getPlayersFaction() {
        return playersFaction;
    }

    public LeaderCard getLeaderCard() {
        return leaderCard;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public ArrayList<Card> getCloseRowCards() {
        return closeRowCards;
    }

    public ArrayList<Card> getRangedRowCards() {
        return rangedRowCards;
    }

    public ArrayList<Card> getSiegeRowCards() {
        return siegeRowCards;
    }

    public SpellCard[] getCommandersHornFields() {
        return commandersHornFields;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public void setRemainingGems(int remainingGems) {
        this.remainingGems = remainingGems;
    }

    public void setHasPassed(boolean hasPassed) {
        this.hasPassed = hasPassed;
    }

    public void setCanPlayLeader(boolean canPlayLeader) {
        this.canPlayLeader = canPlayLeader;
    }

    public void addToHand(Card card) {
        user.getCardInventory().getCurrentFaction().removeCardFromDeck(card);
        removeFromHand(card);
    }

    public void addToDiscardPile(Card card) {
        removeFromHand(card);
        discardPile.add(card);
    }

    public void addToCloseRowCards(Card card) {
        removeFromHand(card);
        closeRowCards.remove(card);
    }

    public void addToRangedRowCards(Card card) {
        removeFromHand(card);
        rangedRowCards.remove(card);
    }

    public void addToSiegeRowCards(Card card) {
        removeFromHand(card);
        siegeRowCards.add(card);
    }

    public void addToCommandersHornFields(SpellCard spellCard) {
        // ? chera ArrayList nist dash
    }

    public void removeFromDeck(Card card) {
        user.getCardInventory().getCurrentFaction().removeCardFromDeck(card);
    }

    public void removeFromHand(Card card) {
        hand.remove(card);
    }

    public void removeFromDiscardPile(Card card) {
        discardPile.remove(card);
    }

    public void removeFromCloseRowCards(Card card) {
        closeRowCards.remove(card);
    }

    public void removeFromRangedRowCards(Card card) {
        rangedRowCards.remove(card);
    }

    public void removeFromSiegeRowCards(Card card) {
        siegeRowCards.remove(card);
    }

    public void removeFromCommandersHornFields(SpellCard spellCard) {
        // ? chera ArrayList nist dash
    }

    public int getCloseRowStrength() {
        int strength = 0;
        for (Card card : closeRowCards) {
            // strength to card ha nabood TODO
        }
        return 0;
    }

    public String showCloseRowCards() {
        StringBuilder report = new StringBuilder();
        for (Card card : closeRowCards) {
            report.append(card.getCardName()).append("\n");
        }
        return report.toString();
    }

    public int getRangedRowStrength() {
        int strength = 0;
        for (Card card : rangedRowCards) {
            // strength to card ha nabood TODO
        }
        return 0;
    }

    public String showRangedRowCards() {
        StringBuilder report = new StringBuilder();
        for (Card card : rangedRowCards) {
            report.append(card.getCardName()).append("\n");
        }
        return report.toString();
    }

    public int getSiegeRowStrength() {
        int strength = 0;
        for (Card card : siegeRowCards) {
            // strength to card ha nabood TODO
        }
        return 0;
    }

    public String showSiegeRowCards() {
        StringBuilder report = new StringBuilder();
        for (Card card : siegeRowCards) {
            report.append(card.getCardName()).append("\n");
        }
        return report.toString();
    }

    public void nextRound() {
    }

    private void applyFactionAbility() {
    }

    private void putSavedCards() {
    }

    private void removeSavedCards() {
    }

    private boolean doesOpponentHasCancelLeader() {
        return false;
    }
}
