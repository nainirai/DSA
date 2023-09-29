    public int myAtoi(String s) {

        if(s==null || s.length()==0){
            return 0; }
        s=s.trim();
        int ans=0;
        int sign =1;
        int i=0;
        if(i<s.length() && (s.charAt(0)=='-' || s.charAt(0)=='+')){
            sign = (s.charAt(i)=='-')?-1:1;
            i++;
        }
        int max =Integer.MAX_VALUE, min= Integer.MIN_VALUE;
        while(i<s.length()){
        if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))){
            break;}
            int digit=s.charAt(i) - '0';
        // if(sign==-1 && -1*ans<min/10){
        //     return min;}
        // if(sign==1 && +1*ans>=max/10){
        //     return max;} 
            if((ans>max/10) || (ans == max/10 && digit > 7)){
                return (sign==1)? max: min;
            }
             ans = ans*10 + digit ;      
         i++;
        }
        return (int)ans*sign;
    }
