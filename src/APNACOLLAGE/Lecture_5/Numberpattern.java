package APNACOLLAGE.Lecture_5;

public class Numberpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n; i++) {
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=0;i<n; i++) {
            for(int j =1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int m = 1;
        for (int i=1;i<=n; i++) {
            for(int j =1; j<=i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
        for (int i=1;i<=n; i++) {
            for(int j =1; j<=i; j++){
                int k=i+j;
                if(k%2==0) System.out.print(1); 
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
