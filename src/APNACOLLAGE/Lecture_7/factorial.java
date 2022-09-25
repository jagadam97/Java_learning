package APNACOLLAGE.Lecture_7;

import java.util.Scanner;

public class factorial {
    public static void calculateFactorial(int n){
        int factorial = 1;
        if (n<0){
            System.out.println("Invalid number");
            return;
        }
        else{

        for(int i =n; i>=1; i--){
            factorial = factorial *i;
        }
        System.out.println(factorial);
        return;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
        sc.close();
    }
}
