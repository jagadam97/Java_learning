package HackerRank.data_structure;

import java.util.*;

public class phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        sc.nextLine();
        for (int i =0; i<inputs; i++)
        {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            map.put(name,phone);
            sc.nextLine();
        }
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            if (map.get(s) == null)
            {
                System.out.println("Not found");
            }
            else System.out.println(s+"="+map.get(s));
        }
        sc.close();
    }
}
