#User function Template for python3
class Solution:
    def fill(self, n, m, mat):
        vis=[[0 for i in range(m)]for j in range(n)]
        queue=[]
        for i in range(m):
            if mat[0][i]=="O":
                mat[0][i]="#"
                queue.append([0,i])
                vis[0][i]=1
            if mat[n-1][i]=="O":
                mat[n-1][i]="#"
                queue.append([n-1,i])
                vis[n-1][i]=1
        for i in range(n):
            if mat[i][0]=="O":
                mat[i][0]="#"
                queue.append([i,0])
                vis[i][0]=1
            if mat[i][m-1]=="O":
                mat[i][m-1]="#"
                queue.append([i,m-1])
                vis[i][m-1]=1
        delrow=[-1,0,1,0]
        delcol=[0,1,0,-1]
        while queue:
            a=queue.pop(0)
            row=a[0]
            col=a[1]
            vis[row][col]=1
            mat[row][col]="#"
            for i in range(4):
                nr=delrow[i]+row
                nc=delcol[i]+col
                if nr>=0 and nr<n and nc>=0 and nc<m and vis[nr][nc]==0 and mat[nr][nc]=="O":
                    mat[nr][nc]="#"
                    vis[nr][nc]=1
                    queue.append([nr,nc])
        
        for i in range(n):
            for j in range(m):
                if mat[i][j]=="O":
                    mat[i][j]="X"
                elif mat[i][j]=="#":
                    mat[i][j]="O"
        return mat
        
        
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, m = [int(x) for x in input().split()]
        mat = []
        for i in range(n):
            s = list(map(str,input().split()))
            mat.append(s)
        
        ob = Solution()
        ans = ob.fill(n, m, mat)
        for i in range(n):
            for j in range(m):
                print(ans[i][j], end = " ")
            print()
# } Driver Code Ends