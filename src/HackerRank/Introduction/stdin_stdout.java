package HackerRank.Introduction;

import java.util.Scanner;

public class stdin_stdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
}