public static boolean containsDuplicate(int[] nums) {

        // Using Sorting TC: O(nlogn) and SC: O(n)
        // using HashSet and HashMap, TC: O(n) and SP:O(n)

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        return false;
    }
