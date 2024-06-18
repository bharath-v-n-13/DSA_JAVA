class LinkedList{
    class Node{
        int data;
        Node next,prev;
        Node (int n);{
            this.data = n;
        }
    }
    Node head,tail;
    void append(int n){
        Node newNode = new Node(n);
        if(head==null){
            head = tail = newNode;return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail = newNode;
    }
    int removeLast(){
        int elt = tail.data;
        tail = tail.prev;
        tail.next.prev = null;
        tail.next=null;
        return elt;
    }
}
class StackUsingLL{
    Linked_List list;
    int size;
    StackUsingLL() {
        list = new Linked_List();
        size = 0;
    }
    void push(int n) {
      list.append(n); size++;
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        size--; return list.removeLast();
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }return list.tail.data;
}

    boolean isEmpty() {
        return list.head==null;
    }
    int size() {
        return size;
    }
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Stack1{
    public static void main(String[] args) {
        StackUsingArr ob = new StackUsingArr();
        ob.push(0);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.pop();
        ob.printStack();
    }
}
