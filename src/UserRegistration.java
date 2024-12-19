import java.util.regex.Pattern;

public class UserRegistration {
    // UC1: Validate First Name
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
    }

    // UC2: Validate Last Name
    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName);
    }

    // UC3: Validate Email
    public boolean validateEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$", email);
    }

    // UC4: Validate Mobile Number
    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches("^[0-9]{2} [0-9]{10}$", mobileNumber);
    }

    // UC5-UC8: Validate Password (all rules combined)
    public boolean validatePassword(String password) {
        String rule1 = "(?=.*[A-Z])"; // At least one uppercase
        String rule2 = "(?=.*[0-9])"; // At least one digit
        String rule3 = "(?=.*[@#$%^&-+=()])"; // At least one special character
        String rule4 = "(?=.{8,})"; // Minimum 8 characters

        String combinedRule = rule1 + rule2 + rule3 + rule4;
        return Pattern.matches(combinedRule, password);
    }

}
