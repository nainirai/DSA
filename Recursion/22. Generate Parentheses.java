 public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recursion(ans, n, 0, 0, "");
        return ans;
    }
    public static void recursion(List<String> ans, int n, int open, int close,String curr ){
        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }
        if(open<n){
            recursion(ans, n, open+1,close, curr+"(");
        }
        if(close<open){
            recursion(ans,n,open,close+1,curr+")");
        }
    }
