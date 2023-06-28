class Solution {
    public int removeDuplicates(int[] nums) {
 
     int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
         //  the task is to return the length of the modified array, 
        // i + 1 is returned. Adding 1 accounts for the fact that i is a zero-based index, 
        // and the length is one more than the index of the last element.
    }
}
