 public int threeSumClosest(int[] nums, int target) {

        // O(NLOGN)+O(N^2)
        Arrays.sort(nums);
        int closeSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(Math.abs(target-sum)<Math.abs(target-closeSum)){
                    closeSum=sum;
                }

                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closeSum;
        
    }
