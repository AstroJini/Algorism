package A05DP;

import java.io.*;
import java.util.*;


public class A05백준평범한배낭 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] input= br.readLine().split(" ");
        int n =Integer.parseInt(input[0]);
        int target =Integer.parseInt(input[0]);
        int[] dp = new int[target+1];
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(line[0]);
            arr[i][1]=Integer.parseInt(line[1]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (dp[j]-arr[i][0]>=0){
                    dp[j] = Math.max(dp[j-arr[i][0]]+arr[i][1], dp[j]);
                }
            }
        }
    }
}
