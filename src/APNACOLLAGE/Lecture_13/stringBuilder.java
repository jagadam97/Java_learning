package APNACOLLAGE.Lecture_13;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // Char at index 0
        System.out.println(sb.charAt(0));

        // set character
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // Insert character at index 0
        sb.insert(2, 'n');
        System.out.println(sb);

        // Delete the extra character
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
