public void addAt(int idx, int val){
      if(idx < 0 || idx > size){
        System.out.println("Invalid arguments");
      } else if(idx == 0){
        addFirst(val);
      } else if(idx == size){
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;
        Node temp = head;
        for(int i = 0; i < idx - 1; i++){
          temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
      }
    }

void addFirst(int val){
    Node temp = new Node();
    temp.data = val;
    temp.next = head;
    head = temp;
    if(size == 0){
        tail = temp;
    }
      size++;
}

void addLast(int val){
    Node temp =new Node();
    temp.data=val;
    temp.next=null;
    if(size==0){
        head=tail=temp;
    }
    else{
        tail.next=temp;
        temp=tail;
    }
    size++;
}