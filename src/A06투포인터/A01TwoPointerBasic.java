package A06투포인터;

import java.nio.file.Paths;
import java.util.*;

public class A01TwoPointerBasic {
    public static void main(String[] args) {
//        아래 배열에서 target이 될 수 있는 두 수의 조합을 모두 찾아내어라
//        [1,9],[9,1]은 같은 것으로 취급
//        아래의 코드는 복잡도 N^2
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;
        List<int[]> myList = new ArrayList<>();
//        for (int i=0; i<nums.length; i++){
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    myList.add(new int[]{nums[i],nums[j]});
//                }
//            }
//        }
//        for (int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
//        위 배열을 정렬 시 : 1,2,3,4,5,6,7,8,9
//        start와 end를 더해서 target값이 같으면 정답에 추가하고 end--, 작으면 start++
//        end가 0부터 출발하는 경우, end가 length-1부터 시작하는 경우
        int start = 0;
        int end = nums.length-1;
        Arrays.sort(nums); ///복잡도 n*log(n)
//        정렬이 필요한 경우 - 예) 두수의 합
//        정렬이 필요하지 않은 경우 - 예) 구간의 합
        while(start < end){ /// <= 또는  < 인 경우 2가지 존재
            int total = nums[start]+nums[end];
            if (total == target) {
                myList.add(new int[]{nums[start],nums[end]});
                start++; /// 또는 end--;
            } else if (total < target) {
                start++;
            } else if (total > target){
                end--;
            }
        }
        for (int[] a : myList){
            System.out.println(Arrays.toString(a));
        }
    }
}
