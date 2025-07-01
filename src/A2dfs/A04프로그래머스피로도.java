package A2dfs;

import java.util.*;

public class A04프로그래머스피로도 {

    static int[][] dungeons = {{80,20}, {50,40},{30,10}};
    static boolean[] visited;
    static int maxCount=0;

    public static void main(String[] args) {
//        유저의 최대 던전 탐험 수 return
        int k = 80;
        visited=new boolean[dungeons.length]; ///방문 여부를 나타내는 배열
        dfs(k, 0); ///재귀함수 시작
//        딱히 이중리스트에 담을 이유도 없고 이미 설정 된 테스트케이스를 통해서 백트래킹을 하면서 값을 카운트 하기 위해 depth라는 변수도 따로 지정해둔 것
        System.out.println(maxCount);
    }

    static void dfs(int start, int depth){
        maxCount=Math.max(maxCount,depth);
        for (int i = 0; i < dungeons.length; i++) {
            int required = dungeons[i][0];
            int consume = dungeons[i][1];

            if (!visited[i] && start >= required){
                visited[i]=true;
                dfs(start-consume, depth+1);
                visited[i]=false; ///다시 방문 할 수도 있기에 이런식으로 백트래킹을 함
            }
        }
    }
}
