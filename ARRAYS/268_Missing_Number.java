 public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,sumT=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length+1;i++){
            sumT+=i;
        }
        int ans=sumT-sum;
        return ans;  
    }
