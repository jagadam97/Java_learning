package HackerRank.Strings;

import java.util.Scanner;

public class string_intro {
    public static String cap(String name)
    {
    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1, name.length());

    firstLetter = firstLetter.toUpperCase();

    name = firstLetter + remainingLetters;
    return name;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len=A.length()+B.length();
        System.out.println(len);
        int comp = A.compareTo(B);
        if(comp>0)
        {
            System.out.println("Yes");
        }
        else
        {
           System.out.println("No"); 
        }
        String out = cap(A)+" "+cap(B);
        System.out.println(out);
        sc.close();
    }
    
}