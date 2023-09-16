#User function Template for python3

class Solution:
    #Function to count the number of ways in which frog can reach the top.
    def countWays(self,n):
        
        # code here
        if n <= 1:
            return 1

        MOD = 10**9 + 7
        # Initialize a list to store the number of ways to reach each step
        ways = [0] * (n + 1)
        ways[0] = 1  # There's one way to stay at step 0
        ways[1] = 1  # There's one way to reach step 1

        for i in range(2, n + 1):
            # Calculate the number of ways to reach step i by summing up
            # the ways to reach the previous 3 steps
            ways[i] = (ways[i - 1] + ways[i - 2] + ways[i - 3]) % MOD

        return ways[n] % MOD

#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys
sys.setrecursionlimit(10**6)
# Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        m = int(input())
        ob=Solution()
        print(ob.countWays(m))
# } Driver Code Ends