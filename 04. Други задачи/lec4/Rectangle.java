package lectures.lec4;

public class Rectangle extends Figure implements FigureColor{
    private String color;

    @Override
    void printInfo() {
        System.out.println("Side a:" + this.getSideA());
        System.out.println("Side b:" + this.getSideB());
        System.out.println(getArea());
    }
    @Override
    public double getArea() {
        return getSideA()*getSideB();
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
        return "Rectangle{" +
                "side a= " + getSideA() +
                "; side b= " + getSideB() +
                "; color='" + color + '\'' +
                '}';
    }
}
