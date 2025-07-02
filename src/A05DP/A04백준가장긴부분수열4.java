package A05DP;

import java.io.*;
import java.util.*;

//이차원리스트를 사용하는게 메모리 효율적임

public class A04백준가장긴부분수열4 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] input = br.readLine().split(" ");
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i]=Integer.parseInt(input[i]);
//        }
//
//        int[] dp = new int[n];
//        int maxLength = 0;
//        int[] num = new int[]{};
//
//        for (int i = 0; i < n; i++) {
//            dp[i]=1;
//
//            for (int j = 0; j < i; j++) {
//                if (arr[j]<arr[i]){
//                    dp[i]=Math.max(dp[i],dp[j]+1);
//                    num[j]=arr[j];
//                }
//                maxLength=Math.max(maxLength, dp[i]);
//            }
//        }
//        System.out.println(maxLength);
//    }

    public static void main(String[] args) {
        int[] arr = {10,20,10,30,20,50};
        int n=6;
        int[]dp=new int[n];
        Arrays.fill(dp, 1);

        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            myList.add(new ArrayList<>());
        }

        for (int i = 0; i < dp.length; i++) {
            int max = Integer.MIN_VALUE;
            boolean check = false;
            int index = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j] && dp[j]>max){
                    max = dp[j];
                    index = j;
                    check = true;
                }
            }
            if (check){
                for (int a: myList.get(index)){
                    myList.get(i).add(a);
                }
                dp[i] = max + 1;
            }
            myList.get(i).add(arr[i]);
        }
        System.out.println(myList);
    }
}
