package A3bfs;

import java.util.*;
import java.io.*;

public class A03백준촌수계산 {

    static List<List<Integer>>adjList;
    static boolean[] visited;
    static boolean found = false;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int m = Integer.parseInt(br.readLine());

        int[][] nodes = new int[m][];
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            nodes[i]=new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1])};
        }

        adjList=new ArrayList<>();
        visited=new boolean[n];

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]-1).add(nodes[i][1]-1);
            adjList.get(nodes[i][1]-1).add(nodes[i][0]-1);
        }

        dfs(x, y, 0);
        if (!found) System.out.println(-1);
    }
    static void dfs(int start, int target, int depth){
        if (start==target){
            System.out.println(depth);
            found=true;
            return;
        }

        visited[start-1]=true;
        for (int a : adjList.get(start-1)){
            if (!visited[a]){
                dfs(a+1, target, depth+1);
            }
        }
    }
}
