public class LinkedList {
    Node head, tail;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    LinkedList() {
        head = tail = null;
    }
    void push(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    void append(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
    void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(20);
        list.append(30);
        list.append(40);
        list.display(); 

        list.deleteFirst();
        list.display(); 

        list.deleteLast();
        list.display();

        list.deleteFirst();
        list.display();
        
        list.deleteLast();
        list.display();
    }
}
