#User function Template for python3

class Solution:
    def roundToNearest (self, N) : 
        #Complete the function
        N=int(N)
        if N%10>5:
            N//=10
            N+=1
            N*=10
        else:
            N//=10
            N*=10
        return N



#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    
    s = input()
    ob = Solution()
    res = ob.roundToNearest(s)
    print(res)


# } Driver Code Ends