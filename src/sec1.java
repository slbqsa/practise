import java.util.Scanner;
public class sec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        Max(arr,n);
    }

    static void Max(long [] num,int len) {
        long max1 =0,max2=0,max3=0,min1=0,min2=0;
        for(int i=0;i<len;i++){
                if(num[i]>max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = num[i];
                }else if(num[i]>max2){
                    max3 = max2;
                    max2 = num[i];
                }else if(num[i]>max3){
                    max3 = num[i];
                }else if (num[i]<min1){
                    min2 = min1;
                    min1 = num[i];
                }else if(num[i]<min2&&num[i]>min1){
                    min2 = num[i];
                }

        }
long max = Math.max(max1*max2*max3,max1*min1*min2);
        System.out.println(max);
    }
}
