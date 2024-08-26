package app.reserveEase.auth;

import app.reserveEase.domain.entities.User;
import app.reserveEase.domain.services.Registrator;
import app.reserveEase.domain.valueobjects.Email;
import app.reserveEase.domain.valueobjects.Password;
import app.reserveEase.domain.valueobjects.Username;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RegisterUserTest {

    @Test
    void should_create_a_new_user_entity() {
        // Arrange
        Email email = new Email("test@test.com");
        Username username = new Username("1234");
        Password password = new Password("azerty123");

        // Act
        User user = new User(username, password, email);

        // Assert
        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
    }
}
