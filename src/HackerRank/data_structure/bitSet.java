package HackerRank.data_structure;

import java.util.*;

public class bitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
            
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];
        bitset[1] = b1;
        bitset[2] = b2;
        while(m-- > 0) {
            String s = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
                
            switch(s) {
                case "AND":
                bitset[x].and(bitset[y]);
                break;
                case "OR":
                bitset[x].or(bitset[y]);
                break;
                case "XOR":
                bitset[x].xor(bitset[y]);
                break;
                case "FLIP":
                bitset[x].flip(y);
                break;
                case "SET":
                bitset[x].set(y);
            }
            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
            }
            sc.close();
        }
    }