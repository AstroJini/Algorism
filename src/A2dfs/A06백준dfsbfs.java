package A2dfs;

import java.io.*;
import java.util.*;

public class A06백준dfsbfs {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int[][] nodes = new int[M][N];
        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            nodes[i] = new int[]{x,y};
        }
        adjList= new ArrayList<>();
        visited = new boolean[N+1];


        for (int i = 0; i < N+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(V);
        System.out.println(sb.toString().trim());
        Arrays.fill(visited, false);
        sb.setLength(0); // StringBuilder 초기화
        bfs(V);
        System.out.println(sb.toString().trim());

    }
    static void dfs(int start){
        sb.append(start).append(" ");
        visited[start]=true;
        for (int a : adjList.get(start)){
            if (!visited[a]){
                dfs(a);
            }
        }
    }
    static void bfs(int start) {
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(start);
        visited[start]=true;

        while(!myQue.isEmpty()){
            int temp = myQue.poll();
            sb.append(temp).append(" ");
            for (int a : adjList.get(temp)){
                if (!visited[a]){
                    myQue.add(a);
                    visited[a]=true;
                }
            }
        }
    }
}
