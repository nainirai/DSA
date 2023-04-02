public int search(int[] nums, int target) {
        // using Binary search with time complexity of O(log n) and a space complexity of O(1).
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]>=nums[l]){
                  if(target>=nums[l] && target<nums[mid]){
                      r=mid-1;
                  }
                  else{
                      l=mid+1;
                  }
            }
            else{
                if(target>nums[mid] && target<=nums[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }

            }
        }
        return -1;
    }
