package Algorithm;

import java.util.Scanner;

public class NaturalMerger {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 7, 1, 5, 6, 2};
        int b[] = new int[a.length];
        int k = fennei(a, b);
        for (int i = 0; i <= k; i++)
            System.out.print(b[i] + "  ");
        System.out.println();
        int temp[] = new int[a.length];
        for (int i = 0; i < k; i++) {
            int low = 0;
            int middle = b[i];
            int high = b[i + 1];
            guibing(a, temp, low, middle, high);
        }
        for (int i1 = 0; i1 < a.length; i1++)
            System.out.print(a[i1] + "  ");
        System.out.println();
    }

    public void merge() {
    }

    public static int fennei(int a[], int b[]) {
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int j = i + 1;
            if (a[i] > a[j]) {
                b[k] = i;
                k++;
            }
        }
        b[k] = a.length - 1;
        return k;
    }

    public static void guibing(int a[], int temp[], int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (a[i] < a[j])
                temp[k++] = a[i++];
            else temp[k++] = a[j++];
        }
        while (i <= middle) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (int i1 = 0; i1 < k; i1++) {
            a[i1 + left] = temp[i1];
        }
    }

}
