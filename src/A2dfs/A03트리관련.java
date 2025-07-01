package A2dfs;

import java.io.*;
import java.util.*;

public class A03트리관련 {
////    백준 : 트리의부모찾기
//    static List<List<Integer>> adjList;
//    static boolean[] visited;
//    static int[] parent;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine()); ///테스트 케이스 읽어들임
//        adjList = new ArrayList<>(); /// 인접리스트 선언
//        visited = new boolean[N+1]; /// node의 사용여부를 확인하는 boolean[] 이고 node번호가 1번부터 N개가 있기에 N+1로 선언
//        parent = new int[N+1]; /// 부모노드를 결과물로 출력하기 위한 int[] 마찬가지로 node번호가 1~N개 존재하기에 N+1로 선언
//        for (int i = 0; i < N+1; i++) {
//            adjList.add(new ArrayList<>()); /// N 개의 리스트를 이중리스트 안에 담아주기
//        }
//        for (int i = 0; i < N-1; i++) {
//            String[] temp = br.readLine().split(" ");
//            adjList.get(Integer.parseInt(temp[0])).add(Integer.parseInt(temp[1])); ///입력 받은 값을 바로 인접리스트의 값에 담아줌으로써 메모리효율 향상
//            adjList.get(Integer.parseInt(temp[1])).add(Integer.parseInt(temp[0])); /// 양방향 입력
//        }
//        dfs(1); ///dfs재귀함수 실행 부모노드는 1번부터 시작하기때문에 시작값은 1번
//        for (int i = 2; i <= N; i++) {
//            System.out.println(parent[i]); ///부모노드의 값을 한줄씩 출력
//        }
//    }
//    static void dfs(int start){
//        visited[start]=true;
//        for (int a : adjList.get(start)){
//            if (!visited[a]){
//                parent[a]=start; ///a값에 대한 부모노드를 parent배열에 담아둠
//                dfs(a);
//            }
//        }
//    }


// practice

    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        adjList=new ArrayList<>();
        visited=new boolean[n+1];
        parent=new int[n+1];

        for(int i=0; i< n+1; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<n-1; i++){
            String[] input = br.readLine().split(" ");
            adjList.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            adjList.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
        }
        dfs(1);
        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }
    }
    static void dfs(int start){
        visited[start]=true;
        for (int a : adjList.get(start)){
            if (!visited[a]){
                parent[a]=start;
                dfs(a);
            }
        }
    }

}
