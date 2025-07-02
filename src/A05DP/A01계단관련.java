package A05DP;

import java.util.*;
import java.io.*;


//보통 뒤에서 룰을 정하고 앞에서부터 실행하는 식으로 코딩을 하는 게 정답에 가까울 것이다 | 요령이 따로 없다.
//1. 연역적으로 접근하여 룰을 찾는다 - 때에 따라 연역적인 접근이 맞는게 있다.
//2. 귀납적으로 접근하여 룰을 찾는다 - 불규칙하고 규칙을 정하기 힘들 경우에는 한계가 있다.

public class A01계단관련 {
    public static void main(String[] args) throws IOException {
//        프로그래머스 : 멀리뛰기
//        (n-1)+(n-2) = n이다

//        백준 : 계단오르기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n];
        /// n-1까지의 최대값 + n번째 값인 경우와 n-2까지의 최대값+ n번째 값 + n-1번째 값
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            stairs[i]=input;
        }
        int total=0;
        for (int i = stairs.length-1; i >=0; i--) {

        }




    }
}


//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int [] arr = new int[n+1];
//        int [] maxArr = new int[arr.length];
//        maxArr[0] = arr[0];
//        for(int i=1; i<arr.length; i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        if(n==1){
//            maxArr[1] = arr[1];
//        } else if(n==2){
//            maxArr[1] = arr[1];
//            maxArr[2] = arr[1] + arr[2];
//        } else {
//            maxArr[1] = arr[1];
//            maxArr[2] = arr[1] + arr[2];
//            for(int i=3; i<maxArr.length; i++){
//                int a = maxArr[i-2] + arr[i];
//                int b = maxArr[i-3] + arr[i-1] + arr[i];
//                maxArr[i] = Math.max(a,b);
//            }
//        }
//        System.out.println(maxArr[n]);
//    }
//
//}
