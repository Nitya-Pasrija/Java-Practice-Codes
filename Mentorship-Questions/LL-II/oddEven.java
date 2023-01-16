public class SegregateEvenAndOddNodes {

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    System.out.println();
    }
    
    public static Node evenOddSegregate(Node head){
      Node os = null;
      Node oe = null;
      Node es = null;
      Node ee = null;
      for (Node curr = head; curr != null; curr = curr.next) {
        int x = curr.data;
        if(x % 2 == 0){ //even node
            if(es == null){
                es = curr;
                ee = es;
            }
            else{
                ee.next = curr;
                ee = ee.next;
            }
        }
        else{  //odd node
            if(os == null){
                os = curr;
                oe = os;
            }
            else{
                oe.next = curr;
                oe = oe.next;
            }
        }
      }

      if(os == null || es == null){  //all odd nodes , all even nodes
        return head;
      }
      ee.next = os;
      oe.next = null;
      return es;

    }
    public static void main(String[] args) {
        Node head=new Node(17);
    	head.next=new Node(15);
    	head.next.next=new Node(8);
    	head.next.next.next=new Node(12);
    	head.next.next.next.next=new Node(10);
    	head.next.next.next.next.next=new Node(5);
    	head.next.next.next.next.next.next=new Node(4);
    	printlist(head);
    	head= evenOddSegregate(head);
    	printlist(head);
    }
}
