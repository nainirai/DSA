//  Using Moore's Voting Algorithm
    public int majorityElement(int[] nums){
        int count =0;
        int maxele=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                maxele=nums[i];
            }
            if(maxele==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return maxele;
    }
}
