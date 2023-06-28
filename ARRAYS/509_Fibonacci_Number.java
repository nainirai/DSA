 public int fib(int n) {
         if((n==0) || (n==1)){
           return n;
       }
     // fib(1)=1;
    // fib(0)=0;
    //Using Recursion
    int fib1=fib(n-1);
    int fib2=fib(n-2);
    int ans=fib1+fib2;
    return ans; 
    }
