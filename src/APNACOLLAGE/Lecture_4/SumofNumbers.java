package APNACOLLAGE.Lecture_4;

import java.util.*;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
        for(int i=0; i<=10; i++ ){
            System.out.print("2X"+i);
            System.out.print("=");
            System.out.println(2*i);
        }
    }
}
