package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        /**
         * Case 1: only 1 Node
         * Case 2: >1 Nodes
         * Case 3: 0 Nodes
         */

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = newNode;
    }

    public Node find(int data) {
        for (Node ptr = head; ptr.next != null; ptr = ptr.next) {
            if (ptr.data == data) {
                System.out.println("Found " + data);
                return ptr;
            }
        }
        
        System.out.println("Did not find " + data);
        return null;
    }

    public boolean delete(int data) {
        /**
         * Case 1: head node contains the data
         * Case 2: some other node contains the data
         * Case 3: no node contains the data
         * Case 4: last node contains the data
         */

        if (head.data == data) { // first node contains the data
            head = head.next;
            return true;
        }

        // some other node contains the data

        Node prev = head;
        Node ptr = prev.next;

        while (ptr.data != data) {
            prev = ptr;
            ptr = ptr.next;

            if (ptr == null) {
                return false;
            }
        }

        prev.next = ptr.next;
        return true;
    }

    public void printList() {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr);
            ptr = ptr.next;
        }
    }
}
