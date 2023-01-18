package lab_exercises.lab_6.entities;

import lab_exercises.lab_6.validation.ValidatePhone;
import lab_exercises.lab_6.validation.WrongPhoneNumberException;

import java.util.regex.Pattern;

public class Provider implements ValidatePhone {
    private String name;
    private String phone;

    public Provider(String name, String phone) throws WrongPhoneNumberException {
        this.name = name;
        this.setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws WrongPhoneNumberException {
        if (validatePhoneNumber(phone)){
            this.phone = phone;
        }else {
            throw new WrongPhoneNumberException();
        }

    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^0[7-9]{2}[0-9]{3}[0-9]{4}$");
        return p.matcher(phoneNumber).matches();
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
