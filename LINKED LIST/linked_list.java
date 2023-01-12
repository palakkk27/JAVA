public class linked_list {

    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step 1
        Node newnode = new Node(data);
        size++;
        if (head == null) {

            head = tail = newnode;
            return;
        }

        // step 2
        newnode.next = head;// link

        // step 3
        head = newnode;
    }
    // -------------------------------------------------

    public void addLast(int data) {
        // step 1
        Node newnode = new Node(data);
        size++;

        if (head == null) {

            head = tail = newnode;
            return;
        }
        // step 2
        tail.next = newnode;// link
        // step 3
        tail = newnode;
    }
    // -------------------------------------------------

    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // -------------------------------------------------
    public void addInMiddle(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    // -------------------------------------------------
    public static int itrsearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // -------------------------------------------------

    public static void reverse() {
        Node prev = null;
        Node next;
        Node curr = tail = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(8);
        ll.print();
        ll.addInMiddle(9, 2);
        ll.print();

        System.out.println(ll.itrsearch(3));
        ll.reverse();
        ll.print();

    }
}
