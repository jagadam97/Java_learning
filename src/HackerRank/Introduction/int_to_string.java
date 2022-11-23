package HackerRank.Introduction;

import java.util.Scanner;

public class int_to_string {
    public static void main(String[] args) {

      
        try {
         Scanner in = new Scanner(System.in);
         int n = in .nextInt();
         in.close();
         //String s=???; Complete this line below
      
         String s = ""+n;
      
         
         if (n == Integer.parseInt(s)) {
          System.out.println("Good job");
         } else {
          System.out.println("Wrong answer.");
         }
        } catch (DoNotTerminate.ExitTrappedException e) {
         System.out.println("Unsuccessful Termination!!");
        }
       }
      }
      
      //The following class will prevent you from terminating the code using exit(0)!
      class DoNotTerminate {
      
       public static class ExitTrappedException extends SecurityException {
      
        private static final long serialVersionUID = 1;
       }

}
