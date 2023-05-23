class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
                maxprofit += prices[i]-buy;
                buy=prices[i];
            }
            else{
                buy=prices[i];
            }
            // maxProf=maxProf+profit;
            
        }
        return maxprofit;
        
    }
}
