package lectures.test_example_2.entities;

import java.io.Serializable;

public class Form implements Serializable {
    // required fields
    private String name;
    private double grade;
    private double income;
    private String faculty;

    // to make it easy
    private boolean isChecked;

    // the code below is not required
    public Form(String name, double grade, double income, String faculty) {
        this.name = name;
        this.grade = grade;
        this.income = income;
        this.faculty = faculty;
        this.isChecked = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
