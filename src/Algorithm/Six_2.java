package Algorithm;

import java.util.Scanner;

public class Six_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //有几行数据
        int x = scan.nextInt();
        int maxIndex = (int) Math.pow(2, Math.ceil(Math.log(x)/Math.log(2)));
        //System.out.println(maxIndex);
        int[] dp = new int[maxIndex+1];
        dp[0] = 0;
		/*
		 * 方法一
		 *
		double temp = 0;
		for(int i = 1;i<maxIndex+1;i++) {
			temp = Math.log(i)/Math.log(2);
			if(Math.floor(temp) == temp)
				dp[i] = (int) (Math.log(i)/Math.log(2) + 1);
			else
				dp[i] = Integer.MAX_VALUE - 100;
		}

		for(int j = 0;j<maxIndex;j++)
			for(int i = 1;i<maxIndex;i++) {
				if(dp[i-1] + 1 < dp[i])
					dp[i] = dp[i-1] + 1;
				if(dp[i+1] +1 < dp[i])
					dp[i] = dp[i+1] + 1;
				if(i%2==0 && dp[i/2] +1 < dp[i])
					dp[i] = dp[i/2] + 1;
			}
		*/
        /**
         * 1、除0位置外全部初始化为最大值(-100(防止+1后变为最小数))
         * 2、计算每个位置上的最大值 = min(dp[i-1]+1,dp[i+1]-1,dp[i/2]+1(若i为偶数))
         */
        for(int i = 1;i<maxIndex+1;i++)
            dp[i] = Integer.MAX_VALUE - 100;

        for(int i = 1;i<maxIndex/2+2;i++)
            dp[i] = optimum(dp,i);
        System.out.println(dp[x]);
    }

    public static int optimum(int[] dp,int i) {
        if(i == 0) {
            dp[0] = 0; return 0;
        }
        double temp = Math.log(i)/Math.log(2);
        if(Math.floor(temp) == temp) {
            dp[i] = (int)(temp + 1);
            return  (int)(temp + 1);
        }
        else {
            //min(dp[i-1]+1,dp[i+1]-1,dp[i/2]+1(若i为偶数))
            int op = dp[i-1] + 1;
            if(op > optimum(dp,i+1) + 1)
                op = optimum(dp,i+1) + 1;
            if(i%2==0 && op > dp[i/2] + 1)
                op = dp[i/2] + 1;
            dp[i] = op;
            return op;
        }

    }
}
