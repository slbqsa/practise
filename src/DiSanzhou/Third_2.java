package DiSanzhou;

import java.math.BigInteger;
import java.util.Scanner;

public class Third_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.multiply(b);
        System.out.println(c);
    }
}
