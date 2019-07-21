import java.util.Arrays;
import java.util.Scanner;
//当且仅当n=1或n>=4时有解
public class NQueen {
    int max = 4;
    int array[] = new int[max];
    int[] a = {4,1,2,3};
    public void backtrack(int n) {
        if (n == max) {
        print();
        return;
    } else {
        for (int i = n; i < max; i++)
        {
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
        int tem = a[i]; a[i] = a[j]; a[j] = tem;
    }
    int k = 0;
    public void print() {
        ++k;
        System.out.print("第" + k + "种解法:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } System.out.println();
    }

        public static void main(String[] args) {
          new NQueen().backtrack(0);
            Scanner x=new Scanner(System.in);
            while(x.hasNext()){
                int a =x.nextInt();
                int[] number=new int[a];
                for(int i=0;i<a;i++){
                    number[i]=x.nextInt();
                }
                System.out.println(Arrays.toString(number));
            }

        }
    }
