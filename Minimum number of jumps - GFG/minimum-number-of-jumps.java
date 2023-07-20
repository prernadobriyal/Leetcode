//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends




class Solution{
    static int minJumps(int[] arr){
        // your code here
        int N = arr.length;
        int index = 0;
        int minJump = 0;
        int farthestJump =0;
        int currentJumpEnd = 0;
        
        
        while(index < N - 1)
        {
            if(index + arr[index] > farthestJump )
            {
                farthestJump = index + arr[index];
            }
                
            if(index == currentJumpEnd)
            {
                currentJumpEnd = farthestJump;
                minJump++;
            }
            index++;
        }
        
        if (currentJumpEnd >= N - 1) {
            return minJump;
        } else {
            return -1;
        }
    }
}