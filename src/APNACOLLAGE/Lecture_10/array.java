package APNACOLLAGE.Lecture_10;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //int[] marks = new int[3];
        int[] marks = {97,98,92};
        //marks[0] = 95; //telugu
        //marks[1] = 99; //hindi
        //marks[2] = 92; //English
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for (int i=0; i< marks.length ; i++ )
        {
            System.out.println(marks[i]);
        }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] number = new int[size];

        for (int i=0; i<size ;i++) number[i] = sc.nextInt();
        for (int i=0; i< size ; i++ ) System.out.println(number[i]);
        sc.close();
    }
}
