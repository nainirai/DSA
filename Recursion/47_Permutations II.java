 public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        backTrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }
    public static void backTrack(List<List<Integer>> resultList, ArrayList tempList, int[] nums, boolean[] used){

        // If we match the length, it is a permutation
        if(tempList.size()==nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<> (tempList));
            return;
        }

        // iterate over each element
        for(int i=0;i<nums.length; i++){
            // skip if we get same element
            if(used[i]){
                continue;
            }

        // add the element
        used[i]=true;
        tempList.add(nums[i]);

        // back to other elemnt 
        backTrack(resultList, tempList, nums, used);

        // remove the element
        used[i]=false;
        tempList.remove(tempList.size()-1);
        }
    }
