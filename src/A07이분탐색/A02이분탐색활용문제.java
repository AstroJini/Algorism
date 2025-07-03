package A07이분탐색;

import java.io.*;
import java.util.*;

public class A02이분탐색활용문제 {
    public static void main(String[] args) throws IOException{
//        백준 : 과자나눠주기
//        백준 & 프로그래머스 : 입국심사
//        백준 : 예산
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] input = br.readLine().split(" ");
//        int M = Integer.parseInt(br.readLine());
//
//        int[] city = new int[N];
//        for (int i = 0; i < N; i++) {
//            city[i]= Integer.parseInt(input[i]);
//        }
//        Arrays.sort(city);
//
//        int start = 0;
//        int end = city[N-1];
//        int answer=-1;
//        while (start <= end){
//            int mid = (start + end)/2;
//            int total = 0;
//
//            for (int i = 0; i < N; i++) {
//                total +=Math.min(city[i],mid);
/////                 mid값과 i번째 값중 최소 값으로 읽어들여서 값을 더한다.
/////                 만약 상한선이 i번째 값보다 크면 원래 요구만큼만 주도록하고 상한선이 작은 경우에 상한선 만큼만 주도록 한다.
//            }
//
//            if (total<=M){  /// 상한선 까지의 값들이 최대 예산보다 작거나 같을때는
//                answer = mid; ///정답에 상한선 값을 추가하고
//                start = mid + 1; ///상한점을 변경한다 | 상한선이 최대예산보다 적게 있어야하기 때문에 answer값을 저장해둔다.
//            } else {
//                end = mid-1;
//            }
//        }
//        System.out.println(answer);

//        int[] arr = new int[city[N-1]];
//        for (int i = city[N-1]; i >0; i--) {
//            arr[i-1]=i;
//        }

//        int start = 0;
//        int end = arr.length-1;
//        int answer = -1;
//        while (start<=end){
//            int mid = (start+end)/2;
//            if (arr[mid]*N==M){
//                answer=arr[mid];
//                break;
//            } else if (arr[mid]*N<M){
//                start = mid + 1;
//                answer=mid;
//            } else {
//                end = mid-1;
//            }
//        }
//        System.out.println(answer);



//
//        int[] target = {1,2,3,...,150};
//        while (start<=end){
//            if (target[mid]==485){
//
//            }else if (){
//                answer값 지정
//            }
//        }

//        강사님풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());

        int[] city = new int[N];
        for (int i = 0; i < N; i++) {
            city[i]= Integer.parseInt(input[i]);
        }




    }
}
