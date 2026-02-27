/* Problem: Given the head of a linked list, print the length of the linked list.*/

public class listSize {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static int getLength(Node head){
            int counter = 0;
            Node temp = head;

            while (temp != null){
                counter++;
                temp = temp.next;
            }
            return counter;
        }

        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);

            int length = getLength(head);
            System.out.println(length);
        }
    
}
