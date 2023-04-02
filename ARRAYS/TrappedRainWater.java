public int trap(int[] height) {
        int n=height.length;
        // leftmax boundary of every given bar 
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        // rightmax boundary of every given bar 
        int rightmax[]=new int[height.length];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        // loop 
        // waterlevel=min(leftmax bar, rightmax bar)
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel =Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
