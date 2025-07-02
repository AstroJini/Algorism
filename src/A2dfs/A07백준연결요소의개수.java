package A2dfs;

import java.util.*;
import java.io.*;

public class A07백준연결요소의개수 {
    static List<List<Integer>> adjList;
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
        visited = new boolean[N]; ///정점의 개수만큼 방문여부 불린타입 개수 지정.

        for(int i=0; i<N; i++){ /// 정점의 개수만큼 List 생성
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {/// -1붙이는 이유 배열이 0-based이기 때문
            adjList.get(nodes[i][0] - 1).add(nodes[i][1] - 1);
            adjList.get(nodes[i][1] - 1).add(nodes[i][0] - 1);
        }
        for (int i = 0; i < adjList.size(); i++) { /// 정렬
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        int count = 0; ///연결된 요소의 개수를 변수로 지정
        for (int i = 0; i < N; i++) { ///n번 돌면서 방문여부를 확인하고 방문 하지 않은 노드면 dfs함수 호출 카운트값 ++
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    static void dfs(int start){
        visited[start]=true; ///방문처리
        for (int a : adjList.get(start)){
            if (!visited[a]){
                dfs(a);
            }
        }
    }
}
