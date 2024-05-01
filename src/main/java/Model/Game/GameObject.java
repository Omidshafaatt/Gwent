package Model.Game;

import Model.Card.SpellCard;

import java.util.ArrayList;

public class GameObject {

    private GameHistory gameHistory;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player currentRoundsWinner;
    private ArrayList<SpellCard> weatherField = new ArrayList<>();

    public GameObject(Player player1, Player player2, Player currentPlayer) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        this.gameHistory = new GameHistory(player1.getUser(), player2.getUser());
    }

    public GameHistory getGameHistory() {
        return gameHistory;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getCurrentRoundsWinner() {
        return currentRoundsWinner;
    }

    public ArrayList<SpellCard> getWeatherField() {
        return weatherField;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setCurrentRoundsWinner(Player currentRoundsWinner) {
        this.currentRoundsWinner = currentRoundsWinner;
    }

    public void addToWeatherField(SpellCard spellCard) {}

    public void removeFromWeatherField(SpellCard spellCard) {}

    public boolean isWeatherFrosting() { return false;}

    public boolean isWeatherFoggy() { return false;}

    public boolean isWeatherRainy() { return false;}

    public void nextRound() {}

    private void getPlayer1Score() {}

    private void getPlayer2Score() {}

    private void setThisRoundGameHistoryData() {}

    private void announceRoundWinner() {}
}
