public void kReverse(int k) {
      LinkedList prev = null;

      while (this.size > 0) {
        LinkedList curr = new LinkedList();

        if (this.size >= k) {
          for (int i = 0; i < k; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addFirst(val);
          }
        } else {
          int sz = this.size;
          for (int i = 0; i < sz; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addLast(val);
          }
        }

        if (prev == null) {
          prev = curr;
        } else {
          prev.tail.next = curr.head;
          prev.tail = curr.tail;
          prev.size += curr.size;
        }
      }

      this.head = prev.head;
      this.tail = prev.tail;
      this.size = prev.size;
    }
}