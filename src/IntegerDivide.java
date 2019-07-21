import java.util.*;

public class IntegerDivide {
    int n;
    int count = 0;



    void divide(int n) {
        if (n == 1) {
            count ++;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    divide(n / i);
                }
            }
        }
    }


    public IntegerDivide(int n) {
        this.n = n;
        this.divide(n);
    }

    /*void divide(int n) {
        if (n == 1) {
            count++;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    divide(n / i);
                }
            }
        }
    }
*/
public static void main(String[] args) {
        System.out.println("请输入一个正整数num：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        IntegerDivide figure = new IntegerDivide(num);
        System.out.println(figure.count);

    }
}