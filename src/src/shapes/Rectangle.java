package shapes;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        setA(a);
        setB(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a <= 0){
            throw new IllegalArgumentException("Side of the rectangle have to be greater than zero.");

        } else {
            this.a = a;
        }

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b <= 0){
            throw new IllegalArgumentException("Side of the rectangle have to be greater than zero.");

        } else {
            this.b = b;
        }
    }

    @Override
    public double area() {
        return a * b;
    }
}
