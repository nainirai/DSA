 public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p.val == q.val){
            if(isIdentical(p, q)){
                return true;
            }            
        }
        boolean Lhs = isSameTree(p.left, q);
        boolean Rhs = isSameTree(p.right, q);
        return Lhs || Rhs;
    }
    public static boolean isIdentical(TreeNode p, TreeNode q){
        if(p == null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        if(!isIdentical(p.left, q.left)){
            return false;
        }
        if(!isIdentical(p.right, q.right)){
            return false;
        }
        return true;
    }
}


EASY WAY 

 class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
   
        if(p == null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        if(p.val == q.val){
            
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
   return true;
  }
}
