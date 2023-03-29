 public static boolean PairInSortedArray(int nums[], int x) {
       
        int n = nums.length;
        int i;
         // find the largest number
        for (i = 0; i < nums.length - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                // int pivot = i;
                break;
            }
        }
        // l is index of smallest element
        int l = (i + 1) % n;

        // r is index of largest element
        int r = i;

        while (l != r) {
            if (nums[l] + nums[r] == x) {
                return true;
            }
            if (nums[l] + nums[r] > x) {
                r = (n + r - 1) % n;
            } else {
                l = (l + 1) % n;
            }
        }
        return false;
    }
