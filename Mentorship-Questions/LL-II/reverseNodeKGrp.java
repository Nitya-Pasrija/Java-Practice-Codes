public class ReverseALLnGroupsOfSizeK{ 
    //METHOD 1 - RECURSIVE SOLUTION
    public static Node reverse1(Node node, int k){
        Node curr = node;
        Node prev = null;
        Node temp = null;
        int count = 0;
        while(curr != null && count < k){
            temp = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = temp;
            
            count++;
        }
        while(temp != null){
            Node revHead = reverse1(temp , k );
            node.next = revHead;
        }
        return prev;
    }
    //METHOD 2 - ITERATIVE SOLUTION
    public static Node reverse2(Node node, int k){
        Node curr = node;
        boolean isFirstPass = true;
        Node prevFirst = null;
        
        while(curr != null){
            int count = 0;
            Node prev = null;
            Node first = curr;
            
            while(curr != null && count < k){
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                
                count++;
            }
            if(isFirstPass){
                node = prev;
                isFirstPass = false;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return node;
    }
}
