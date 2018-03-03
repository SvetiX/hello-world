import helper.RandomHelp;

public class Random {


//    public static void main(String[] args) {
//
//        int[] array = new int[1];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]= (int) ((Math.random()*11)-5);
//            System.out.println(array[i]);
//        }
//
//    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int stats = RandomHelp.stats(-2, 2);
            if (stats > 2 || stats<-2){

                System.out.println("Error!");

            }
//            System.out.println(stats);

        }


    }


}
