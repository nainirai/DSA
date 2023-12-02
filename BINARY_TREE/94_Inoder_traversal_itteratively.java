public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                   break;
                }
                node = st.pop();
                ans.add(node.val);
                node= node.right;
            }
        }
        return ans;
    }
