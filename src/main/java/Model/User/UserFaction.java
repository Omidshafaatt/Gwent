package Model.User;

import Model.Card.Card;

import java.util.ArrayList;

public class UserFaction {
    private User owner;
    private String factionName;
    private ArrayList<Card> leaderCards = new ArrayList<>();
    private Card currentLeader;
    private ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Card> storage = new ArrayList<>();
    private static ArrayList<UserFaction> allUserFactions = new ArrayList<>();

    public UserFaction(User owner, String factionName) {
        this.owner = owner;
        this.factionName = factionName;
        allUserFactions.add(this);
    }

    public void setCurrentLeader(Card currentLeader) {
        this.currentLeader = currentLeader;
    }

    public Card getCurrentLeader() {
        return this.currentLeader;
    }

    public void addCardToStorage(Card card) {
        storage.add(card);
    }

    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    public void removeCardFromStorage(Card card) {
        storage.remove(card);
    }

    public void removeCardFromDeck(Card card) {
        deck.remove(card);
    }

    public void addCardToLeaderCards(Card card) {
        leaderCards.add(card);
    }

    public Card getDeckCardByName(String name) {
        for (Card card : deck)
            if (card.getCardName().equals(name))
                return card;
        return null;
    }

    public boolean isCardByNameInDeck(String name) {
        return getDeckCardByName(name) != null;
    }

    public Card getStorageCardByName(String name) {
        for (Card card : deck)
            if (card.getCardName().equals(name))
                return card;
        return null;
    }

    public boolean isCardByNameInStorage(String name) {
        return getDeckCardByName(name) != null;
    }

    public Card getLeaderCardByName(String name) {
        for (Card card : deck)
            if (card.getCardName().equals(name))
                return card;
        return null;
    }

    public boolean isLeaderCardByNameExisting(String name) {
        return getDeckCardByName(name) != null;
    }
}
