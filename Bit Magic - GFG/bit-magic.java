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
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.bitMagic(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
        public static int bitMagic(int n, int[] arr) {
        int resultado = 0;
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                resultado++;
            }
        }
        if(resultado %2 == 0 ) return resultado/2;
        else return resultado/2 + 1;
    }
}
            