
import java.awt.Point;

class Circle {
    Point c;
    int r;

    public Circle(Point c, int r) {
        this.c = c;
        this.r = r;
    }

    double Area() {
        return 2 * 3.14 * r;
    }

    Point getCenter() {
        return c;
    }
}

public class Bank {
    public static void main(String[] args) {

    }
}