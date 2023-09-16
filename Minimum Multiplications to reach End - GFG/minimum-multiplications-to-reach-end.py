from typing import List
from collections import deque
class Solution:
    def minimumMultiplications(self, arr : List[int], start : int, end : int) -> int:
        # code here
        # Dijkstras algo
        q = deque([])
        
        visited = set([start])
        q.append([start,0]) # start,min no of multipl
        if start == end: return 0
        while(q):
            node,n_oper = q.popleft()
            for ele in arr:
                new_start = (node*ele)%(100000)
                # print(new_start,end)
                if new_start == end: return n_oper+1
                    
                # print(new_start)
                if new_start not in visited:
                    visited.add(new_start)
                    q.append([new_start,n_oper+1])
        return -1 # Unable to reach end


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    for _ in range(int(input())):
        n = int(input())
        arr = [int(x) for x in input().strip().split()]
        start, end = list(map(int,input().split()))
        obj=Solution()
        print(obj.minimumMultiplications(arr, start, end))
# } Driver Code Ends