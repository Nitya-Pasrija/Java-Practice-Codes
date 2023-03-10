class Node { 
    int data; 
    Node next; 

    Node(int d) { 
        data = d; 
        next = null; 
    } 
} 
public class IntersectionOf2LLMethod2 {
    static int getCount(Node head){
        Node curr = head;
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }
    static int getNode(Node head1 , Node head2){
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;
        if(c1 > c2){
            d = c1 - c2;
            return getIntersection(d, head1, head2);
        }
        else{
            d = c2 - c1;
            return getIntersection(d,  head2, head1);
        }
    }
    static int getIntersection(int d , Node head1 , Node head2){
        int i ;
        Node curr1 = head1;
        Node curr2 = head2;
        for (i = 0;i <d; i++) {
            if(curr1 == null){
                return-1;
            }
            curr1 = curr1.next;
        }
        while(curr1 != null && curr2 != null){
            if(curr1.data == curr2.data){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }
