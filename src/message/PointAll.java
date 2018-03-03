package message;

public class PointAll {

    static int x = 40; // или надо рассчитывать?? высота от А1 до С

    int pointAx = 0;
    int pointAy = 0;
    int pointBx = 600;
    int pointBy = 0;
    int pointCx = 0;
    int pointCy = 100;
    int pointDx = 600;
    int pointDy = 100;
    int pointFx = 600/2 - 80*number/2;
    int pointFy = 100-x;
    int pointFFx = 600/2 + 80*number/2;
    int pointFFy = 100-x;


    MessageLast messageLast;
    static int number = MessageLast.messageLast(12345);





    static int pointA1x = (600 - (80 * number) / 2 - 150);
    static int pointA1y = (100 - x);

    static int pointB1x = (pointA1x + 150 * 2 + 80 * number);
    static int pointB1y = (100 - x);

    static int pointC1x = pointA1x;
    static int pointC1y = pointA1y + 400;

    static int pointD1x = pointB1x;
    static int pointD1y = pointC1y;

    static int pointF1x = 600/2+80*number/2;
    static int pointF1y = pointA1y;

//теперь на центр

    static int pointAxx = 1920 / 2 - 600 / 2;
    static int pointAyy = 1080 / 2 - (400 + 100 - x) / 2;

    static int pointBxx = 1920 / 2 + 600 / 2;
    static int pointByy = pointAyy;

    static int pointCxx = pointAxx;
    static int pointCyy = pointAyy + 100;

    static int pointDxx = pointBxx;
    static int pointDyy = pointByy + 100;




    static int pointA2x = 1920 / 2 - 80 / 2 * number - 150;
    static int pointA2y = pointAyy + 100 - x;

    static int pointB2x = 1920 / 2 + 80 / 2 * number + 150;
    static int pointB2y = pointA2y;

    static int pointC2x = pointA2x;
    static int pointC2y = pointA2y + 400;

    static int pointD2x = pointB2x;
    static int pointD2y = pointC2y;

    static int pointFxx = 1920/2 -80*number /2;
    static int pointFyy = pointA2y;

    static int pointF2x = 1920/2+80*number/2;
    static int pointF2y = pointFyy;

    public static void main(String[] args) {


        System.out.println("Длина сообщения = " + 80 * number);

        System.out.println("Точка А имеет кординаты " + pointAxx + "." + pointAyy);
        System.out.println("Точка B имеет кординаты " + pointBxx + "." + pointByy);
        System.out.println("Точка C имеет кординаты " + pointCxx + "." + pointCyy);
        System.out.println("Точка D имеет кординаты " + pointDxx + "." + pointDyy);
        System.out.println("Точка A1 имеет кординаты " + pointA2x + "." + pointA2y);
        System.out.println("Точка B1 имеет кординаты " + pointB2x + "." + pointB2y);
        System.out.println("Точка C1 имеет кординаты " + pointC2x + "." + pointC2y);
        System.out.println("Точка D1 имеет кординаты " + pointD2x + "." + pointD2y);
        System.out.println("Точка F имеет кординаты " + pointFxx + "." + pointFyy);
        System.out.println("Точка F1 имеет кординаты " + pointF2x + "." + pointF2y);


    }



}









