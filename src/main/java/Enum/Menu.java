package Enum;

public enum Menu {
    Login("Login"),
    Register("Register"),
    Main("Main"),
    Profile("Profile"),
    Game("Game");

    private String value;

    Menu(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Menu fromValue(String value) {
        for (Menu menu : Menu.values()) {
            if (menu.getValue().equals(value)) {
                return menu;
            }
        }
        return null;
    }
}
