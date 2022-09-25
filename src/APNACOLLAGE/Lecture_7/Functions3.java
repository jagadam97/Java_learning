package APNACOLLAGE.Lecture_7;

import java.util.Scanner;

public class Functions3 {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("the Product of the two numbers is " + calculateProduct(x, y));
        sc.close();
    }
}
