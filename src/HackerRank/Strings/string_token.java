package HackerRank.Strings;

import java.util.Scanner;

public class string_token {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] token = s.trim().split("[ !,?.\\_'@]+");
        if (s.trim().length()==0 || s.trim().length()>400000) System.out.println(0);
        else System.out.println(token.length);
        for(int i = 0 ; i<token.length ; i++){
        System.out.println(token[i]);
        }
        scan.close();
    }
}
