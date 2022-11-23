package HackerRank.Strings;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "";
        int len = A.length();
        for(int i=0;i<=len-1;i++)
        {
            B = B + A.substring(len-i-1,len-i);
        }
        //System.out.println(B);
        if(A.equals(B)) System.out.print("Yes");
        else System.out.print("No");
        sc.close();
    }
}
