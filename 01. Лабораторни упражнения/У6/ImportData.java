package lab_exercises.lab_6;

import lab_exercises.lab_6.validation.WrongPhoneNumberException;

import java.io.IOException;

public interface ImportData {
    Object[] importDataFromFile() throws IOException, WrongPhoneNumberException;
}
