package Model.User;

import Model.Game.GameHistory;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String nickname;
    private String email;
    private UserCardInventory cardInventory;
    private UserGameInfo gameInfo;
    private ArrayList<GameHistory> userGameHistories = new ArrayList<>();
    private ArrayList<String> passwordQuestions = new ArrayList<>();
    private ArrayList<String> passwordAnswers = new ArrayList<>();
    private boolean isPlayingGame;
    private static User loggedInUser;
    private static ArrayList<User> allUsers = new ArrayList<>();

    public User(String username, String password, String nickname, String email) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.cardInventory = new UserCardInventory(this);
        this.gameInfo = new UserGameInfo(this);
        allUsers.add(this);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public UserGameInfo getGameInfo() {
        return gameInfo;
    }

    public ArrayList<GameHistory> getUserGameHistories() {
        return userGameHistories;
    }

    public ArrayList<String> getPasswordQuestions() {
        return passwordQuestions;
    }

    public ArrayList<String> getPasswordAnswers() {
        return passwordAnswers;
    }

    public boolean isPlayingGame() {
        return isPlayingGame;
    }

    public void setCardInventory(UserCardInventory cardInventory) {
        this.cardInventory = cardInventory;
    }

    public void setGameInfo(UserGameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    public void setUserGameHistories(ArrayList<GameHistory> userGameHistories) {
        this.userGameHistories = userGameHistories;
    }

    public void setPasswordQuestions(ArrayList<String> passwordQuestions) {
        this.passwordQuestions = passwordQuestions;
    }

    public void setPasswordAnswers(ArrayList<String> passwordAnswers) {
        this.passwordAnswers = passwordAnswers;
    }

    public void setPlayingGame(boolean playingGame) {
        isPlayingGame = playingGame;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserCardInventory getCardInventory() {
        return this.cardInventory;
    }

    public void addGameHistory(GameHistory gameHistory) {
        this.userGameHistories.add(0, gameHistory);
    }

    public static void removeUser(User user) {
    }

    public static User getUserByUsername(String username) {
        return null;
    }

    public String returnQuestion(int questionNumber) {
        return passwordQuestions.get(questionNumber);
    }
  
    public static boolean doesUserExist(String username) {return false;}

    public static User getLoggedInUser() {return loggedInUser;}
}
