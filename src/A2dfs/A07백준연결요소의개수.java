package A2dfs;

import java.util.*;
import java.io.*;

public class A07백준연결요소의개수 {
    static List<List<Integer>> adjList;
    static List<List<Integer>> result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] nodes = new int[M][];
        for(int i=0; i<M; i++){
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            nodes[i]=new int[]{x,y};
        }

        adjList = new ArrayList<>();
        result = new ArrayList<>();
        visited = new boolean[N]; ///정점의 개수만큼

        for(int i=0; i<N; i++){ /// 정점의 개수만큼 List 생성
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0] - 1).add(nodes[i][1] - 1);
            adjList.get(nodes[i][1] - 1).add(nodes[i][0] - 1);
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    static void dfs(int start){
        visited[start]=true;
        for (int a : adjList.get(start)){
            if (!visited[a]){
                dfs(a);
            }
        }
    }
}
