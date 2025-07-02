package A05DP;

import java.io.*;
import java.util.*;

public class A02백준동전2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            int coinValue = Integer.parseInt(br.readLine());
            coins[i]=coinValue;
        }
        int[] answer = new int[k+1];
        Arrays.fill(answer,10001);
        answer[0]=0;
        for (int coin : coins){
            for (int i = coin; i <= k; i++) {
                answer[i]=Math.min(answer[i],answer[i-coin]+1);
            }
        }


        System.out.println(answer[k] == 10001 ? -1 : answer[k]);
    }
}
