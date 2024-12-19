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

}
