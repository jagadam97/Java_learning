package HackerRank.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class big_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();
    
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
        input.close();
}
}