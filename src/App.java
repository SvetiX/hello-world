public class App {


    public static double x1 = 8d;
    public static double x2 = 10d;
    public static double x3 = 18d;
    public static double y1 = 80d;
    public static double y2 = 18d;
    public static double y3 = 82d;

    public static double a1 = 82d;
    public static double a2 = 1d;
    public static double a3 = 14d;
    public static double b1 = 6d;
    public static double b2 = 81d;
    public static double b3 = 74d;

    public static void main(String[] args) {


//        double AB = sideLenght(x1, x2, y1, y2);
        double AB = sideLenght(new Point(x1, y1), new Point(x2, y2));
        double BC = sideLenght(new Point(x1, y1), new Point(x3, y3));
        double CA = sideLenght(new Point(x2, y2), new Point(x3, y3));

        double AB1 = sideLenght(new Point(a1, b1), new Point(a2, b2));
        double BC1 = sideLenght(new Point(a1, b1), new Point(a3, b3));
        double CA1 = sideLenght(new Point(a2, b2), new Point(a3, b3));


//        double BC = sideLenght(x1, x3, y1, y3);
//        double CA = sideLenght(x2, x3, y2, y3);
//
//        double AB1 = sideLenght(a1, a2, b1, b2);
//        double BC1 = sideLenght(a1, a3, b1, b3);
//        double CA1 = sideLenght(a2, a3, b2, b3);

        double S1 = squareTriangle(AB, BC, CA);
        double S2 = squareTriangle(AB1, BC1, CA1);


        if (S1 > S2) {
            System.out.println("Площадь первого треугольника больше");
        } else {
            System.out.println("Площадь второго треугольника больше");
        }


    }


//    public static double sideLenght(double pointx1, double pointx2, double pointy1, double pointy2) {
//        double sideLenghtAll = Math.sqrt((pointx1 - pointx2) * (pointx1 - pointx2) + (pointy1 - pointy2) * (pointy1 - pointy2));
//        return sideLenghtAll;
//    }

    public static double squareTriangle(double pointx, double pointx1, double pointx2) {

        double p = (pointx + pointx1 + pointx2) / 2.0;
        double square = Math.sqrt(p * (p - pointx) * (p - pointx1) * (p - pointx2));
        return square;

    }


    public static double sideLenght(Point point1, Point point2) {
        double pointx1 = point1.x;
        double pointx2 = point2.x;
        double pointy1 = point1.y;
        double pointy2 = point2.y;

        double sideLenghtAll = Math.sqrt((pointx1 - pointx2) * (pointx1 - pointx2) + (pointy1 - pointy2) * (pointy1 - pointy2));
        return sideLenghtAll;


//        double partx1 = Point.pointX(x1, x2);
//        double partx2 = Point.pointX(x1, x3);
//        double partx3 = Point.pointX(x2, x3);
//
//        double party1 = Point.pointX(y1, y2);
//        double party2 = Point.pointX(y1, y3);
//        double party3 = Point.pointX(y2, y3);
//
//
//
//        double sideLenghtAB = Math.sqrt(partx1 + party1);
//        double sideLenghtBC = Math.sqrt(partx2 + party2);
//        double sideLenghtCA = Math.sqrt(partx3 + party3);

//        double sideLenghtAB1 = Math.sqrt(Point.pointX(a1, a2) + Point.pointY(b1, b2));
//        double sideLenghtBC1 = Math.sqrt(Point.pointX(a1, a3) + Point.pointY(b1, b3));
//        double sideLenghtCA1 = Math.sqrt(Point.pointX(a2, a3) + Point.pointY(b2, b3));


    }

}





