package lectures.lec5;

public class TriangleValidationException extends Exception{
    public TriangleValidationException() {
        super("Triangle with this sides can not exists");
    }

    public TriangleValidationException(String message) {
        super(message);
    }
}
