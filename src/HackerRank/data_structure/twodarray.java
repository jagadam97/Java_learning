package HackerRank.data_structure;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class twodarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().trim().split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int[][] a= new int[6][6];
        for(int i=0;i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j]= arr.get(i).get(j);
            }
        }

        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            int curSum=0;
            for(int j=0; j<4; j++){
                curSum= a[i][j] + a[i][j+1] + a[i][j+2] 
                                + a[i+1][j+1] +
                        a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                if(curSum>maxSum) maxSum=curSum;
            }
        }
        System.out.println(maxSum);

        bufferedReader.close();
    }
}