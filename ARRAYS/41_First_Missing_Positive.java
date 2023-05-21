class Solution {
    public int firstMissingPositive(int[] nums) {
         if (nums == null || nums.length == 0) {
            return 1;
        }
         int n=nums.length;
        int ans=n+1;
        int vis[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0 && nums[i]<=n)
                vis[nums[i]]=1;        //This is done to mark the number nums[i] as visited.
        }
        for(int i=1;i<vis.length;i++)
        {
            if(vis[i]==0)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }

    // int[] nums = {3, 1, -2, 6, 4};
    // vis = [0, 1, 0, 1, 1]
    // thats why we started 2nd for loop from i+1 as 0th index will always be 0 in visited    array .

}
