
    

/*Необходимо реализовать метод разворота односвязного списка */



public class SinglyLinkedList {
    Node head;

    public void reverse() {
        if (head != null && head.next != null) {
            reverse(head, head.next);
        }
    }

    private void reverse(Node current, Node next) {
        if (next.next != null) {
            reverse(next, next.next);
        } else {
            head = next;
        }
        next.next = current;
        current.next = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = node;
        }

    }

    public void printSinglyLinkedList(SinglyLinkedList list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();

    }


    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}