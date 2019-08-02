/**
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

package DiSanzhou;

import java.util.Arrays;
import java.util.Scanner;

public class Third_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i =0;i<n;i++){
            h[i]= sc.nextInt();
        }
        Arrays.sort(h);
        int m = sc.nextInt();
        int[] w = new int[m];
        for(int j = 0;j<m;j++){
            w[j] = sc.nextInt();
        }
        Arrays.sort(w);
        sc.close();
        int result = need(needh,needw);
        System.out.println(result);
    }
    public static int need(int []needh,int[]needw){
        int point1 = 0;
        int point2 = 0;
        int count = 0;
        while(point1<needw.length && point2 <needh.length){
            if(needw[point1]<needh[point2]){
                point1++;
            }else {
                count++;
                point2++;
                point1++:
            }
        }
        return count;
    }

}
**/
package DiSanzhou;
import java.util.Arrays;
import java.util.Scanner;
public class Third_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int childrenNumber = sc.nextInt(); //小朋友数量
        int[] needQuality = new int[childrenNumber]; //需要的巧克力的质量
        for(int i=0;i<childrenNumber;i++) {
            needQuality[i] = sc.nextInt();
        }
        Arrays.sort(needQuality);            //小朋友的需要质量排序
        int chocolatesNumber = sc.nextInt();
        int[] chocolatesQuality = new int[chocolatesNumber];
        for(int i=0;i<chocolatesNumber;i++) {
            chocolatesQuality[i] = sc.nextInt();
        }
        Arrays.sort(chocolatesQuality);        //拥有的巧克力质量排序
        sc.close();
        int result = need(needQuality, chocolatesQuality);
        System.out.println(result);
    }
    /**
     * @param needQuality 小朋友需要的质量
     * @param chocolatesQuality 巧克力的质量
     * @return 最多能上台的小朋友数量
     * 贪心算法
     */
    public static int need(int[] needQuality , int[] chocolatesQuality) {
        int pointer1 = 0 ; //遍历chocolatesQuality指针
        int pointer2 = 0 ; //遍历needQuality指针
        int count = 0 ;       //计数
        while(pointer1<chocolatesQuality.length&&pointer2<needQuality.length) {
            if(chocolatesQuality[pointer1]<needQuality[pointer2]) {
                pointer1++;
            }else{
                count++;
                pointer2++;
                pointer1++;
            }
        }
        return count;
    }
}