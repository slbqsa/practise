/**
 * 全排列问题
 */
package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class FullPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要排列数组的长度：");
        int length = sc.nextInt();
        char[] arr = new char[length];
        System.out.println("请输入要排列字符串：");
        String str = sc.next();
        for (int j = 0; j < length; j++) {
            arr = str.toCharArray();
        }
        sc.close();
        FullPermutation(arr, 0);
        int count = 1;


        //输出全排列的个数
        for (int t = 1; t <= length; t++) {
            count = count * t;
        }
        System.out.println("全排列个数：" + count);
    }


    private static void FullPermutation(char[] arr, int floor) {
        if (floor == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
        }

        for (int i = floor; i < arr.length; i++) {

            char temp = arr[floor];
            arr[floor] = arr[i];
            arr[i] = temp;

            FullPermutation(arr, floor + 1);

            temp = arr[floor];
            arr[floor] = arr[i];
            arr[i] = temp;
        }
    }
}
