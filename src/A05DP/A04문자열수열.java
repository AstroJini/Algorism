package A05DP;

import java.io.*;
import java.util.*;
public class A04문자열수열 {
//        가장 긴 증가하는 부분 수열 (11053)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numsLine = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(numsLine[i]);
        }
        int[] dp = new int[n];
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            dp[i]=1; ///dp 값 초기화, 수열의 크기가 1~1000까지이기에 가장 작은 값을 초기값으로 둠
            for (int j = 0; j < i; j++) {
                if (arr[j]<arr[i]){ /// 뒤에 나오는 값이 더 클 경우
                    dp[i]=Math.max(dp[i],dp[j]+1); ///dp배열에 값을 저장하고 수열의 최대 길이를 갱신
                }
                maxLength=Math.max(maxLength,dp[i]);
            }
        }
        System.out.println(maxLength);



    }
}
