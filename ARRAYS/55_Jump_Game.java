  public boolean canJump(int[] nums) {
        int farthest=0;
        int current=0;

        if(nums.length==1){
            return true;
        }

        for(int i=0;i<=farthest;i++){
            farthest=Math.max(farthest, nums[i]+i);
           
            if(farthest>=nums.length-1){
                return true;
            }
           
        }
        return false;   
    }
