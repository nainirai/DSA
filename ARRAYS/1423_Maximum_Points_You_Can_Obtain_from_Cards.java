 public int maxScore(int[] cardPoints, int k) {
         int left=0;
         int right=cardPoints.length-k;
         int total=0;

         for(int i=right;i<cardPoints.length;i++){
             total += cardPoints[i];
         }
         int result=total;

         while(right<cardPoints.length){
             total+=cardPoints[left]-cardPoints[right];
             result=Math.max(result,total);
             left++;
             right++;
         }
         return result;
           
    }
