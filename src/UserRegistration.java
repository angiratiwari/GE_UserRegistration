import java.util.regex.Pattern;

public class UserRegistration {
    // UC1: Validate First Name
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
    }

}
