package A06투포인터;

import java.io.*;
import java.util.*;

public class A04수고르기 {
    public static void main(String[] args) throws IOException{
//        값이 최소가 될 때까지 반복
//        두 수의 차가 변수 M이상이면서 최소값
//        1. 정렬 | 2.<= | 3. end를 어디에서 시작할 것인가? start와 end모두 0에서 시작해서 트래킹하면 풀이 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        while (end < N) {
            int diff = arr[end] - arr[start];

            if (diff < M) {
                end++;
            } else {
                answer = Math.min(answer, diff);
                start++;
                // start가 end보다 커지면 end를 다시 맞춰줌
                if (start > end) {
                    end = start;
                }
            }
        }

        System.out.println(answer);
    }
}
