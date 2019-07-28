package Algorithm;
import java.util.Scanner;
    public class Five_2 {
            public static void main(String[] args) {
                //预处理数据 可以不保存到内存.
                Scanner sc = new Scanner(System.in);
                int count = sc.nextInt();
                int[][] arrs = new int[count][];
                for (int i = 0; i < arrs.length; i++){
                    int arrLength = sc.nextInt();
                    arrs[i] = new int[arrLength];
                    for(int j = 0; j < arrLength; j++){
                        arrs[i][j] = sc.nextInt();
                    }
                }
                sc.close();
                for (int[] arr : arrs){
                    int counter = 0;
                    for(int i = 0; i < arr.length; i++){
                        counter += (((arr[i] & 1) == 1) ? 1 : ((arr[i] & 3) == 0) ? -1 : 0);//是否为奇数如果为奇数+1， 如果能被4整除 -1 ， 否则 +0
                    }
                    System.out.println(counter <= 0 ? "Yes" : "No");//如果为4的倍数的数大于或等于包含奇数的数量
                }
            }
        }

