package lab_exercises.lab_6.validation;

public class NoMoreProductsException extends Exception {

    @Override
    public String getMessage() {
        return "not enough products in the inventory";
    }
}
