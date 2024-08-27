package random;

import java.util.Scanner;

public class class1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        System.out.println(method(2,1,3,1));
    }

    public static int method(int n, int m, int k, int x){
         final int mod = 1000000007;
        int[][] dp = new int[n+1][x+1];
        dp[0][0]=1;

        for(int i=1; i<=n; i++) {
            int[] prefixSum = new int[x + 2];
            int total = 0;

            for (int j = 1; j <= x + 1; j++) {
                prefixSum[j] = (prefixSum[j - 1] + dp[i - 1][j - 1]) % mod;
                total = (total + dp[i-1][j-1]) % mod;
            }


            for (int j = 1; j <= x; j++) {
                dp[i][j] = (prefixSum[j + 1] - prefixSum[Math.max(0, j - k)]) % mod;
            }

            for(int j=x+1; j<=x+1; j++){
                dp[i][j]= (total-prefixSum[Math.max(0, j-k)]) % mod;
            }
        }

        int result=0;
        for(int j=1; j<=x+1; j++){
            result=(result+dp[n][j-1]+ mod) % mod;
        }

        return result;

    }
}
