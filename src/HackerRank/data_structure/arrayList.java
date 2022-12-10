package HackerRank.data_structure;

import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int numOfLines = scanner.nextInt();
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        
        for(int i = 0; i < numOfLines; i++){
            
            ArrayList<Integer> list = new ArrayList<>();
            
            int numOfItems = scanner.nextInt();
            list.add(numOfItems);
            
            while(numOfItems>0 && scanner.hasNextInt()){
                list.add(scanner.nextInt());
                numOfItems--;
            }
            
            lists.add(list);
        }
        
        int numOfQueries = scanner.nextInt();
        
        for(int i = 0; i < numOfQueries; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            try{
                System.out.println(lists.get(x-1).get(y));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}
