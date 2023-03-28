 public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Reverse(nums,0,n-1);
        }
        else{
            int prev =idx;
            for(int i=idx+1;i<n;i++){
                if((nums[i]>nums[idx-1]) && (nums[i]<nums[prev])){
                    prev=i;
                }
            }
            // Swap pivot and element
                // int temp = nums[idx-1] ;
                // nums[idx-1]= elem ;
                // nums[i] = temp;
            int temp=nums[idx-1];
            nums[idx-1]=nums[prev];
            nums[prev]=temp;
             // S3 ==> Revrese the increasing sequence and return 
            // Reverse(nums,idx,n-1);
            Arrays.sort(nums,idx,n);
        }

    }
    public void Reverse(int [] nums , int s , int e){
    while(s<e){
        int temp = nums[e];
        nums[e]= nums[s];
        nums[s]= temp ;
        s++;
        e--;
    }
    }
