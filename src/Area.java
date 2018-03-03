public class Area {
    public static void main(String[] args) {

        double a = -22d;
        double b = 3d;
        double c = 8d;
        double a1 = -51d;
        double b1 = 6d;
        double c1 = -9d;

        double AB = Math.sqrt((a - b) * (a - b) + (a1 - b1) * (a1 - b1));
        double CA = Math.sqrt((a - c) * (a - c) + (a1 - c1) * (a1 - c1));
        double BC = Math.sqrt((b - c) * (b - c) + (b1 - c1) * (b1 - c1));

        double s = 0;
        if (AB + BC <= CA || AB + CA <= BC || BC + CA <= AB) {
            System.out.println("Треугольник не существует");
            System.exit(-1);

        } else {
            double p = (AB + BC + CA) / 2.0;

            s = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
            System.out.println("Площадь: " + s);

        }


        double a2 = 2d;
        double b2 = 37d;
        double c2 = 87d;
        double a3 = 56d;
        double b3 = 6d;
        double c3 = 9d;

        double AB1 = Math.sqrt((a2 - b2) * (a2 - b2) + (a3 - b3) * (a3 - b3));
        double CA1 = Math.sqrt((a2 - c2) * (a2 - c2) + (a3 - c3) * (a3 - c3));
        double BC1 = Math.sqrt((b2 - c2) * (b2 - c2) + (b3 - c3) * (b3 - c3));

        double s1 = 0;
        if (AB1 + BC1 <= CA1 || AB1 + CA1 <= BC1 || BC1 + CA1 <= AB1) {
            System.out.println("Треугольник не существует");
            System.exit(-1);

        } else {
            double p1 = (AB1 + BC1 + CA1) / 2.0;

            s1 = Math.sqrt(p1 * (p1 - AB1) * (p1 - BC1) * (p1 - CA1));
            System.out.println("Площадь: " + s1);
        }


        if (s > s1) {
            System.out.println("Площадь первого треугольника больше");

        } else {
            System.out.println("Площадь второго треугольника больше");
        }
    }





}
