#User function Template for python3

class Solution:
    def removeConsonants(self, s):
        #complete the function heree
        z=''
        for i in s:
            if i in'aeiouAEIOU':
                z+=i
        if z=='':
            return 'No Vowel'
        return z


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        ob = Solution()
        print(ob.removeConsonants(s))
# } Driver Code Ends