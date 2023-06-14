class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        // Create HashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        // iterate through nums to get count of elements 
        for(int i=0;i<nums.length;i++){
            // to retrieve the current count (value) of the nums[i] element from the map HashMap. 
            // If the element is already present in the HashMap, its count is returned; otherwise, it defaults to 0.
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
            // This step essentially keeps track of the count (occurrences) of each element in the input array by storing the elements as keys and their respective counts as values in the mpp HashMap.
        }
        // itterate through HashMap using for each loop
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            if(it.getValue()>n/2){
                return it.getKey();
            }
        }
        return -1;
        // getKey() is used to retrieve the key (the element from the input array) of the current entry.
        // getValue() is used to retrieve the value (the count/occurrence of the element) of the current entry.
    }
}
