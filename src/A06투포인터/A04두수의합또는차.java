package A06투포인터;

import java.io.*;
import java.util.*;

public class A04두수의합또는차 {
    public static void main(String[] args) throws IOException {
//        백준 : 두용액
//        백준 : 수 고르기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }

        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        int[] result = new int[2];
        while(start<= end){
            int total = arr[start]+arr[end];
            int temp = Math.abs(total);

            if (temp<min){
                min = temp;
                result[0]=arr[start];
                result[1]=arr[end];
            }
            if (total==0) {
                result[0]=arr[start];
                result[1]=arr[end];
            } else if (total<0) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
