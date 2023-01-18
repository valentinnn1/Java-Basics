package lectures.lec3.inherit_example;

// class Apple inherit Fruit
public class Apple extends Fruit{

    private int ageOfTree;

    public Apple(Taste taste, boolean isRipe, boolean isPoisonous, int ageOfTree) {
        // calls constructor form class Fruit
        super(taste, isRipe, isPoisonous);
        this.ageOfTree = ageOfTree;
    }

    public int getAgeOfTree() {
        return ageOfTree;
    }

    public void setAgeOfTree(int ageOfTree) {
        this.ageOfTree = ageOfTree;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "taste=" + taste +
                ", isRipe=" + isRipe +
                ", isPoisonous=" + isPoisonous +
                ", ageOfTree=" + ageOfTree +
                '}';
    }
}
