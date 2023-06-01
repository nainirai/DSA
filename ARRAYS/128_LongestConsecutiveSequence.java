class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> ans=new HashMap<>();
        for(int val:nums){
            ans.put(val,true);
        } 
        for(int val:nums){
            if(ans.containsKey(val-1)){
                ans.put(val,false);
            }
        }
        int msp=0;     //to store the starting value of longest consecutive sequence
        int m1=0;      //to store length of longest consecutive sequence

        for(int val:nums){
            if(ans.get(val)==true){
                int Tl=1;          //to store length, which keeps changing as it get consecutive sequence 
                int tsp=val ;       //to store the starting value of longest consecutive sequence

                while(ans.containsKey(tsp + Tl)){
                    Tl++;
                }
                if(Tl>m1){
                    msp=tsp;
                    m1=Tl;
                }
            }
                   
         }
         return m1;
        
    }
}
