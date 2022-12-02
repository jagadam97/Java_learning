package APNACOLLAGE.Lecture_10;

import java.util.Scanner;

public class searchNumber {
    public static void search(int[] a, int b)
    {
        System.out.print("searched number is found at index :");
        for (int i = 0; i<a.length; i++)
        {
            if(a[i]==b) System.out.print("  "+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.print("please enter the number to be searched : ");
        int number = sc.nextInt();
        search(array,number);
        sc.close();
    }
}
