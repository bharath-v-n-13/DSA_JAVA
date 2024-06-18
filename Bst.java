import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class Bst {
    Node root;

    Bst() {
        root = null;
    }

    // Method to insert a new key in the BST
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }

    // Method to search a key in the BST
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }

    // Method to take multiple inputs from the user and insert them into the BST
    void takeInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of keys to insert:");
        int n = scanner.nextInt();

        System.out.println("Enter the keys:");
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            root = insert(root, key);
        }
    }

    // Inorder traversal of the BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.takeInputs();

        System.out.println("Inorder traversal of the BST:");
        bst.inorder(bst.root);
    }
}
