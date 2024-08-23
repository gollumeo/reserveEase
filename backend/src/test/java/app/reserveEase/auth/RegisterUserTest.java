package app.reserveEase.auth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RegisterUserTest {

    @Test
    void should_register_user_successfully() {
        // Arrange
        Registrator registrator = new Registrator();
        Email email = new Email("test@test.com");
        Username username = new Username("JohnDoe666");
        Password password = new Password("azerty123");

        // Act
        User user = registrator.register(email, username, password);

        // Assert
        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertEquals(username, user.getUsername());
    }
}
