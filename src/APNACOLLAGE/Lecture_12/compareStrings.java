package APNACOLLAGE.Lecture_12;

public class compareStrings {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        // s2 == s1
        // s1 > s2
        // s1 < s2
        if (name1.compareTo(name2) == 0)
        {
            System.out.println("Both names are equal");
        }
        else System.out.println("Both names are not equal");
    }
}
