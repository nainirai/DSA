class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        backTrack(resultList, new ArrayList<>(), k, n,1);
        return resultList;
    }
    public static void backTrack(List<List<Integer>> resultList,List<Integer> tempList,int k, int n, int start){
       
        if(tempList.size() == k && n==0 ){
            // !resultList.contains(tempList)
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start;i<10;i++){
            tempList.add(i);
            backTrack(resultList,tempList,k,n-i,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
   
}
