/**
 * 贪吃的小Q
 */
package Algorithm;

import java.util.Scanner;

public class LittleQ {
    public static int Sum(int a, int b) {
        int num = 0;
        int i;
        for (i = 0; i < b; i++) {
            num += a;
            a = (int) Math.ceil(a / 2);
        }
        return num;
    }

    public static int max_(int max, int b) {
        int fommer = 1;
        int c = 0;
        int late = max;
        int temp = (fommer + late) / 2;
        if (b == max) {
            return 1;
        }
        while (late >= fommer) {
            c = Sum(temp, b);
            if (max > c) {
                fommer = temp + 1;
            } else if (max == c) {
                return temp;
            } else {
                late = temp - 1;
            }
            temp = (fommer + late) / 2;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(max_(m, n));
    }

}
