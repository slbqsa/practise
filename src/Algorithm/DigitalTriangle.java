/**
 * 数字三角形问题
 */
package Algorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class DigitalTriangle {
    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        try {
            sc = new Scanner(new FileInputStream("/home/fengyuanyuan/input.txt"));
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int[][] num = new int[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++)
                        num[i][j] = sc.nextInt();
                }


                for (int i = n - 2; i >= 0; i--) {
                    for (int j = 0; j <= i; j++) {
                        num[i][j] = num[i][j] + Math.max(num[i + 1][j], num[i + 1][j + 1]);
                    }
                }


                PrintStream ps = new PrintStream("/home/fengyuanyuan/output.txt");
                System.setOut(ps);//把创建的打印输出流赋给系统。
                System.out.println(num[0][0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
