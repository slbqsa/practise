package Algorithm;

import java.util.Scanner;

public class MsegmentSum {
    private static int[] numbers;
    private static int[][] f;
    private static int MAX = 100000;

    /*
    f[i][j] 将前i个数分成j段的最大最小值
    f[i][1] 前i个数的和

    当j>1时，假设前k个数分为j-1段，从k+1~i为第j段，则有：
    f[k][j-1] 前k个数分为j-1段的最大最小值
    f[i][1]-f[k][1] 前i个数的和减去前k个数分成一段，即为 从k+1~i的第j段
       f[i][j] = min{max{f[i][1]-f[k][1],f[k][j-1]}}
    */

    /*
    input data:
    9 3
    9 8 7 6 5 4 3 2 1
    */
    public static void main(String[] args) {
        int n, m;

        Scanner input = new Scanner(System.in);

        while (true) {
            n = input.nextInt();
            m = input.nextInt();
            //输入不合法
            if (n < m || n == 0) {
                System.out.println(0);
                return;
            }

            //输入整数数组
            numbers = new int[n + 1];
            f = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++)
                numbers[i] = input.nextInt();

            //调用solve
            solve(n, m);

            System.out.println(f[n][m]);
        }
    }


    private static void solve(int n, int m) {
        int i, j, k, temp, maxt;

        for (i = 1; i <= n; i++)
            f[i][1] = f[i - 1][1] + numbers[i];

        for (j = 2; j <= m; j++)
            for (i = j; i <= n; i++) {
                for (k = 1, temp = MAX; k < i; k++) {
                    maxt = max(f[i][1] - f[k][1], f[k][j - 1]);//比较选最大值
                    if (temp > maxt)
                        temp = maxt;
                }
                f[i][j] = temp;
            }
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
