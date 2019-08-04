package DiSanzhou;

import java.util.Arrays;
import java.util.Scanner;

public class Third_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] w = new int [m];
        for(int j = 0;j<m;j++){
            w[j] = sc.nextInt();
        }
        Arrays.sort(w);
        Arrays.sort(h);
        int str = 0;
        int sum = 0;
       for(int i = 0;i<w.length;i++){
           if(w[i]>h[str]){
               continue;
           }else {
               sum++;
               str++;
               if(str == 0){
                   break;
               }
           }
       }
        System.out.println(sum);

    }

}
