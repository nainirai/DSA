class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val < key){
           root.right= deleteNode(root.right,key);
        }
        else if(root.val > key){
           root.left= deleteNode(root.left,key);
        }
        else{
            // voila if(root.val == key)
            // case 1: leaf node
            if(root.left== null && root.right==null){
                return null;
            }
            // case 2 single child 
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // case 3 bath child 
            TreeNode inorderSucc= findInorderSuccessor(root.right);
            // inorder successor is the leftmost node in right subtree
            root.val = inorderSucc.val;
            root.right=deleteNode(root.right, inorderSucc.val);
        }
        return root;
    }
    public TreeNode findInorderSuccessor(TreeNode root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }       
}
