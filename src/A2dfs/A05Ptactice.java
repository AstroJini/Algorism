package A2dfs;

import java.io.*;
import java.util.*;

public class A05Ptactice {
//    모든 경우의 수
//    static List<List<Integer>> adjList;
//    static List<List<Integer>> result;
//    static List<Integer>path;
//    public static void main(String[] args) {
//        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {4, 9}, {5, 10}};
//
//        adjList = new ArrayList<>();
//        result = new ArrayList<>();
//        path = new ArrayList<>();
//
//        for (int i = 0; i < 11; i++) {
//            adjList.add(new ArrayList<>());
//        }
//        for (int i = 0; i < nodes.length; i++) {
//            adjList.get(nodes[i][0]).add(nodes[i][1]);
//        }
//        for (int i = 0; i < adjList.size(); i++) {
//            adjList.get(i).sort(Comparator.naturalOrder());
//        }
//
//        dfs(1, new ArrayList<>());
//        System.out.println(result);
//
//        for (List<Integer> r : result){
//            System.out.println(r);
//        }
//    }
//
//    static void dfs(int start, List<Integer> temp){
//        temp.add(start); ///시작 값 리스트에 저장
//        if (adjList.get(start).isEmpty()){ /// 마지막 노드에 도달하면 temp값을 result에 리스트로 저장
//            result.add(new ArrayList<>(temp));
//        }
//        for (int a : adjList.get(start)){
//            dfs(a,temp); ///재귀함수 호출
//            temp.remove(temp.size()-1); ///백트래킹
//        }
//    }

//    방문순서
    static List<List<Integer>>adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] nodes = {{0, 2}, {0, 1}, {1, 3}, {2, 3}, {2, 4}};

        adjList = new ArrayList<>();
        visited = new boolean[nodes.length];

        for (int i = 0; i < nodes.length+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(0);
    }
    static void dfs(int start){
        System.out.println(start);
        visited[start]=true;
        for (int a : adjList.get(start)){
            if (!visited[a]){
                dfs(a);
            }
        }
    }
}
