class Solution {
    class Newfloodfill{
        int x;
        int y;
        public Newfloodfill(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int initial = image[sr][sc];
        if(initial==color){
            return image;
        }
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        Queue<Newfloodfill> q = new LinkedList<>();
        q.offer(new Newfloodfill(sr,sc));
        
        while(!q.isEmpty()){
            Newfloodfill newcolor = q.remove();
            image[newcolor.x][newcolor.y]=color;
            for(int[] dir: dirs){
                int i = newcolor.x + dir[0];
                int j = newcolor.y + dir[1];
                if(i>=0 && i<m && j>=0 && j<n && image[i][j]==initial){
                    q.offer(new Newfloodfill(i,j));
                }
            }
        }
        return image;
    }
}
