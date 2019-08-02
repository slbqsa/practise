package Other;

import java.util.Scanner;

public class Nqueen1{

    public static long process(long[] arr) {
        long neg1 = 0;
        long neg2 = 0;
        long pos1 = 0;
        long pos2 = 0;
        long pos3 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (arr[i] < neg1) {
                    neg2 = neg1;
                    neg1 = arr[i];
                } else if (arr[i] < neg2) {
                    neg2 = arr[i];
                }
            } else {
                if (arr[i] > pos3) {
                    pos1 = pos2;
                    pos2 = pos3;
                    pos3 = arr[i];
                } else if (arr[i] > pos2) {
                    pos1 = pos2;
                    pos2 = arr[i];
                } else if (arr[i] > pos1) {
                    pos1 = arr[i];
                }
            }
        }

        long res1 = neg1 * neg2 * pos3;
        long res2 = pos1 * pos2 * pos3;
        return res1 > res2 ? res1 : res2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(process(arr));
    }
}