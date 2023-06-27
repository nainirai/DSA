public int[] runningSum(int[] nums) {
        int runtime[]=new int[nums.length];

        runtime[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            runtime[i]=runtime[i-1]+nums[i];
        }
        return runtime;
    }
