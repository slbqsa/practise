
import java.util.Scanner;

public class ZhengChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100000+5;
        int[] figure = new int[n];
        int sum = sc.nextInt();
        for(int i=0;i<sum;i++){
            int k = i;
            for(int j = 2;j*j<=n;j++){
                int s =0;
                while (k%j==0){
                    s++;
                    k/=j;
                }
                figure[j]= (figure[j]>s?figure[j]:s);
            }
            if(k>1)
                figure[k] = (figure[k]>1?figure[k]:1);
        }
        double temp = 1;
        for(int i =1 ;i<=100000;i++){
            for(int j = 0;j<figure[i];j++){
                temp = temp*i%987654321;
            }
        }
        System.out.println(temp);
    }
}
