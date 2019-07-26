package Algorithm;

import java.util.Scanner;

public class CensoredNumber {

    public static int Delete(int a, int k) {
        StringBuffer Str = new StringBuffer(a + "");//把a转化为字符串
        int i, j;

        for (i = 0; i < k; i++) {  //若各位数字递增，则删除最后一个数否则就删除减区间的第一个数
            for (j = 0; j < Str.length() - 1 && Str.charAt(j) <= Str.charAt(j + 1); j++) {
            }
            Str.delete(j, j + 1);

        }
        return Str.length() == 0 ? 0 : Integer.parseInt(Str.toString());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a <= 0 || b <= 0)
            System.exit(0);
        System.out.println(Delete(a, b));
    }
}