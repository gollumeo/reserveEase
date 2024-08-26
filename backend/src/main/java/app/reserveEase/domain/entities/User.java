package app.reserveEase.domain.entities;

import app.reserveEase.domain.valueobjects.Email;
import app.reserveEase.domain.valueobjects.Password;
import app.reserveEase.domain.valueobjects.Username;

public class User {

    private final Username username;
    private final Password password;
    private final Email email;

    public User(Username username, Password password, Email email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Username getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }

    public Email getEmail() {
        return email;
    }
}
