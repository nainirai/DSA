 public int maxProfit(int[] prices) {
        // lets assume we buy stocks at 1st day(i=0)
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
                profit=Math.max(prices[i]-buy,profit);
            }
            else{
                buy=prices[i];
            }
        }
        return profit;
    }
