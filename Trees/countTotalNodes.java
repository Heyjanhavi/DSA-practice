//calculate the total number of nodes in the tree

public class CountTotalNodes {

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
    int countNodes(Node root){
        if (root == null ) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main (String[] args){
        CountTotalNodes t = new CountTotalNodes();

        CountTotalNodes.Node root = t.new Node(10);
        root.left = t.new Node(20);
        root.right = t.new Node(30);
        root.left.left = t.new Node(40);
        root.left.right = t.new Node(50);
        root.right.left = t.new Node(60);
        root.right.right = t.new Node(70);

        System.out.print("total number of nodes is " + t.countNodes(root));
    }
}
