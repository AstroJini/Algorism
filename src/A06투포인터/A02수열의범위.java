package A06투포인터;

public class A02수열의범위 {
    public static void main(String[] args) {
//        프로그래머스 : 숫자의 표현
        int n = 15;
        int start = 1;
        int end = 1;
        int total = 1;
        int count = 0;
        while (start <= end && end <=n){
            if (total == n){
                count++;
                end++; ///또는 start++;
                total+=end;
            }else if (total<n){
                end++;
                total+=end;
            } else {
                total -=start;
                start++;
            }
        }
        System.out.println(count);

//        구간의 합
//        num[start]부터 num[end]까지의 합을 나타내야함


    }
//    static int dfs(int start, int end, int target, int[] nums){
//        int total;
//        int count=0;
//        if (total == target){
//            count++;
//        }
//
//        for (int i = start; i < end; i++) {
//            total += nums[i];
//        }
//
//        if (total!=target){
//            if (total<target){
//                end++;
//                dfs(start, end, target, nums);
//            } else if (total>target) {
//                start++;
//                dfs(start, end, target, nums);
//            }
//        }
//        return count;
//
//    }
}
