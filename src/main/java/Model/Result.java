package Model;

public class Result {

    private String title;
    private final String message;
    private final boolean isSuccessful;

    public Result(String title, String message, boolean isSuccessful) {
        this.title = title;
        this.message = message;
        this.isSuccessful = isSuccessful;
    }

    public Result(String message, boolean isSuccessful) {
        this.message = message;
        this.isSuccessful = isSuccessful;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    @Override
    public String toString() {
        return message;
    }
}
