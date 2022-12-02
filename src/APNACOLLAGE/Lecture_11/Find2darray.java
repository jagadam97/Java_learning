package APNACOLLAGE.Lecture_11;

import java.util.Scanner;

public class Find2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Please enter the no. of colums : ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Please enter the number to be found in the array : ");
        int find = sc.nextInt();
        for (int i = 0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
               if (array[i][j]==find) System.out.print(array[i][j]+" is found at location : rows-"+i+" cols-"+j);
            }
            System.out.println();
        }
    }
}
