//package A2dfs;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.*;
//
//public class A01Dfs모든경우의수 {
//    static List<List<Integer>>adjList;
//    static List<List<Integer>>result;
//    static List<Integer>path;
//    public static void main(String[] args) {
////        1~10까지의 노드가 존재
//        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};
//        adjList = new ArrayList<>();
//        result = new ArrayList<>(); /// 결과물로 출력하기 위해 담아둘 리스트
//        path = new ArrayList<>(); ///각 노드들이 지나간 길들을 임시저장하는 리스트
//        for (int i = 0; i <= 10; i++) {
//            adjList.add(new ArrayList<>());
//        }
//        for (int i = 0; i < nodes.length; i++) {
////            여기서는 1번이 루트노드라고 정해졌기 때문에 visited제외하고 단방향노드로 설계
//            adjList.get(nodes[i][0]).add(nodes[i][1]); ///단방향
//        }
//        for (int i = 0; i < adjList.size(); i++) {
//            adjList.get(i).sort(Comparator.naturalOrder()); ///오름차순 정렬
//        }
//        dfs(1); ///재귀함수는 1부터 시작
//
//        for (List<Integer> r : result){
//            System.out.print(r); /// 값 출력
//        }
//    }
//
////    백트래킹해서 갔다가 돌아올 때 마지막에 담겨있던거 지우는 백트래킹 해야함
////    담아서 한꺼번에 담아야 함
//    static void dfs(int start){
//        path.add(start); ///path에 노드 임시저장
//        if (adjList.get(start).isEmpty()){ /// 한바퀴를 다 돌면 결과 값 리스트에 해당 경로 저장
//            result.add(new ArrayList<>(path));
//        } else { /// 다 돌기전까지 재귀함수 반복
//            for (int a : adjList.get(start)){
//                dfs(a);
//            }
//        }
//        path.remove(path.size()-1); ///백트래킹 마지막에 추가된 값 지우고 다른 값저장
//
//    }
//}

package A2dfs;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class A01Dfs모든경우의수 {
    static List<List<Integer>>adjList;
    static List<List<Integer>>result;
    static List<Integer>path;
    public static void main(String[] args) {
//        1~10까지의 노드가 존재
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};
        adjList = new ArrayList<>();
        result = new ArrayList<>(); /// 결과물로 출력하기 위해 담아둘 리스트
        path = new ArrayList<>(); ///각 노드들이 지나간 길들을 임시저장하는 리스트
        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
//            여기서는 1번이 루트노드라고 정해졌기 때문에 visited제외하고 단방향노드로 설계
            adjList.get(nodes[i][0]).add(nodes[i][1]); ///단방향
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder()); ///오름차순 정렬
        }
        dfs(1, new ArrayList<>()); ///재귀함수는 1부터 시작
        System.out.println(result);


        for (List<Integer> r : result){
            System.out.print(r); /// 값 출력
        }
    }

    //    백트래킹해서 갔다가 돌아올 때 마지막에 담겨있던거 지우는 백트래킹 해야함
//    담아서 한꺼번에 담아야 함
    static void dfs(int start,List<Integer>temp){
        temp.add(start);
        if (adjList.get(start).isEmpty()){
            result.add(temp);
        }
        for (int a : adjList.get(start)) {
            dfs(a,temp);
            temp.remove(temp.size()-1);
        }
    }
//    백준 : dfsbfs(1260) -> dfs, bfs로 가능
//    백준 : 연결요소의 개수(11724) -> dfs bfs로 가능
}

