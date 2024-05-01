package controller;

import Model.Game.GameObject;
import Model.Result;

public class GameController {

    private GameObject gameObject;

    public Result vetoCardInHand(int index) {
        index--;
        return null;
    }

    public Result showAllCardsInHand() {
        return null;
    }

    public Result showCardWithNumber(int index) {
        index--;
        return null;
    }

    public Result showRemainingCards() {
        return null;
    }

    public Result showDiscardedCards() {
        return null; //show both player's and opponent's cards
    }

    public Result showRowCards(String rowName) {
        return null;
    }

    public Result showAllSpells() {
        return null;
    }

    public Result placeCardInPlace(String cardName, String placeName) {
        return null;
    }

    public Result showLeader() {
        return null;
    }

    public Result playLeader() {
        return null;
    }

    public Result showPlayersInfo() {
        return null;
    }

    public Result showPlayerLives() {
        return null; // get players' remaining gems
    }

    public Result showNumberOfCardsInHand() {
        return null;
    }

    public Result showTurnInfo() {
        return null;
    }

    public Result showPlayersScore() {
        return null;
    }

    public Result showScoreOfRow(String rowName) {
        return null;
    }

    public Result passRound() {
        return null;
    }

    private void nextTurn() {}
}
