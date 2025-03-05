import java . util .*;

class Node{
    int data;
    Node next=null;

    public Node(int i){
        data=i;
    }
    public Node(int i, Node n){
        data=i;
        next=n;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(10));
        Node curr = head;
        for (int i = 0; i < 9; i++) {
            Node temp = new Node(rand.nextInt(10));
            curr.next = temp;
            curr = curr.next;
        }

        //print
        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        java.util.Scanner scnr = new java.util.Scanner(System.in);
        int num = scnr.nextInt();

        if (head.data == num) {
            head = head.next;
        }
        else {
            Node prev = head;
            curr = head.next;

            while (curr != null) {
                if (curr.data == num) {
                    prev.next = curr.next;
                }

                prev = prev.next;
                curr = curr.next;
            }
        }

        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();

        Node tmp = head;
        head = new Node (20, tmp);

        curr = head;
        while (curr != null) {
            if (curr.next == null) {
                curr.next = new Node (40, null);
                break;
            }
            curr = curr.next;
        }

        curr = head;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                Node temp = curr.next;
                curr.next = new Node (60, temp);
            }
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}