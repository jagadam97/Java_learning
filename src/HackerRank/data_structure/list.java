package HackerRank.data_structure;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0 ; i < size; i++) numbers.add(sc.nextInt());
        int query = sc.nextInt();
        for (int i = 0 ; i < query; i++)
        {
            String action = sc.next();
            if (action.equalsIgnoreCase("Insert"))
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                numbers.add(x,y);
            }
            else if (action.equalsIgnoreCase("Delete"))
            {
                int x = sc.nextInt();
                numbers.remove(x);
            }
        }
        //printing output
        for(int i = 0; i<numbers.size(); i++) System.out.print(numbers.get(i) + " ");
        sc.close();
    }
}
