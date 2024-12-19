package Main;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) throws InvalidUserDetailException {
        if (firstName == null || !Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName)) {
            throw new InvalidUserDetailException("Invalid First Name: Must start with a capital letter and have at least 3 characters.");
        }
        return true;
    }

    public boolean validateLastName(String lastName) throws InvalidUserDetailException {
        if (lastName == null || !Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName)) {
            throw new InvalidUserDetailException("Invalid Last Name: Must start with a capital letter and have at least 3 characters.");
        }
        return true;
    }

    public boolean validateEmail(String email) throws InvalidUserDetailException {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new InvalidUserDetailException("Invalid Email: Does not match required pattern.");
        }
        return true;
    }

    public boolean validateMobileNumber(String mobileNumber) throws InvalidUserDetailException {
        if (mobileNumber == null || !Pattern.matches("^\\d{2} \\d{10}$", mobileNumber)) {
            throw new InvalidUserDetailException("Invalid Mobile Number: Must be in the format '91 1234567890'.");
        }
        return true;
    }

    public boolean validatePassword(String password) throws InvalidUserDetailException {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";
        if (password == null || !Pattern.matches(passwordRegex, password)) {
            throw new InvalidUserDetailException("Invalid Password: Must be at least 8 characters long, contain one uppercase, one numeric digit, and one special character.");
        }
        return true;
    }
}
