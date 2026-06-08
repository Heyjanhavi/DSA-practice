//calculate height of a tree

public class heightTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main (String[] args){
        heightTree t = new heightTree();

        heightTree.Node root = t.new Node(10);
        root.left = t.new Node(20);
        root.right = t.new Node(30);
        root.left.left = t.new Node(40);
        root.left.right = t.new Node (50);
        root.left.left.left = t.new Node(60);

        System.out.print ("Height: " + t.height(root));
        
    }
}
