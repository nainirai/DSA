public class KadanesAlgo {

    public static int maxSubArraySum(int nums[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;

    }

    public static void main(String args[]) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // // int ans = maxSubArray(nums);
        // // MaximumSubarraySum mss = new MaximumSubarraySum();
        // // int maxSum = mss.maxSubArray(nums);
        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum subarray sum: " + maxSum);

    }
}
