abstract class shape {
    int a, b;

    abstract public void printarea();
}

class rectange extends shape {
    public rectange(int length, int breath) {
        this.a = length;
        this.b = breath;
    }

    public void printarea() {
        System.out.println("area of rectangle: " + a * b);
    }
}

class triangle extends shape {
    public triangle(int base, int height) {
        this.a = height;
        this.b = base;
    }

    public void printarea() {
        System.out.println("area of triangle: " + 0.5 * (a * b));
    }
}

class circle extends shape {
    public circle(int radius) {
        this.a = radius;
    }

    public void printarea() {
        System.out.println("area of circle: " + (22 / 7) * a * a);
    }
}

public class adstractc {
    public static void main(String[] args) {
        shape s;
        s = new rectange(5, 2);
        s.printarea();
        s = new triangle(5, 6);
        s.printarea();
        s = new circle(5);
        s.printarea();
    }
}
