package controller;

import Model.Game.Player;
import Model.Result;
import Model.User.User;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class LoginController {
    private String onLoggingUsername;

    public Result login(String username, String password) {
        if (User.doesUserExist(username)) {
            if (User.getUserByUsername(username).getPassword().equals(password)) {
                User.setLoggedInUser(User.getUserByUsername(username));
                return new Result("Logged in!", "Logging into game successfully.", true);
            } else if (!password.equals("")){
                return new Result("Wrong Password!", "Entered password is wrong.", false);
            } else {
                return new Result("Empty password!", "You haven't field the password box yet.", false);
            }
        } else if (username.equals("")) {
            return new Result("Empty Username!", "You haven't field the username box yet.", false);
        } else {
            return new Result("Wrong Username!", "Username \"" + username + "\" does not exist.", false);

        }
    }

    public Result forgotPassword(String username) {
        if (User.doesUserExist(username)) {
            onLoggingUsername = username;
            return new Result("User found. Enter a security question", true);
        } else {
            return new Result("username not found", false);
        }
    }

    public Result checkQuestionSecurity(String questionNumber, String answer) {
        int number = Integer.parseInt(questionNumber);
        User user = User.getUserByUsername(onLoggingUsername);
        if (user.returnQuestion(number).equals(answer)) {
            return new Result("Correct answer", true);
        } else {
            return new Result("Wrong answer", false);
        }
    }

    public Result checkQuestionSecurity(int number, String answer) {
        User user = User.getUserByUsername(onLoggingUsername);
        if (user.returnQuestion(number).equals(answer)) {
            return new Result("Correct answer", true);
        } else {
            return new Result("Wrong answer", false);
        }
    }

    public String setPassword(String password) {
        User user = User.getUserByUsername(onLoggingUsername);
        assert user != null;
        user.setPassword(password);
        return "password changed successfully";
    }

    public String setPassword() {
        User user = User.getUserByUsername(onLoggingUsername);
        assert user != null;
        user.setPassword(RegisterController.generateStrongPassword());
        return "password changed successfully";
    }
}
