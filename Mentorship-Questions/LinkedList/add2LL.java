private static int addhelper(Node one, int pv1, Node two, int pv2, LinkedList res) {
  if (one == null && two == null) {
    return 0;

  }
  int sum = 0;
  if (pv1 > pv2) {
    int oc = addhelper(one.next, pv1 - 1, two, pv2, res); //pv1=place value of 1
    sum = one.data + oc;
  }
  else if (pv2 > pv1) {
    int oc = addhelper(one, pv1, two.next, pv2 - 1, res); //pv2=place value of 2
    sum = two.data + oc;
  }
  else {
    int oc = addhelper(one.next, pv1 - 1, two.next, pv2 - 1, res); //oc= old carry
    sum = one.data + two.data + oc;
  }

  int c = sum / 10;   //new carry
  int d = sum % 10;   //new digit of "res"
  res.addFirst(d);
  return c;

}
public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
  LinkedList res = new LinkedList();
  int oc = addhelper(one.head, one.size, two.head, two.size, res);
  if (oc > 0) {
    res.addFirst(oc);
  }
  return res;
}