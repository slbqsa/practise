import java.util.*;

public class Main {
    public static int findLongest(int[] arr, int n) {
        int[] arrB = new int[n];
        arrB[0] = arr[0];
        int end = 0;
        for(int i=0;i<n;i++){
            //当前数比arrB最后一个数要大，添加到arrB
            if(arr[i]>arrB[end]){
                arrB[++end] = arr[i];
            }
            //找到第一个比当前数大的替换
            else{
                int pos = findInsertPos(arrB, arr[i], 0, end);
                arrB[pos] = arr[i];
            }
        }
        return end+1;
    }

    public static int findInsertPos(int[] arrB,int num,int start,int end) {
        while(start<end){
            int mid = start + (end-start)/2;
            if(arrB[mid]<num){
                start = mid + 1;
            }else if(arrB[mid]>num){
                end =  mid;
            }else{
                return mid;
            }
        }
        System.out.println(Arrays.toString(arrB));
        return start;
    }

    public static void main(String[] args) {
        int[] changes = new int[]{2,1,4,3,1,5,6};
        System.out.println(findLongest(changes, 7));


    }
}