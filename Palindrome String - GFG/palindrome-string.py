#User function Template for python3
class Solution:
	def isPalindrome(self, S):
		# code here
		l,n=0,len(S)-1
		while l<=n:
		    if S[l]!=S[n]:
		        return 0
		    l+=1
		    n-=1
	    return 1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.isPalindrome(S)
		print(answer)

# } Driver Code Ends