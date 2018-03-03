package herogame;

public class AreaBattle {

    int length;




    public static int pointMin;
    public static int pointMax;


    public static int rangeAttack(int length1, int length2) {


        int rangeMiss;
        rangeMiss = pointMax - pointMin - length1 - length2;



        return rangeMiss;

    }
}
