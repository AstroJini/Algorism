package A07이분탐색;

import java.io.*;
import java.util.*;

public class A02백준입국심사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);  // 심사관 수
        int M = Integer.parseInt(input[1]);  // 사람 수

        int[] Time = new int[N];
        for (int i = 0; i < N; i++) {
            Time[i] = Integer.parseInt(br.readLine()); ///값을 담아둘 int배열 생성
        }

        long left = 1; ///시간의 최소값 1로 지정
        long right = 0;

        for (int t : Time) {
            right = Math.max(right, t); ///모든 시간의 합을 최대치로 지정하여 right에 저장
        }
        right *= M; ///M명당 걸리는 최대 시간 설정

        long answer = right; ///정답을 우선 최대값으로 설정

        while (left <= right) { /// 이분 탐색 시작
            long mid = (left + right) / 2;
            long total = 0;

            for (int i = 0; i < N; i++) {
                total += mid / Time[i];
                if (total >= M) break;
            }

            if (total >= M) {
                answer = mid; ///정답 값 초기화
                right = mid - 1; ///최대 범위 줄이기
            } else {
                left = mid + 1; /// 최소 범위 늘리기
            }
        }

        System.out.println(answer);
    }
}
