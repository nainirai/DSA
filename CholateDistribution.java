public static int ChocalateDisti(int nums[], int m) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        // sort array
        Arrays.sort(nums);
        int min_diff = 0;
        // if no of students are more than no of chocolates
        if (nums.length < m) {
            return -1;
        } else if (nums.length == m) {
            return (nums[nums.length - 1] - nums[0]);
        } else {
            for (int i = 0; i + m - 1 < n; i++) {
                min_diff += nums[i + m - 1] - nums[i];
                min = Math.min(min, min_diff);
            }
        }
        return min;
    }
