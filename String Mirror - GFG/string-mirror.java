//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        // code here
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for(int i =1;i<str.length();i++){
            if(str.charAt(i-1)>str.charAt(i) || (i>1 && str.charAt(i)==str.charAt(i-1))){
                ans.append(str.charAt(i));
            }else{
                break;
            }
        }
        String smallest = ans.toString();
        return smallest + ans.reverse().toString();
    }
}