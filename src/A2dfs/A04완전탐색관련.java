package A2dfs;

import java.io.*;
import java.util.*;

public class A04완전탐색관련 {
//    백준 : 숫자판 점프 - 모든 경우의 수 dfs | 상하좌우 문제 -Set자료구조 사용
//    visited 처리 불필요, 중복 제거를 위해 Set자료구조를 확인 후 개수만 출력이니.size()로 값 출력
//    이차원 배열로 받아야함 int[][] arr = new int[5][5]

//    static int[][] arr = new int[5][5]; ///5X5의 숫자판이 될 이중배열
//    static int[] dx = {-1,1,0,0}; ///상하좌우의 움직임을 담은 배열
//    static int[] dy = {0,0,-1,1};
//    static Set<String> mySet = new HashSet<>(); ///결과물로써 출력할 Set자료구조 int[]로 담는 것보다 String문자열로 담는게 뒤에 값을 더하는 형식이 편리
//
//    public static void main(String[] args) throws IOException{
//        int[][] arr = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,2,1,},{1,1,1,1,1,}};
//        int[] current = {1,1};
////        위로 이동
//        int[] up = {current[0]-1, current[1]};
////        아래로 이동
//        int[] down = {current[0]+1, current[1]};
////        좌로 이동
//        int[] left = {current[0],current[1]-1};
////        우로 이동
//        int[] right = {current[0],current[1]+1};
//        int[] dx = {-1,1,0,0};
//        int[] dy = {0,0,1,-1};
//        for (int i = 0; i < 4; i++) {
//            int nx = current[0]+dx[i];
//            int ny = current[1]+dy[i];
//            System.out.println(nx+","+ny);
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < 5; i++) {
//            String[] input = br.readLine().split(" "); ///5개의 Line을 읽어들임
//            for (int j = 0; j < 5; j++) {
//                arr[i][j]=Integer.parseInt(input[j]); /// 각각의 값을 arr[i]번째에 추가함
//            }
//        } /// 숫자판 완성
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                dfs(i,j,String.valueOf(arr[i][j]),1); /// 임의의 시작점 x,y에서의 시작을 위해 다음과 같이 설정 이미 한칸을 차지했기에 depth는 1로 고정
//            }
//        }
//        System.out.println(mySet.size()); ///결과는 Set의 개수를 출력
//
//    }
//    static void dfs(int x, int y, String num, int depth){
//        if (depth==6){ /// 숫자 6개가 모이면 이 재귀함수를 종료
//            mySet.add(num);
//            return;
//        }
//        for (int i = 0; i < 4; i++) {
//            int nx = x+dx[i];
//            int ny = y+dy[i];
//
//            if (nx>=0 && ny>=0 && nx<5 && ny<5){
//                dfs(nx, ny, num + arr[nx][ny], depth+1);
//            }
//        }
//
//    }

//        <강사님의 풀이>
//public class Main {
//    static int[] dx = {1,-1,0,0};
//    static int[] dy = {0,0,-1,1};
//    static int[][] arr = new int[5][5];
//    static Set<String> staticSet = new HashSet<>();
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0; i<5; i++){
//            String[] temp = br.readLine().split(" ");
//            for (int j=0; j<5; j++){
//                arr[i][j] = Integer.parseInt(temp[j]);
//            }
//        }
//        for (int i=0; i<5; i++){
//            for (int j=0; j<5; j++){
//                dfs(String.valueOf(arr[i][j]), i, j);
//            }
//        }
//        System.out.println(staticSet.size());
//    }
//    static void dfs(String temp, int x, int y){
////        문자의길이가 6이 되었을때 set에 add
//        if(temp.length()==6){
//            staticSet.add(temp);
//            return;
//        }
////        상하좌우 검사후에 dfs()호출
//        for (int i=0; i<4; i++){
//            int nx = x +dx[i];
//            int ny = y +dy[i];
//            if(nx>=0 && nx<5 && ny>=0 && ny<5){
//                dfs(temp+arr[nx][ny], nx, ny);
//            }
//        }
//    }


////practice
//
//    static int[][] arr = new int[5][5];
//    static int[] dx ={-1,1,0,0};
//    static int[] dy ={-1,1,0,0};
//    static Set<String> numSet = new HashSet<>();
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < 5; i++) {
//            String[] line = br.readLine().split(" ");
//            for (int j = 0; j < 5; j++) {
//                arr[i]=new int[]{Integer.parseInt(line[j])};
//            }
//        } ///숫자판 완성
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                dfs(String.valueOf(arr[i][j]), i, j);
//            }
//        }
//        System.out.println(numSet.size());
//
//
//    }
//
//    static void dfs(String temp, int x, int y){
//        if (temp.length()==6){
//            numSet.add(temp);
//            return;
//        }
//        for (int i = 0; i < 4; i++) {
//            int nx = x+dx[i];
//            int ny = y+dy[i];
//
//            if (nx<5 && nx >0 && ny<5 && ny>=0){
//                dfs(temp+arr[nx][ny], nx, ny);
//            }
//        }
//    }


//    프로그래머스 : 피로도 - dfs 백트래킹




}
