package helper;

public class RandomHelp {





    public static int stats(int statsMin, int statsMax) {

        statsMax = statsMax - statsMin;

        int stats = (int) ((Math.random() * ++statsMax) + statsMin);
               return stats;

    }







}
