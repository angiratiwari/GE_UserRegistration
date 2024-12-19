package Test;

import Main.UserRegistration;
import Main.InvalidUserDetailException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testFirstName() {
        // Happy Case
        Assertions.assertDoesNotThrow(() -> userRegistration.validateFirstName("Angira"));

        // Sad Case
        InvalidUserDetailException exception = Assertions.assertThrows(InvalidUserDetailException.class, () -> {
            userRegistration.validateFirstName("an");
        });
        Assertions.assertEquals("Invalid First Name: Must start with a capital letter and have at least 3 characters.", exception.getMessage());
    }

    @Test
    public void testLastName() {
        // Happy Case
        Assertions.assertDoesNotThrow(() -> userRegistration.validateLastName("Tiwari"));

        // Sad Case
        InvalidUserDetailException exception = Assertions.assertThrows(InvalidUserDetailException.class, () -> {
            userRegistration.validateLastName("ti");
        });
        Assertions.assertEquals("Invalid Last Name: Must start with a capital letter and have at least 3 characters.", exception.getMessage());
    }

    @Test
    public void testEmail() {
        // Happy Case
        Assertions.assertDoesNotThrow(() -> userRegistration.validateEmail("abc.xyz@bl.co.in"));

        // Sad Case
        InvalidUserDetailException exception = Assertions.assertThrows(InvalidUserDetailException.class, () -> {
            userRegistration.validateEmail("abc.xyz@bl@co.in");
        });
        Assertions.assertEquals("Invalid Email: Does not match required pattern.", exception.getMessage());
    }

    @Test
    public void testMobileNumber() {
        // Happy Case
        Assertions.assertDoesNotThrow(() -> userRegistration.validateMobileNumber("91 9919819801"));

        // Sad Case
        InvalidUserDetailException exception = Assertions.assertThrows(InvalidUserDetailException.class, () -> {
            userRegistration.validateMobileNumber("919919819801");
        });
        Assertions.assertEquals("Invalid Mobile Number: Must be in the format '91 1234567890'.", exception.getMessage());
    }

    @Test
    public void testPassword() {
        // Happy Case
        Assertions.assertDoesNotThrow(() -> userRegistration.validatePassword("Pass@1234"));

        // Sad Case
        InvalidUserDetailException exception = Assertions.assertThrows(InvalidUserDetailException.class, () -> {
            userRegistration.validatePassword("pass123");
        });
        Assertions.assertEquals("Invalid Password: Must be at least 8 characters long, contain one uppercase, one numeric digit, and one special character.", exception.getMessage());
    }
}
