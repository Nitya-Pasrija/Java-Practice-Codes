private boolean IsPalindromeHelper(Node right) {
      if (right == null) {
        return true;
      }

      boolean rres = IsPalindromeHelper(right.next);
      if (rres == false) {
        return false;
      } else if (right.data != pleft.data) {
        return false;
      }
      pleft = pleft.next;
      return true;
    }
    Node pleft;
    public boolean IsPalindrome() {
      pleft = head;
      return IsPalindromeHelper(head);
    }
  }