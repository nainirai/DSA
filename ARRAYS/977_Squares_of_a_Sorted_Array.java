public int[] sortedSquares(int[] nums) {

        // O(nlogn)
        // int arr[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=nums[i]*nums[i];          
        // }
        // Arrays.sort(arr);
        // return arr;

        // O(n)
        int left =0;
        int right=nums.length-1;
        int result[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i]=nums[left]*nums[left];
                left++;
            }
            else{
                result[i]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
