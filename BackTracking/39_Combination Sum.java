class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
     List<List<Integer>> resultList = new ArrayList<>();
    //  Arrays.sort(cantidates);
     backTrack(resultList,new ArrayList<>() , candidates, target, 0);
     return resultList;
        
    }
    public static void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] candidates, 
         int remain, int start)
    {   
         if (remain < 0) {
            return;
         }
        else if(remain==0){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<candidates.length;i++){
            tempList.add(candidates[i]);
            backTrack(resultList, tempList, candidates, remain-candidates[i],i);
            tempList.remove(tempList.size()-1);
         }

     }
}
