package HackerRank.Introduction;

import java.util.Scanner;

public class ifElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2==1){
            System.out.println("Weird");
        }
        else if(2 <= N && N <= 5){
            System.out.println("Not Weird");
        }
        else if(6 <= N && N <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

