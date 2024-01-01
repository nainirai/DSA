class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] visit = new int[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(visit[i]==0){
                dfs(isConnected, visit, i);
                count++;
            }
        }
        return count;
    }
    public static void dfs(int [][] isConnected, int[] visit, int i){
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && visit[j]==0){
                visit[j]=1;
                dfs(isConnected, visit, j);
            }
        }
    }
}
