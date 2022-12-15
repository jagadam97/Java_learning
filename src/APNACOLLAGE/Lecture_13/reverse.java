package APNACOLLAGE.Lecture_13;



public class reverse {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("Hello");
        for (int i = 0 ; i< input.length()/2; i++)
        {
            int front = i;
            int back = input.length() - 1 - i; 
            char first = input.charAt(i);
            char last = input.charAt(input.length()-1-i);
            
            input.setCharAt(front, last);
            input.setCharAt(back, first);

        }
        System.out.println(input);
    }
}
