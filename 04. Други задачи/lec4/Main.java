package lectures.lec4;

//example 2 interface lecture 21.10.2022
public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.setSideA(2);
        rec1.setSideB(2);
        rec1.setColor("red");
        System.out.println(rec1.getArea());

        Triangle tri1 = new Triangle();
        tri1.setSideA(3);
        tri1.setSideB(4);
        tri1.setSideC(5);
        tri1.setColor("blue");
        System.out.println(tri1.getArea());

        Figure[] figures = new Figure[2];
        figures[0] = rec1;
        figures[1] = tri1;
        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }
}

