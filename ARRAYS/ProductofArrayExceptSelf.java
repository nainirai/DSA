// PREFIX SUFFIX SUM O(N) WITH SPACE O(N)

public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
         int right[]=new int[n];
         int ans[]=new int[n];

        left[0]=1;
        right[n-1]=1;

        //  left array calculation
          for(int i=1;i<n;i++){
              left[i]=left[i-1]*nums[i-1];
       }
       //   right array calculation 
         for(int i=n-2;i>=0;i--){
             right[i]=right[i+1]*nums[i+1];
       }
       // calculate values for ans 
         for(int i=0;i<n;i++){
             ans[i]=left[i]*right[i];
       }
       return ans;
    }

// BRUTE FORCE O(N^2)
    public int[] productExceptSelf(int[] nums){
        int n =nums.length;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                     prod*=nums[j];
                }  
            }
             ans[i]=prod;
        }     
        return ans;
    }

// DIVIDE PRODUCT WITH NUMBER  O(N) with space 0(1)
    public int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int ans[]=new int[n];
        int prod=1;
        int zerocount=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
              zerocount++;
            }
            else{
                  prod*=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(zerocount>=2){
                ans[i]=0;
            }
            else if(zerocount==1){
                ans[i]=(nums[i]!=0) ? 0:prod;
            }
            else{
                 ans[i]= (nums[i]!=0) ? prod / nums[i]:0;
            }
        }
        return ans;
    }
