
class Node {
    public int data;
    public Node next;
}

public class LinkedList {
    public Node start;
    public Node end;

    public void create_end(int el) {
        Node current;
        if (start == null) {
            start = new Node();
            start.data = el;
            start.next = null;
            end = start;
        } else {
            current = new Node();
            current.data = el;
            current.next = null;
            end.next = current;
            end = current;
        }
    }

    public void display() {
        if (start == null) {
            System.out.println("No element added");
            return;
        }
        Node current = start;
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public void oddElement() {
        if (start == null) {
            System.out.println("No element added");
            return;
        }
        Node current = start;
        while (current != null) {
            if (current.data % 2 == 0) {
                System.out.print(current.data + "-> ");
            }
            current = current.next;

        }
    }
    public void InsertAtStart(int el){
        Node current = new Node();
        current.data = el;
        current.next = start;
        start=current;
    } 

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.create_end(1);
        list.create_end(2);
        list.create_end(3);
        list.create_end(4);
        list.create_end(5);
        list.create_end(6);
        list.create_end(7);
        // list.oddElement();
        list.InsertAtStart(49);
        list.display();
    }
}