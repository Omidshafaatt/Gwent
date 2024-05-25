package controller;

import Model.Result;
import Model.User.User;

import Enum.LoginRegex;

import java.security.SecureRandom;

public class RegisterController {
    private static String username;
    private static String password;
    private static String nickname;
    private static String email;

    public static String generateStrongPassword() {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+";

        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;

        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
        password.append(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        for (int i = 0; i < 4; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        StringBuilder shuffledPassword = new StringBuilder();
        while (!password.isEmpty()) {
            int index = random.nextInt(password.length());
            shuffledPassword.append(password.charAt(index));
            password.deleteCharAt(index);
        }

        return shuffledPassword.toString();
    }

    public Result register(String username, String password, String nickname, String email) {
        if (User.doesUserExist(username)) {
            RegisterController.username = username + "-"; // later
            RegisterController.password = password;
            RegisterController.nickname = nickname;
            RegisterController.email = email;
            return new Result("username already taken", false);
        } else if (User.doesNicknameExist(nickname)) {
            return new Result("nickname already taken", false);
        } else {
            User user = new User(username, password, nickname, email);
            return new Result("registered successfully", true);
        }
    }

    public Result confirmRegister() {
        // baraye terminal bood
        return new Result("successful", true);
    }

    public Result passwordConfirmCheck(String pass, String confirm) {
        if (pass.equals(confirm))
            return new Result("password Checked", true);
        return new Result("wrong password Confirm", false);
    }

    public Result register(String username, String nickname, String email) {
        if (User.doesUserExist(username)) {
            RegisterController.username = username + "-"; // later
            RegisterController.nickname = nickname;
            RegisterController.email = email;
            password = generateStrongPassword();
            return new Result("username already taken", false);
        }
        if (LoginRegex.VALID_USERNAME.matches(username)) {
            return new Result("username is not valid", false);
        } else if (LoginRegex.VALID_EMAIL.matches(email)) {
            return new Result("email is not valid", false);
        } else if (LoginRegex.VALID_USERNAME.matches(username)) {
            return new Result("username is not valid", false);
        } else {
            User user = new User(username, password, nickname, email);
            return new Result("register successful", true);
        }
    }

    public String random() {
        return "";
    }

    public Result questionShow() {
        return null;
    }

    public Result saveAnswer(String answer, String number) {
        return null;
    }

    public Result saveAnswer(String answer, int number) {
        return null;
    }
}
