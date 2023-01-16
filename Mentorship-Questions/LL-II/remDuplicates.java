public class removeDuplicates {
   //  Remove duplicate element from sorted Linked List
    public static void removeDuplicate(Node head){
        Node curr = head;
        if(head == null){
            return;
        }
        while(curr!= null && curr.next!=null ){
            if(curr.data == curr.next.data){
               curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    }
 }
