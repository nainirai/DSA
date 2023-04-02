public class MaximumSubarraySum {

    public static int maxSubArray(int nums[]) {

        // using Prefix Array
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        // creating prefix array
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        // calculate maximum subarray sum
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // maxsum = Math.max(maxsum, currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        return maxsum;

    }

    public static void main(String args[]) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int ans = maxSubArray(nums);
        // MaximumSubarraySum mss = new MaximumSubarraySum();
        // int maxSum = mss.maxSubArray(nums);
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);

    }

}
