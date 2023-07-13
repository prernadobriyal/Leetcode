//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int n, int K, int[] A) {
        // code here
        int maxleft[]=new int[n],minright[]=new int[n];
        maxleft[0]=A[0];
        minright[n-1]=A[n-1];
        for(int i=1;i<n;i++)
            maxleft[i]=Math.max(maxleft[i-1],A[i]);
        
        for(int i=n-2;i>=0;i--)
            minright[i]=Math.min(minright[i+1],A[i]);
        
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(maxleft[i]+minright[i+1]>=K)
                ans++;
        }
        return ans;
    }
}  
