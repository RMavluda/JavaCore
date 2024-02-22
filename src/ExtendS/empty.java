package ExtendS;

public class empty {
    public static void main(String[] args) {
        Properties geom[] = new Properties[4];
        geom[0] = new Line();
        geom[1] = new Triangle();
        geom[2] = new Rectangle();
        geom[3] = new Ellipse();
    }
}

class Properties{
    int width, color;

    Properties(){
        System.out.println("Construction Properties");
    }


}

class Line extends Properties {
    double x1, y1;
    double x2, y2;
}

class Triangle extends Properties{
    double x1, y1;
    double x2, y2;
    double x3, y3;
}

class Rectangle extends Properties {
    double x1, y1;
    double x2, y2;
}
class Ellipse extends Properties {
    double x1, y1;
    double x2, y2;
}