public static int MergeforPalindrome(int arr[]) {
        int n = arr.length;
        int count = 0;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else if (arr[l] < arr[r]) {
                arr[l] += arr[l + 1];
                l++;
                count++;
            } else {
                arr[r] += arr[r - 1];
                r--;
                count++;
            }
        }
        return count;

    }
