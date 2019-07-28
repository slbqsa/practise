/**
 * 纸牌游戏
 */
package Algorithm;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class ZhiPai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] figure = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            figure[i] = sc.nextInt();
        }

        sort(figure);
        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0)
                sum += figure[n - i - 1];
            else
                sum -= figure[n - i - 1];
        }
        System.out.println(sum);

    }
}
