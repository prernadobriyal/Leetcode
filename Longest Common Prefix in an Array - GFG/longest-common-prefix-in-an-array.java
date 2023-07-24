//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        String res = "";
        int k = 0, min = 1002;
        for(int i=0; i<n; i++){
            min = Math.min(min, arr[i].length());
        }
        int flag = 0;
        while(k<min){
            HashSet<String> mp = new HashSet<>();
            for(int i=0; i<n; i++){
                mp.add(arr[i].substring(0, k+1));
            }
            if(k == 0 && mp.size() != 1)
                return "-1";
            if(mp.size() != 1){
                flag = 1;
                res = arr[0].substring(0, k);
                break;
            }
            k++;
        }
        if(flag == 0)
            return arr[0].substring(0, k);
        return res;
    }
}