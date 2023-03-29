public int maxArea(int[] height) {
        // 2 POINTER APPROACH with TC:O(n) and SC:O(n)
        int maxwater=0;
        int lp=0;
        int rp=height.length-1;
        
        while(lp<rp){
            // calculate water area
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);

            // update pointers
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
         
    }
