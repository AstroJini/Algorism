package A2dfs;

import java.util.*;

public class A01Dfs방문순서 {
    static List<List<Integer>>adjList; ///원본 자료가 들어있는 리스트
    static boolean[] visited; /// 방문여부를 나누는 불린배열
    public static void main(String[] args) {
//        방문할 수 있는 점이 여러개인 경우, 정점번호가 작은 것을 먼저 방문
//        출발은 0부터 dfs로 방문 시 방문 순서: 0->1->3->2->4
        int[][] nodes = {{0,2},{0,1},{1,3},{2,3},{2,4}};
//        인접리스트를 활용해서 인접해있는 노드를 빠르게 접근
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for (int i = 0; i < 6; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
//            단방향
            adjList.get(nodes[i][0]).add(nodes[i][1]);
//            양방향인 경우
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }
//        정점번호가 작은 것부터 방문하기 위한 정렬
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(0); ///dfs함수를 써야 하는 이유 매번 본인들이 가야할 방향이 다르고 출발점이 달라야 하기 때문이다.
    }

    static void dfs(int start){
        System.out.println(start);
        visited[start]=true;
//        인접리스트를 순회할 때는 보통 향상된 for문 사용.
        for (int a : adjList.get(start)){
            if (!visited[a]){
                dfs(a);
            }
        }
    }
}
