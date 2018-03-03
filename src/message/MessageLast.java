package message;

public class MessageLast {


   public static int messageLast(int number) {

       int result = 0;
       while (number != 0) {
           ++result;
           number /= 10;
       }
       return result;
       }

}
