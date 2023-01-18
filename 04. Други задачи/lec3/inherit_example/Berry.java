package lectures.lec3.inherit_example;

public class Berry extends Fruit{
    private String typeOfBerry;

    public Berry(Taste taste, boolean isRipe, boolean isPoisonous, String typeOfBerry) {
        // calls constructor form class Fruit
        super(taste, isRipe, isPoisonous);
        this.typeOfBerry = typeOfBerry;
    }

    public String getTypeOfBerry() {
        return typeOfBerry;
    }

    public void setTypeOfBerry(String typeOfBerry) {
        this.typeOfBerry = typeOfBerry;
    }

    @Override
    public String toString() {
        return "Berry{" +
                "taste=" + taste +
                ", isRipe=" + isRipe +
                ", isPoisonous=" + isPoisonous +
                ", typeOfBerry='" + typeOfBerry + '\'' +
                '}';
    }
}
