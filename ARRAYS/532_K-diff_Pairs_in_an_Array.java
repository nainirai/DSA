 public int findPairs(int[] nums, int k) {

        // T.C: O(N)  S.C: O(N)
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(res.containsKey(nums[i])){
                res.put(nums[i],res.get(nums[i])+1);
            }
            else{
                res.put(nums[i],1);   // it means this is the **first occurrence of the number**. 
                // it adds a new key-value pair to the map, where the key is nums[i] and the value is initialized to 1.
            }
        }
        int count =0;

        // itterate through HashMap 

        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();

            // base condition
            if(k==0){
                if(val>=2){
                    count++;
                }
            }
            else if(res.containsKey(key+k)){
                count++;
            }
        }
         return count;




        // // O(NlogN)   S.C: O(1)
        // int i=0,j=1,count=0;
        // Arrays.sort(nums);

        // while(i<nums.length && j<nums.length){
        //     if((nums[j]-nums[i])==k){
        //         count++;
        //         i++;
        //         j++;
        //        while(j<nums.length && nums[j]==nums[j-1]){
        //            j++;
        //         }
        //     }
        //     else if((nums[j]-nums[i])>k){
        //         i++;
        //         if(j-i==0){
        //             j++;
        //         }
        //     }
        //     else{
        //         j++;
        //     }
        // }
        // return count;
        
    }
}
