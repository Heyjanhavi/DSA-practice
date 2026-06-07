Problem: print the leaf nodes of the tree 

public class leafNodes {
    class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    void leaf(Node root){
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null){
            System.out.println(root.data);
        }
        leaf(root.left);
        leaf(root.right);
    }
    public static void main (String[] args){
        leafNodes t = new leafNodes();
        leafNodes.Node root = t.new Node(10);
        root.left = t.new Node(20);
        root.right = t.new Node(30);
        root.right.left = t.new Node(40);
        root.right.right = t.new Node(50);

        t.leaf(root);
    }

}
