package A05DP;

import java.io.*;
import java.util.*;


public class A05백준평범한배낭 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] input= br.readLine().split(" ");
        int n =Integer.parseInt(input[0]);
        int k =Integer.parseInt(input[0]);

        int[][] stuff = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            stuff[i]=new int[]{Integer.parseInt(line[0]),Integer.parseInt(line[1])};
        }
    }
}
