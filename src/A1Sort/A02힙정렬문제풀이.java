package A1Sort;

public class A02힙정렬문제풀이 {
    public static void main(String[] args) {

////    명예의 전당 : 프로그래머스
//        class Solution {
//            public int[] solution(int k, int[] score) {
//                int[] answer = new int[score.length];
//                PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙
//
//                for (int i = 0; i < score.length; i++) {
//                    pq.offer(score[i]);
//
//                    // k명을 초과하면 가장 낮은 점수 제거
//                    if (pq.size() > k) {
//                        pq.poll();
//                    }
//
//                    // 현재 명예의 전당 중 최하위 점수 저장
//                    answer[i] = pq.peek();
//                }
//
//                return answer;
//            }
//        }
//-------------------------------------------------------------------------------
////    야근지수 : 프로그래머스
//        class Solution {
//            public long solution(int n, int[] works) {
//                // 최대 힙 선언 (내림차순) - 일이 많은 것부터 처리해야하기 때문에 큰 수부터 넣어줘야함
//                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//
//                // 초기 작업량 모두 넣기
//                for (int work : works) {
//                    maxHeap.offer(work);
//                }
//
//                // N시간 동안 가장 큰 작업량부터 처리
//                while (n > 0 && !maxHeap.isEmpty()) { ///n시간이 0보다 클 동안 && 작업량이 비어있지 않을 때까지
//                    int max = maxHeap.poll(); ///가장 큰 작업량 선언
//                    if (max > 0) { ///작업량이 0보다 작은데 -1 하면 음수가 되기 때문에 이 경우를 제외하고 연산
//                        maxHeap.offer(max - 1);
//                    }
//                    n--;
//                }
//
//                // 야근 피로도 계산: 남은 작업량들의 제곱 합
//                long answer = 0;
//                while (!maxHeap.isEmpty()) {
//                    int work = maxHeap.poll();
//                    answer += (long) work * work;
//                }
//
//                return answer;
//            }
//        }


    }
}
