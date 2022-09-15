package APNACOLLAGE.Lecture_5;

public class starsrows {
    public static void main(String[] args) {
        int m=5;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<=m; i++){
            for(int j=0; j<=m-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        m =4;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}
