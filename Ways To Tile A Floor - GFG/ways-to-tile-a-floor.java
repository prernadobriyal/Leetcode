//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(N));
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long numberOfWays(int n) {
        
        long MOD = 1000000007;
        
        if(n == 1) return (long)n;
        long dp[] = new long [n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%MOD;
        }
        return dp[n];
    }
};