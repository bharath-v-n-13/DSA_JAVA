class TreeNode {
    int data;
    TreeNode left, right;
    
    TreeNode(int n) {
        this.data = n;
    }
}
class Tree {
    TreeNode root;   
    void printInorder(TreeNode node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " "); 
        printInorder(node.right);
    }
    void printpreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " "); 
        printpreorder(node.left);
        printpreorder(node.right);
    }
    void printpostorder(TreeNode node) {
        if (node == null)
            return;
        printpostorder(node.left);
        printpostorder(node.right);
        System.out.print(node.data + " "); 
    }
}
public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new TreeNode(1);
        t.root.left = new TreeNode(2);
        t.root.right = new TreeNode(3);
        t.root.left.left = new TreeNode(4);
        t.root.left.right = new TreeNode(5);
        t.root.right.left = new TreeNode(6);
        t.root.right.right = new TreeNode(7);
        
        System.out.println("Inorder :");
        t.printInorder(t.root);
        System.out.println("\nPreorder :");
        t.printpreorder(t.root);
        System.out.println("\nPostorder :");
        t.printpostorder(t.root);
    }
}
