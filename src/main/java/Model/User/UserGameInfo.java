package Model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserGameInfo {

    private User owner;
    private int score = 0;
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
        ArrayList<User> toBeSortedList = User.getAllUsers();
        Collections.sort(toBeSortedList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                // positive or negative to be checked TODO
                if (o1.getGameInfo().score > o2.getGameInfo().score)
                    return 1;
                if (o1.getGameInfo().score < o2.getGameInfo().score)
                    return -1;
                return 0;
            }
        });
        for (int i = 0; i < toBeSortedList.size(); i++) {
            if (toBeSortedList.get(i).equals(owner))
                return i;
        }
        return 0;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
