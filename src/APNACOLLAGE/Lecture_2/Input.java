package APNACOLLAGE.Lecture_2;

import java.util.*;

public class Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //nextline
        String name = in.nextLine();
        System.out.println(name);
        //nextint
        //nextfloat
        //nextchar
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        in.close();
        System.out.println(sum);
    }
}
