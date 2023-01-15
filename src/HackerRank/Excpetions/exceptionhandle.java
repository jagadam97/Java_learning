package HackerRank.Excpetions;
import java.util.*;

public class exceptionhandle {
    public static void main(String[] args) {
    try{
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
    
        int z=x/y;
        System.out.println(z);
        sc.close();
    }
        catch( InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException  e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
