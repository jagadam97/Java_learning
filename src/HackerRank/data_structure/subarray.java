package HackerRank.data_structure;

import java.util.*;

public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int counter = 0;
        int sum = 0;
        //INPUT
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        //processing here
        for(int i =0; i<n ; i++){
            for(int j=i; j<n; j++){
                sum=0;
                for(int k= i; k<=j; k++){
                    sum = sum + arr[k];
                }
                if(sum<0) counter++;
            }
        }
        //output
        System.out.println(counter);
    }
}
