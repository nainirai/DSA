class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultList = new ArrayList<>();
         List<Integer> tempList = new ArrayList<>();
        backTrack(1, tempList, k, n,resultList);
        return resultList;
    }

    public static void backTrack(int start, List<Integer> tempList, int k, int n, List<List<Integer>> resultList){

        if(tempList.size()==k){
            resultList.add(new ArrayList<>(tempList));
        }
        // if(start>n){
        //      return;
        // }
        // tempList.add(start);
        // backTrack(start+1,tempList,k,n, resultList);
        // tempList.remove(tempList.size()-1);
        // backTrack(start+1,tempList,k,n, resultList);

           for (int i = start; i <= n; i++) {
            tempList.add(i); // Add the current number to tempList
            backTrack(i + 1,tempList, k, n, resultList); // Recursively explore combinations
            tempList.remove(tempList.size() - 1); // Backtrack by removing the last element
        }
    }
   
    
}
