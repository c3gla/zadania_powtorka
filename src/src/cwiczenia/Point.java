package cwiczenia;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Point {

    public int x;
    public int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x: " + x + " y: " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Main {

    public static void main(String[] args){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        Set<Point> points = new HashSet<>();
        points.add(p1);
        points.add(p2);
        System.out.println("Rozmiar zbioru: " + points.size());
    }
}
