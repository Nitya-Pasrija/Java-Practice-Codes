public void addFirst(int val){
    Node temp = new Node();
    temp.data = val;
    temp.next = head;
    head = temp;
    if(size == 0){
        tail = temp;
    }
      size++;
}