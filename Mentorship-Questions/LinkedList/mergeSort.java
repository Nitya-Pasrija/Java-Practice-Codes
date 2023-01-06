public static Node midNode(Node head, Node tail){
      Node f = head;
      Node s = head;

      while(f != tail && f.next != tail){
        f = f.next.next;
        s = s.next;
      }

      return s;
    }

    public static LinkedList mergeSort(Node head, Node tail){
      if(head == tail){
        LinkedList br = new LinkedList();
        br.addLast(head.data);
        return br;
      }

      Node mid = midNode(head, tail);
      LinkedList fsh = mergeSort(head, mid);
      LinkedList ssh = mergeSort(mid.next, tail);
      LinkedList sl = mergeTwoSortedLists(fsh, ssh);
      return sl;
    }