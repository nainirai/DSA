class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(resultList,new ArrayList<>(),nums,0);
        return resultList;

    }

    public static void backTrack( List<List<Integer>> resultList, List<Integer> tempset, int[] nums, int start){
        // resultList.add(new ArrayList<>(tempset));
        // for(int i =start; i<nums.length;i++){
        //     //include the element 
        //     tempset.add(nums[i]);
        //     // backtrack 
        //     backTrack(resultList,tempset,nums,i+1);
        //     // remove the element
        //     tempset.remove(tempset.size()-1);
        // }
        
        if (start == nums.length) {
            // Add the current subset to the result
            resultList.add(new ArrayList<>(tempset));
            return;
        }

        // Include the current element
        tempset.add(nums[start]);
        backTrack(resultList, tempset, nums, start + 1);

        // Exclude the current element
        tempset.remove(tempset.size() - 1);
        backTrack(resultList, tempset, nums, start + 1);
    }
}
