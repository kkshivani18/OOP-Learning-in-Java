package packages.llibrary.models;

public class User {
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.userId = userId;
        this.name = name;
    }

    // we use getters to safely access the private variables via public getters
    public String getName(){
        return name;
    }

    public int getUserId(){
        return userId;
    }

    @Override
    public String toString() {
            return "Name: " + name + "\n" + "UserID: " + userId + "\n";
    }
}
