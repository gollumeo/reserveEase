package app.reserveEase.domain.valueobjects;

public class Password {

    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public String getValue() {
        return password;
    }
}
