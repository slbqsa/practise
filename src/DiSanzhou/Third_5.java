package DiSanzhou;
import java.util.Scanner;
public class Third_5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int offset=sc.nextInt();
            int n=sc.nextInt();
            int len1=sc.nextInt();
            int len2=sc.nextInt();
            int[] res=getResult(offset,n,len1,len2);
            for(int i=0;i<res.length;i++){
                if(i==res.length-1){
                    System.out.println(res[i]);
                }else{
                    System.out.print(res[i]+" ");
                }
            }

        }
    }
    private static int[] getResult(int offset, int n, int len1, int len2) {
        int[] res=new int[4];
        //start1
        res[0]=len1-offset>0?offset:len1;
        //end1
        res[1]=len1-offset-n>0?offset+n:len1;
        //start2
        int k=offset-len1;
        res[2]=k>0?len2-k>0?k:len2:0;
        //end2
        int x=offset+n-len1;
        res[3]=x>0?len2-x>0?x:len2:0;
        return res;
    }
}
