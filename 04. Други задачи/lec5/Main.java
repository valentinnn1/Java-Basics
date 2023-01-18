package lectures.lec5;

public class Main {
    public static void main(String[] args) throws TriangleValidationException {
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(12,13,5);
        Triangle t3 = new Triangle(6,8,10);
        // Triangle t4 = new Triangle(3,2,1); // this will throw exception
        t1.print();
        t2.print();
        System.out.println(t1.equals(t2)); // false
        System.out.println("P of t1 = " + t1.calcPerimeter());
        System.out.println("Area of t1 = " + t1.calcArea());
        System.out.println(Triangle.isSimilar(t1, t2)); // false
        System.out.println(Triangle.isSimilar(t1, t3)); // true
    }
}
