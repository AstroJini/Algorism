package A07이분탐색;

import java.io.*;
import java.util.*;

public class A02백준과자나눠주기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]); // 조카 수
        int N = Integer.parseInt(input[1]); // 과자 수

        String[] line = br.readLine().split(" ");
        int[] snack = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            snack[i] = Integer.parseInt(line[i]);
            max = Math.max(max, snack[i]); // 최대 과자 길이 찾기
        }

        int start = 1; // 0으로 하면 나누기 에러 가능성, 최소는 1로 설정
        int end = max;
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            long count = 0;
            for (int a : snack) {
                count += a / mid;
            }

            if (count >= M) {
                answer = mid;   // 더 긴 길이도 시도 가능
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
