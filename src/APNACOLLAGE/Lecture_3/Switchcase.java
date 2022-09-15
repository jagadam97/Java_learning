package APNACOLLAGE.Lecture_3;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("namasthey");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
            break;
        }
        sc.close();
    }
}