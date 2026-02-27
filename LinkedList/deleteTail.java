/* Problem:  Given a Linked List, delete the tail of the list and print the updated list.*/

public class deletenode {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = deleteTail(head);
        printList(head);
    }

    static Node deleteTail(Node head){
        if (head == null){
            System.out.println("List is empty");
        }
        if (head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
