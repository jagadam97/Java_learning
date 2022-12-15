package HackerRank.data_structure;

import java.util.Scanner;

public class twodArray {
    public static void main(String[] args) {
        int size = 6;
        int[][] arr = new int[size][size];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i<size; i++)
        {
            for (int j = 0; j<size; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //Processing dezz Nuts
        int answer = -2000;
        for (int i =0; i<size-2; i++)
        {
            for (int j =0; j<size-2; j++)
            {   
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                                + arr[i+1][j+1] +
                      arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum>answer)
                {
                    answer = sum;
                }
            }
        }
        System.out.println(answer);
    }
}
