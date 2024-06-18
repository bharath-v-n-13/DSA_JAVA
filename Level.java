import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
    }
}
class others{
    TreeNode root;
    void levelorder(){
        if(root == null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            System.out.print(cur.data+" ");
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
        }
    }
}
public class Level {
    public static void main(String[] args) {
        others ot=new others();
        ot.root=new TreeNode(1);
        ot.root.left=new TreeNode(2);
        ot.root.right=new TreeNode(3);
        ot.root.left.right=new TreeNode(5);
        ot.root.left.left=new TreeNode(4);
        ot.root.right.left=new TreeNode(6);
        ot.root.right.right=new TreeNode(7);
        System.out.println("level order traversal is");
        ot.levelorder();
    }
}