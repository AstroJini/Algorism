package A06투포인터;

import java.util.Arrays;

public class A03연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5};
        int k = 7;
        int start = 0;
        int end = 0;
        int sum = sequence[0]; ///n번째 값을 sum에 더함

        int minLength = Integer.MAX_VALUE;
        int[] result = new int[2];



        while(start<sequence.length && end < sequence.length){
            if (sum==k){ ///sum값이 k값과 같으면
                if (end - start < minLength){ /// minLength 값을 정해주어 가장 짧은 인덱스를 추출하는 조건문
                    minLength = end - start; ///minLength값 초기화
                    result[0]=start; ///해당 인덱스 값 결과물에 추가
                    result[1]=end;
                }
                sum-= sequence[start]; ///시작부분 값을 빼주고 다음 start지점으로 옮기기
                start++;
            } else if (sum < k) {
                end++; ///sum값이 작으면 구간을 늘려줌
                if (end < sequence.length){
                    sum+=sequence[end];
                }
            }else {
                sum-=sequence[start];
                start++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
