package HackerRank.Strings;

import java.util.Scanner;
class UsernameValidator {
    static String texto = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    public static final String regularExpression = texto;
}

public class valid_username {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
