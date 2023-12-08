class Solution

{
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    // create a class for information 
    static class Info{
        Node node;
        int hd;
        
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Info> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min =Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info currNode = q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(currNode.hd)){
                    map.put(currNode.hd,currNode.node);
                }
                if(currNode.node.left!=null){
                    q.add(new Info(currNode.node.left, currNode.hd-1));
                    min=Math.min(min,currNode.hd-1);
                }
                if(currNode.node.right!=null){
                    q.add(new Info(currNode.node.right, currNode.hd+1));
                    max=Math.max(max,currNode.hd+1);
                }
            }
        }
        for(int i=min;i<max;i++){
            int a1=map.get(i).data;
                list.add(a1);
            }
            return list;
    }
}
