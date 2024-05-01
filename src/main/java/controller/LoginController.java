package controller;

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
                return new Result("login successful", true);
            } else {
                return new Result("password is wrong", false);
            }
        } else {
            return new Result("user does not exist", false);
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
