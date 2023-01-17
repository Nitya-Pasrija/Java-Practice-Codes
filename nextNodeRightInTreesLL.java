class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur==null && q.isEmpty()){
                return root;
                
            }
            else if(cur==null){
                q.add(null);
                continue;
            }
            else{
                cur.next=q.peek();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    return root;
    }
}