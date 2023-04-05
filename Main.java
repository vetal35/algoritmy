

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(12);
        list.add(78);
        list.add(90);
        list.add(103);
        list.add(34);
        list.printSinglyLinkedList(list);
        list.reverse();
        list.printSinglyLinkedList(list);


    }
}