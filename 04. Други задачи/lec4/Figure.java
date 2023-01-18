package lectures.lec4;

public abstract class Figure {
    private double sideA;
    private double sideB;
    abstract void printInfo();
    abstract double getArea();

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
