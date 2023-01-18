package lab_exercises.lab_6.validation;

public class WrongPhoneNumberException extends Exception {
    @Override
    public String getMessage() {
        return "invalid phone number";
    }
}
