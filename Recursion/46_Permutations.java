   public List<List<Integer>> permute(int[] nums) {

        // T.C: O(n!)n as array of length n has total of n! combinations and to calculate those combinations we have to traverse an array 'n' times.
        // S.C is O(n)

        List<List<Integer>> resultList = new ArrayList<>();
        backTrack(resultList,new ArrayList<>() , nums);
        return resultList;
    }

    public static void backTrack( List<List<Integer>> resultList, ArrayList tempList, int [] nums){
     // If we match the length, it is a permutation
        if(tempList.size()==nums.length){
            resultList.add(new ArrayList<> (tempList));
            return;
        }

    for(int number: nums)
     // Skip if we get same element
    {
      if(tempList.contains(number)){
          continue;
      }      
    // add new element 
    tempList.add(number);

    // go back to track other element 
    backTrack(resultList, tempList, nums);

    // remove the element 
    tempList.remove(tempList.size()-1);
    }
    }
