/* Problem: Given a linked list and an integer value val, insert a new node with that value at the beginning (before the head) of the list and return the updated linked list.*/

public class inserthead {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node head = null;
        Node newNode = new Node(5);

        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}
