package app.reserveEase.domain.valueobjects;

public class Email {

    private final String email;

    public Email(String email) {
        this.email = email;
    }

    public String getValue() {
        return email;
    }
}
