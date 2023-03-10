class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int count=1;
        
        ListNode temp2=head;
        while(temp2.next!=null){
            temp2=temp2.next;
            count++;
        }
        
        ListNode temp1=head;
        int i=1;
        if(k==1){
            temp1=head;
        }
        else{
            while(i!=k){
                i++;
                temp1=temp1.next;
            }
        }
        
        int end=count-k+1;
        temp2=head;
        i=1;
        while(i!=end){
            i++;
            temp2=temp2.next;
        }

        count=temp1.val;
        temp1.val=temp2.val;
        temp2.val=count;
        return head;
    }
}