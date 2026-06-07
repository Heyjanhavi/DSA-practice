//Given a binary tree, invert it so that the left and right children of every node are swapped.

public class swapTree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    void mirror(Node root){
        if (root == null) return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror (root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        swapTree t = new swapTree();

        swapTree.Node root = t.new Node(10);
        root.left = t.new Node(20);
        root.right = t.new Node(30);
        root.left.left = t.new Node(40);
        root.left.right = t.new Node(50);

        t.mirror(root);
    }
}
