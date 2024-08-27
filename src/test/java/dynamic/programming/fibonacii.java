package dynamic.programming;
import java.util.*;
class fibonacii{
    static int funcUsingMemoization(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!= -1) return dp[n];
        return dp[n]= funcUsingMemoization(n-1,dp) + funcUsingMemoization(n-2,dp);
    }


    public static void main(String args[]) {

        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(funcUsingMemoization(n,dp));
        System.out.println(funcUsingTabulization(n,dp));
        System.out.println(funcUsingTabulizationWithOptimizedCode(5));

    }

    static int funcUsingTabulization(int n, int[] arr){
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    static int funcUsingTabulizationWithOptimizedCode(int n){
        int prev2=0;
        int prev1=1;
        if(n<=1) return n;
        for(int i=2;i<=n;i++){
            int cur=prev2+prev1;
            prev2=prev1;
            prev1=cur;

        }
        return prev1;
    }
}

//0,1,1,2,3,5,8