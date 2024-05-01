package Model.User;

import java.util.ArrayList;

public class UserCardInventory {
    private User owner;
    private UserFaction northernRealms;
    private UserFaction nilfgaardEmpire;
    private UserFaction monsters;
    private UserFaction scoiatael;
    private UserFaction skellige;
    private UserFaction currentFaction;

    private static ArrayList<UserCardInventory> allUserInventories = new ArrayList<>();

    public UserCardInventory(User owner) {
        this.owner = owner;
        allUserInventories.add(this);
    }

    public User getOwner() {
        return owner;
    }

    public UserFaction getNorthernRealms() {
        return northernRealms;
    }

    public UserFaction getNilfgaardEmpire() {
        return nilfgaardEmpire;
    }

    public UserFaction getMonsters() {
        return monsters;
    }

    public UserFaction getScoiatael() {
        return scoiatael;
    }

    public UserFaction getSkellige() {
        return skellige;
    }

    public UserFaction getCurrentFaction() {
        return currentFaction;
    }

    public void setNorthernRealms(UserFaction northernRealms) {
        this.northernRealms = northernRealms;
    }

    public void setNilfgaardEmpire(UserFaction nilfgaardEmpire) {
        this.nilfgaardEmpire = nilfgaardEmpire;
    }

    public void setMonsters(UserFaction monsters) {
        this.monsters = monsters;
    }

    public void setScoiatael(UserFaction scoiatael) {
        this.scoiatael = scoiatael;
    }

    public void setSkellige(UserFaction skellige) {
        this.skellige = skellige;
    }

    public void setCurrentFaction(UserFaction currentFaction) {
        this.currentFaction = currentFaction;
    }
}

