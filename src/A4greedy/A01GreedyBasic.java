package A4greedy;

import java.util.Arrays;
import java.util.Comparator;

//greedy: 현재로서 최적의 해를 선택했을 때, 전체의 최적의 해를 보장하는 알고리즘
public class A01GreedyBasic {
    public static void main(String[] args) {
//        1,5,10,20의 숫자가 있을 때, 조합하여 99를 만들 수 있는 조합 중 가장짧은 조합의 길이
        Integer[] arr = {1,5,10,20};
        int target = 99;
        int total=0;
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int a: arr) {
            int remain = target/a;
            total+=remain;
            target -=remain*a;
        }
        System.out.println(total);
    }

//    🔍 문제 설명
//    사용할 수 있는 숫자들: 1, 5, 10, 20
//
//    목표값: 99
//
//    목표: 이 숫자들을 조합해서 99를 만들되, **사용한 숫자의 개수(길이)**가 가장 짧은 경우의 개수를 구하라
//
//✅ 코드 분석
//    java
//            복사
//    편집
//    Integer[] arr = {1, 5, 10, 20};
//    int target = 99;
//    int total = 0;
//
//// 큰 수부터 먼저 사용하기 위해 내림차순 정렬
//Arrays.sort(arr, Comparator.reverseOrder());
//🔹 예: arr = [20, 10, 5, 1] 로 정렬됨
//
//🔁 반복문: 가장 큰 수부터 차례대로 채움
//            java
//    복사
//            편집
//for (int a : arr) {
//        int remain = target / a;  // 현재 숫자로 몇 개 채울 수 있는지
//        total += remain;          // 그 개수를 총 사용 개수에 더함
//        target -= remain * a;     // 사용한 만큼 target을 줄임
//    }
//📌 예제: target = 99, arr = [20, 10, 5, 1]
//    숫자	몇 개 사용?	남은 target	누적 개수
//20	99 / 20 = 4	99 - 80 = 19	4
//        10	19 / 10 = 1	19 - 10 = 9	4 + 1 = 5
//        5	9 / 5 = 1	9 - 5 = 4	5 + 1 = 6
//        1	4 / 1 = 4	4 - 4 = 0	6 + 4 = 10
//
//        ✅ 출력
//            java
//    복사
//            편집
//System.out.println(total);  // 출력: 10
//    즉, 99를 만들기 위해 가장 적은 숫자 개수 = 10개
//
//✅ 알고리즘 요약
//    그리디 전략 사용 (큰 숫자부터 최대한 채움)
//
//    시간 복잡도: O(n) (n = 동전 종류 개수)
//
//    가장 빠르고 효율적인 방법 (단, "동전 교환 문제"처럼 모든 조합 고려할 필요 없는 경우)
//
//💡 보충
//    이 방식은 다음 조건에서만 정답 보장:
//
//    단위 간 배수 관계가 있음 (예: 1, 5, 10, 20)
//
//    즉, 잔돈 문제처럼 단순화된 문제일 경우에는 그리디가 항상 최적해를 줌
//
//    복잡한 경우에는 DP나 BFS가 필요합니다.
}
