package lectures.lec5;

public class Triangle extends PlainFigure {
    public Triangle(double d1, double d2, double d3) throws TriangleValidationException {
        super(d1, d2, d3);
        validateTriangle(d1, d2, d3);
    }

    private void validateTriangle(double d1, double d2, double d3) throws TriangleValidationException {
        if(!(d1 + d2 > d3 && d2 + d3 > d1 && d3 + d1 > d2)){
            throw new TriangleValidationException();
        }
    }

    @Override
    public double calcArea() {
        double p = calcPerimeter() / 2;
        return Math.sqrt(p * (p - getD1()) * (p - getD2()) * (p - getD3()));
    }

    @Override
    public double calcPerimeter() {
        return this.getD1() + this.getD2() + this.getD3();
    }

    public static boolean isSimilar(Triangle triangle1, Triangle triangle2) {
        return triangle1.getD1() / triangle2.getD1() == triangle1.getD2() / triangle2.getD2() &&
                triangle1.getD1() / triangle2.getD1() == triangle1.getD3() / triangle2.getD3();
    }
}
