package HackerRank.Strings;

public class MyRegex {
    public String pattern;
    
    {
        String pat = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        this.pattern = pat + "\\."
                       + pat + "\\."
                       + pat + "\\."
                       + pat;
    }
    public static void main(String[] args){
        regex.main(args);
    }
}