class Solution {
   
    public int numEnclaves(int[][] grid) {
         int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
         Queue<int[]> q = new LinkedList<>();
         int m = grid.length;
         int n = grid[0].length;
         int[][] visit = new int[m][n];
         
         for(int i = 0;i<m;i++){
             visit[i]=grid[i].clone();
         }
         for(int i = 0;i<m;i++){
             for(int j = 0;j<n;j++){
                 if((i==0 || i==m-1 ||j==0 || j==n-1)&& (visit[i][j]==1)){
                     q.offer(new int[]{i,j});
                     visit[i][j]=0;  //mqarking as visited by setting its value as 0
                 }
             }
         }
         while(!q.isEmpty()){
             int[] qr = q.remove();
             int x = qr[0];
             int y = qr[1];
             for(int[] dir:dirs){
             int i = x+dir[0];
             int j = y+dir[1];
             if(i>=0 && j>=0 && i<m && j<n && visit[i][j]==1){
                 q.offer(new int[]{i,j});
                 visit[i][j]=0;
                }
             }
         }
         int count =0;
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 if(visit[i][j]==1){
                     count++;
                 }
             }
         }
         return count;
    }
}
