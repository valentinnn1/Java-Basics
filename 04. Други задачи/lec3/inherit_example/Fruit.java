package lectures.lec3.inherit_example;

// defines main characteristics of fruits (applicable for all fruits)
class Fruit {
    //protected: accessible only for child classes
    protected Taste taste;
    protected boolean isRipe;
    protected boolean isPoisonous;

    public Fruit(Taste taste, boolean isRipe, boolean isPoisonous) {
        this.taste = taste;
        this.isRipe = isRipe;
        this.isPoisonous = isPoisonous;
    }

    protected boolean isEatable(){
        return isRipe && !isPoisonous;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "taste=" + taste +
                ", isRipe=" + isRipe +
                ", isPoisonous=" + isPoisonous +
                '}';
    }
}
