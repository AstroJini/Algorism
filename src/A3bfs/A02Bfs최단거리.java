package A3bfs;

import java.util.*;


public class A02Bfs최단거리 {
    static List<List<Integer>>adjList;
    static boolean[] visited;
    public static void main(String[] args) {
//        방문할 수 있는 점이 여러개인 경우, 정점번호가 작은 것을 먼저 방문
//        출발은 0부터 dfs로 방문 시 방문 순서: 0->1->2->3->4
        int[][] nodes = {{0,2},{0,1},{1,3},{2,3},{2,4}};
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for (int i = 0; i < 6; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
//        Queue안에 Integer가 아니라 int[]을 담아서 0번째는 노드번호, 1번째는 distance 설계 가능.
        Queue<Integer> myQue = new LinkedList<>(); ///queue에 담을 때부터 방문처리를 해야만한다.
        myQue.add(0);
        visited[0]=true;
        int[] distance =new int[5];
        int target = 4;
        distance[0]=0;
        while(!myQue.isEmpty()){
            int temp = myQue.poll();
            for (int a : adjList.get(temp)){
                if (!visited[a]){
                    myQue.add(a);
                    visited[a]=true; ///Queue에 담는 시점에 true세팅해야 중복돼서 queue에 안담김
                    distance[a]=distance[temp]+1;
                    if (target==a){
                        break; ///이게 없으면 시간초과 되는 경우도 있음
                    }
                }
            }
        }
        System.out.println(distance[target]);


    }
}
