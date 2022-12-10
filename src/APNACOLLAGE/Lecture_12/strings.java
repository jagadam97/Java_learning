package APNACOLLAGE.Lecture_12;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+ name);

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for (int i = 0; i < fullName.length(); i++)
        {
            System.out.println(fullName.charAt(i));
        }
        sc.close();
    }
}
