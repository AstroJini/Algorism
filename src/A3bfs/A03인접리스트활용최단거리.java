package A3bfs;

import java.util.*;
import java.io.*;
import java.util.jar.Attributes;

public class A03인접리스트활용최단거리 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
//        백준 : 촌수 계산 - 풀어볼 것!!
//        프로그래머스 : 가장 먼 노드
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n=6;
        adjList = new ArrayList<>();
        for (int i = 0; i <= n+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }
        Queue<Integer>myQue = new LinkedList<>();
        myQue.add(1);
        int[] distance = new int[n+1];
//        방문과 거리를 둘다 체크 | 방문하지 않은 값은 -1로 구분
        Arrays.fill(distance,-1);
        distance[1] = 0;
        while (!myQue.isEmpty()){
            int temp = myQue.poll();
            for (int a : adjList.get(temp)){
                if (distance[a]==-1){
                    myQue.add(a);
                    distance[a] = distance[temp]+1;
                }
            }
        }
        int max = Arrays.stream(distance).max().getAsInt();
        int count = (int) Arrays.stream(distance).filter(a->a==max).count();
        System.out.println(count);
    }
}
