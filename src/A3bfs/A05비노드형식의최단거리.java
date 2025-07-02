package A3bfs;

import java.util.*;
import java.io.*;

public class A05비노드형식의최단거리 {
//        백준 : 숨바꼭질
//    만약 dfs로 실행할 경우 무한루프가 되거나 경우의 수가 너무 많이 나올 수도 있다.
//    그래서 bfs로 풀어야하는데 매지점에서 가야될 곳들을 queue에 담아준다. 중복을 제거해주고 결과를 출력한다.

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int count = 0;
        while(N==K){
            int temp = N;
            if (N<K){
                N*=2;
            }else {
                N=N-1;
            }
            count++;
        }
        System.out.println(count);
    }
}
