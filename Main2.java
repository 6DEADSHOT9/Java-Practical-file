class GeometricalFigures {
    public void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public void area(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void area(double side, char type) {
        if (type == 'S' || type == 's')
            System.out.println("Area of Square: " + (side * side));
    }

    public void area(double base, double height, char type) {
        if (type == 'T' || type == 't') {
            System.out.println("Area of Triangle: " + (0.5 * base * height));
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        GeometricalFigures geometricalFigures = new GeometricalFigures();
        geometricalFigures.area(5);
        geometricalFigures.area(5, 6);
        geometricalFigures.area(5, 's');
        geometricalFigures.area(5, 6, 't');
}
}