// public int pivotIndex(int[] nums) {
    //    int n=nums.length;
    //    int leftsum=0, rightsum=0;
    //    for(int num: nums){
    //        rightsum+=num;
    //    }
    //    for(int i=0;i<n;i++){
    //        rightsum-=nums[i];
    //        if(leftsum==rightsum){
    //            return i;
    //        }
    //        leftsum+=nums[i];
    //    }
    //    return -1;
    // }

     public int pivotIndex(int[] nums) {
         int n=nums.length;
         if(n==0){
             return -1;
         }
         int leftsum[]=new int[n];
         int rightsum[]=new int[n];
         leftsum[0]=nums[0];
         rightsum[n-1]=nums[n-1];

         for(int i=1;i<n;i++){
             leftsum[i]=nums[i]+leftsum[i-1];
            //  rightsum[n-i-1]=nums[n-i-1]+rightsum[n-i];     no need to use backward forloop
         }
         for(int i=n-2;i>=0;i--){
             rightsum[i]=nums[i]+rightsum[i+1];
         }
         for(int i=0;i<n;i++){
             if(leftsum[i]==rightsum[i]){ 
                 return i;       
             }
         }
         return -1;
     }
