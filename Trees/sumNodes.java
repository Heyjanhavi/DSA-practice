//sum of all the nodes in a tree

public class sumNodes {
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
    int sum(Node root){
        if (root == null) return 0;

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        sumNodes t = new sumNodes();

        sumNodes.Node root = t.new Node(10);
        root.left = t.new Node(20);
        root.right = t.new Node(30);
        root.left.left = t.new Node(40);

        System.out.println(t.sum(root));
    }
}
