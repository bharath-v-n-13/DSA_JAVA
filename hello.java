class LinkedList {
    Node head, tail;

    // Inner class to represent a Node in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize an empty linked list
    LinkedList() {
        head = tail = null;
    }

    // Method to push an element to the front of the list
    void push(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Method to append an element to the end of the list
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

    // Method to delete the first element from the list
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head == null) { // If the list became empty after deletion
            tail = null;
        }
    }

    // Method to display the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(20);
        list.append(30);
        list.printList(); // Output: 20 10 30

        list.deleteFirst();
        list.printList(); // Output: 10 30

        list.deleteFirst();
        list.printList(); // Output: 30

        list.deleteFirst();
        list.printList(); // Output: (empty list)

        list.deleteFirst(); // Output: List is empty.
    }
}
