package lectures.lec4;
//fic it
public class Triangle extends Figure implements FigureColor{

    private double sideC;
    private String color;

    @Override
    void printInfo() {
        System.out.println("Side a: " + getSideA());
        System.out.println("Side b: " + getSideB());
        System.out.println("Side c: " + getSideC());
    }

    @Override
    public double getArea() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side a=" + getSideA() +
                "; side b=" + getSideB() +
                "; side c=" + getSideC() +
                "; color='" + getColor() + '\'' +
                '}';
    }
}


