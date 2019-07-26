package Algorithm;

import java.util.*;

public class AscentSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要排列数组的长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("请输入要排列的数字：");
        findLongest(arr, length);


    }

    private static int findLongest(int[] A, int n) {
        int[] B = new int[n + 1];
        B[1] = A[0];
        int len = 1, start = 0, end = len, mid;
        for (int i = 1; i < n; i++) {
            if (A[i] > B[len]) {
                len++;
                B[len] = A[i];
            } else {
                start = 1;
                end = len;
                while (start <= end) {
                    mid = (start + end) / 2;
                    if (B[mid] < A[i]) start = mid + 1;
                    else end = mid - 1;
                }
                B[start] = A[i];
            }
        }
        return len;
    }
}
