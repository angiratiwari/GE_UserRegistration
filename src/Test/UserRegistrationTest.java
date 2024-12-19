
package Test;

import Main.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testFirstName() {
        // Happy Case
        Assertions.assertTrue(userRegistration.validateFirstName("Angira"));
        // Sad Case
        Assertions.assertFalse(userRegistration.validateFirstName("an"));
    }

    @Test
    public void testLastName() {
        // Happy Case
        Assertions.assertTrue(userRegistration.validateLastName("Tiwari"));
        // Sad Case
        Assertions.assertFalse(userRegistration.validateLastName("ti"));
    }

    @Test
    public void testEmail() {
        // Happy Case
        Assertions.assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        // Sad Case
        Assertions.assertFalse(userRegistration.validateEmail("abc.xyz@bl@co.in"));
    }

    @Test
    public void testMobileNumber() {
        // Happy Case
        Assertions.assertTrue(userRegistration.validateMobileNumber("91 9919819801"));
        // Sad Case
        Assertions.assertFalse(userRegistration.validateMobileNumber("919919819801"));
    }

    @Test
    public void testPassword() {
        // Happy Case
        Assertions.assertTrue(userRegistration.validatePassword("Pass@1234"));
        // Sad Case
        Assertions.assertFalse(userRegistration.validatePassword("pass123"));
    }

    @Test
    public void testEmailSamples() {
        // Valid Emails
        Assertions.assertTrue(userRegistration.validateEmailSamples("abc@yahoo.com"));
        Assertions.assertTrue(userRegistration.validateEmailSamples("abc-100@yahoo.com"));

        // Invalid Emails
        Assertions.assertFalse(userRegistration.validateEmailSamples("abc@.com.my"));
        Assertions.assertFalse(userRegistration.validateEmailSamples(".abc@abc.com"));
    }
}

