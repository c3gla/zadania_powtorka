package shapes;


public class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        setRadius(radius);
    }


    @Override
    public double area() {
        return 0;
    }

    public double getRadius() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius have to be greater than 0.");
        } else {
            this.radius = radius;
        }
    }
}
