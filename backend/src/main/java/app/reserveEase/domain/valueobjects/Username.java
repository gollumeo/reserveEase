package app.reserveEase.domain.valueobjects;

public class Username {

    private final String username;

    public Username(String username) {
        this.username = username;
    }

    public String getValue() {
        return username;
    }
}
