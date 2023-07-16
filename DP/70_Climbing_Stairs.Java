 public int climbStairs(int n) {
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        // return countWays(n, ways);
        // return recursion(n);
        return tabulation(n);

    }
    // MEMOIZATION      O(N)

    // public int countWays(int n, int[] ways){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }
    //     if(ways[n]!=-1){
    //         return ways[n];
    //     }
    //     ways[n]=countWays(n-1,ways)+ countWays(n-2,ways);
    //     return ways[n]; 
    // }

    // RECURSION  O(2^N)

    public int recursion(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return recursion(n-1)+recursion(n-2);
    }

    // TABULATION   O(N)

    public int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }


