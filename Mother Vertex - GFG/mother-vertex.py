class Solution:
    
    #Function to find a Mother Vertex in the Graph.
    def findMotherVertex(self, V, adj):
        #Code here
        self.visited = [ 0 for _ in range(V)]
        self.adj = adj
        
        for i in range(V):
            if not self.visited[i]:
                self.dfs(i)
                mother_vertex = i

        self.visited = [ 0 for _ in range(V)]
        self.dfs(mother_vertex)
        for i in range(V):
            if not self.visited[i]:
                return -1
        return mother_vertex
        
    def dfs(self,i):
        self.visited[i]=1
        for neighbour in self.adj[i]:
            if not self.visited[neighbour]:
                self.dfs(neighbour)
        

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys 

sys.setrecursionlimit(10**6) 
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
		obj = Solution()
		ans = obj.findMotherVertex(V, adj)
		print(ans)
# } Driver Code Ends