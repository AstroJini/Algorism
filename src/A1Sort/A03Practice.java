package A1Sort;

import java.util.Arrays;

public class A03Practice {
//    public static void main(String[] args) {
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//
//        for (int i = arr.length/2-1; i >=0; i--) {
//            heapify(arr, i, arr.length);
//        }
//
//        for (int i = arr.length-1; i >=0 ; i--) {
//            int temp = arr[0];
//            arr[0]=arr[i];
//            arr[i] = temp;
//            heapify(arr, 0, i);
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//
//    static void heapify(int[] arr, int parent, int length){
//        int left = parent*2+1;
//        int right = parent*2+2;
//        int smallest = parent;
//
//        if (left<arr.length && arr[smallest]>arr[left]){
//            smallest=left;
//        }
//        if (right<arr.length && arr[smallest]>arr[right]){
//            smallest=right;
//        }
//
//        if (smallest!=parent){
//            int temp = arr[parent];
//            arr[parent]=arr[smallest];
//            arr[smallest]=temp;
//            heapify(arr, smallest, length);
//        }
//    }


//
//    public static void main(String[] args) {
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
////        최초 힙 구성
//        for (int i = arr.length/2-1; i >=0 ; i++) {
//            heapify(arr, i, arr.length);
//        }
//
////        루트 노드와 최하위 노드를 자리변경해가면서 재heapify
//        for (int i = arr.length-1; i >=0 ; i--) {
//            int temp = arr[0];
//            arr[0]=arr[i];
//            arr[i]=temp;
//            heapify(arr, 0, i);
//        }
////        출력
//        System.out.println(Arrays.toString(arr));
//    }
////    heapify 재귀함수 정의
//    static void heapify(int[] arr, int parent, int length){
//        int left = parent*2+1;
//        int right = parent&2+2;
//        int smallest = parent;
//
//        if (left<arr.length && arr[smallest]>arr[left]){
//            smallest = left;
//        }
//        if (right<arr.length && arr[smallest]>arr[right]){
//            smallest = right;
//        }
//
//        if (smallest!=parent){ /// 제일 작은 값이 루트노드 값이 아니라면
//            int temp = arr[parent];///smallest값을 parent값으로 바꿔주는 자리 교체가 일어난다.
//            arr[parent]=arr[smallest];
//            arr[smallest]=temp;
//            heapify(arr, smallest, length); ///함수를 재호출함으로써 다른 값들에 대한 heapify를 진행한다.
//        }
//    }



    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//        최초의 힙 구성
        for (int i = arr.length/2-1; i >=0 ; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr
        ));
    }
    static void heapify(int[] arr, int parent, int length){
        int left = parent*2+1;
        int right = parent*2+2;
        int smallest = parent;

        if (left<arr.length && arr[smallest]>arr[left]){
            smallest = left;
        }
        if (right<arr.length && arr[smallest]>arr[right]){
            smallest = right;
        }
        if(smallest!=parent){
            int temp = arr[parent];
            arr[parent]=arr[smallest];
            arr[smallest]=temp;
            heapify(arr, smallest, length);
        }
    }
}
