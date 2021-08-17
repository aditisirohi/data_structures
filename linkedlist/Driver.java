package linkedlist;

public class Driver {
    public static void main(String[] args) {
        // initialize list
        LinkedList list = new LinkedList();

        // test insert
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printList();

        System.out.println("-------------");

        // test delete
        // list.delete(1); // first node
        // list.delete(3); // middle node
        // list.delete(5); // last node
        // list.delete(6); // does not exist
        list.printList();

        // test find
        // System.out.println(list.find(2));
    }
}
