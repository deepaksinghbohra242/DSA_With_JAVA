package stack.demo;

public class LinkedStack {
}

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class LStack{
    Node head;
    int sz;
    LStack(){
        head = null;
        sz = 0;
    }
    int size(){
        return sz;
    }
    boolean isEmpty(){
        return (head == null);
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next = head ;
        head = temp;
        sz++;
    }


}
