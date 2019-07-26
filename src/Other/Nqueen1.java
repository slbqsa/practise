package Other;

import Algorithm.NQueen;

public class Nqueen1 {

    int max = 8;
    int array[] = new int[max];
    int[] a = {8, 2, 3, 4, 5, 6, 7, 1};

    public void backtrack(int n) {
        if (n == max) {
            print();
            return;
        } else {
            for (int i = n; i < max; i++) {
                array[n] = a[i];
                swap(a, n, i);
                if (nice(n)) {
                    backtrack(n + 1);
                }
                swap(a, n, i);
            }
        }

    }

    public boolean nice(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    public void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    int k = 0;

    public void print() {
        ++k;
        System.out.print("第" + k + "种解法:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        new NQueen().backtrack(0);
    }
}