class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;                 //row length
        int n = grid[0].length;              //column length
        int visit[][]= new int[m][n];        //create new 2D Array 
        Queue<int[]> q = new LinkedList<>(); //create QUEUE 
        int countFreshOrange = 0;
        for(int i = 0;i<m;i++){     
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){  //add rotten orange position in queue 
                    q.offer(new int[] {i,j});
                    visit[i][j]=2;
                }
                if(grid[i][j]==1){  //increase the count of  countFreshOrange 
                    countFreshOrange++;
                    visit[i][j]=1;
                }
            }
        }
        if(countFreshOrange==0){    //if no fresh orange then return 0
            return 0;
        }
        if(q.isEmpty()){            //if no rotten orange then return -1
            return -1;
        }
        int min = -1;
        int[][] dirs = {{1, 0},{-1, 0},{0, -1},{0, 1}};
        while(!q.isEmpty()){
            int size = q.size();     //size: no of rotten oranges 
            for(int k =0;k<size;k++){
                // while(size-- >0){
                int posi[] = q.remove();
                int x = posi[0];
                int y = posi[1];
                for(int[] dir:dirs){
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if(i>=0 && i<m && j>=0 && j<n && visit[i][j]==1){
                        visit[i][j]=2;
                        countFreshOrange--;
                        q.offer(new int[]{i,j});
                    }
                }
            }
            min++;
        }
        if (countFreshOrange == 0){
             return min;
        }     
        return -1;
    }
}
