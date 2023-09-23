# User function Template for python3
class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        # Your code here
        total_sum = sum(A)
        curr_sum = 0
        half_sum = total_sum // 2
        
        for i in range(N):
            
            if curr_sum == (total_sum - A[i]) // 2:
                return i+1
            
            curr_sum += A[i]
        
        return -1


#{ 
 # Driver Code Starts
# Initial Template for Python 3

import math


def main():

    T = int(input())

    while(T > 0):

        N = int(input())

        A = [int(x) for x in input().strip().split()]
        ob=Solution()

        print(ob.equilibriumPoint(A, N))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends