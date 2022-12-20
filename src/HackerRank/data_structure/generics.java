package HackerRank.data_structure;

import java.lang.reflect.Method;

class Printer {
    //Write your code here
    static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item); 
         }
     }
 }

public class generics {
    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
