public int kfromLast(int k){
    Node s= head;
    Node f= head;

    for int(i=0;i<k;i++){
        f=f.next;
    }
    while(f!=tail){
        s=s.next;
        f=f.next;
    }
    return s.data;
}