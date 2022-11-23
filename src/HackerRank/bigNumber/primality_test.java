package HackerRank.bigNumber;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class primality_test {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        // String n = bufferedReader.readLine();
        BigInteger n = sc.nextBigInteger();
        boolean x = n.isProbablePrime(1);
        if(x) System.out.println("prime");
        else System.out.println("not prime");
        // bufferedReader.close();
        sc.close();
    }
}
