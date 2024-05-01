package Model.User;

public class UserGameInfo {

    private User owner;
    private int highestScore;
    private int victoryCount;
    private int defeatCount;
    private int drawCount;

    public UserGameInfo(User user) {
        this.owner = user;
    }

    public User getOwner() {
        return owner;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public int getVictoryCount() {
        return victoryCount;
    }

    public int getDefeatCount() {
        return defeatCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void addHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public void addVictoryCount(int victoryCount) {
        this.victoryCount = victoryCount;
    }

    public void addDefeatCount(int defeatCount) {
        this.defeatCount = defeatCount;
    }

    public void addDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getUserRank() {
        return 0;
    }
}
