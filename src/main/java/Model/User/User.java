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

    public static void removeUser(User user) {}

    public static User getUserByUsername(String username) {return null;}

    public static boolean doesUserExist(String username) {return false;}
}