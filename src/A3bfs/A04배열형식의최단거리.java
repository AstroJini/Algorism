package A3bfs;

import java.io.*;
import java.util.*;

public class A04배열형식의최단거리 {
//    public static void main(String[] args) {
//        프로그래머스 : 게임맵
//        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//        int n =maps.length; ///좌표 위치를 나타낼 x값
//        int m =maps[0].length; ///좌표 위치를 나타낼 y값
//
//        int[] dx={-1,1,0,0}; ///상하좌우
//        int[] dy={0,0,-1,1};
//        Queue<int[]> queue = new LinkedList<>(); ///위치값을 저장해둘 queue 선언
//        queue.add(new int[]{0,0}); ///시작지점은 0,0으로 고정
//        boolean[][] visited = new boolean[n][m]; ///방문여부를 지정하는 값
//        visited[0][0] = true; ///시작점은 방문 한 것으로 처리
//
//        while (!queue.isEmpty()){
//            int[] current = queue.poll(); ///현재 위치를 가져옴
//            int x = current[0]; /// 현재 위치를 x,y로 지정
//            int y = current[1];
//
//            if (x== n-1 && y == m-1){
//                System.out.println(maps[x][y]);
//                break;
//            }
//            for (int i = 0; i < 4; i++) { /// 상하좌우로 움직이는 상황의 반복문
//                int nx = x+dx[i]; ///이동한 위치의 좌표값을 나타냄
//                int ny = y+dy[i];
//
//                if (nx>=0 && nx<5 && ny>=0 && ny<5){ /// 좌표가 index범위를 벗어나지 않도록 지정
//                    if (maps[nx][ny]==1){ /// 위치값이 0이면 이동할 수 없기 때문에 위치값이 1일경우에만 이동하고 queue에 저장하는 조건문
//                        maps[nx][ny] = maps[x][y]+1;
//                        queue.add(new int[]{nx,ny});
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0});

    }


}
