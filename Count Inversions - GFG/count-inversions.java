//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long merge(long arr[],int l,int m,int h)
    {
        long[] L=Arrays.copyOfRange(arr,l,m+1);
        long[] R=Arrays.copyOfRange(arr,m+1,h+1);
        int i=0;
        int j=0;
        long c=0;
        int k=l;
        while(i<L.length && j<R.length)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
                c+=(m+1)-(i+l);
            }
        }
        while(i<L.length)
        {
            arr[k++]=L[i++];
        }
        while(j<R.length)
        {
            arr[k++]=R[j++];
        }
        return c;
        
    }
    static long mergeSort(long arr[],int l,int h)
    {
        long c=0;
        if(l<h)
        {
            int m=(l+h)/2;
            c+=mergeSort(arr,l,m);
            c+=mergeSort(arr,m+1,h);
            c+=merge(arr,l,m,h);
        }
        return c;
    }
    static long inversionCount(long arr[], long N)
    {
        return (mergeSort(arr,0,(int)(N-1)));
        // Your Code Here
    }
}