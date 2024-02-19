package linkedlist;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList out = new DoublyLinkedList();
        DoublyLinkedList.doubly ll = out.new doubly();

        ll.addLast(9);
        ll.addLast(8);
        ll.addFirst(12);
        ll.addFirst(10);
        ll.addFirst(31);
        ll.display();
        ll.displayrev();
        ll.insertatidx(2, 25);
        ll.display();
        ll.delhead();
        ll.display();
        ll.deltail();
        ll.display();
        ll.size();
        ll.delatidx(0);
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public class doubly {
        Node head;
        Node tail;

        void displayrev() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        void addFirst(int x) {
            Node t = new Node(x);
            if (head == null) {
                head = t;
            } else {
                t.next = head;
                head.prev = t;
                head = t;
            }
        }

        void addLast(int x) {
            Node t = new Node(x);
            if (head == null) {
                head = t;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = t;
                t.prev = temp;
                tail = t;
            }
        }

        void insertatidx(int idx, int x) {
            Node s = head;
            for (int i = 1; i <= idx - 1; i++) {
                s = s.next;
            }
            Node r = s.next;
            Node t = new Node(x);
            s.next = t;
            t.prev = s;
            t.next = r;
            r.prev = t;

        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void delhead() {
            if (head == null) {
                return;
            }

            if (head.next != null) {
                head.next.prev = null;
            }

            head = head.next;
        }

        void deltail() {
            if (head == null) {
                System.out.println("null the linked list");
            } else if (head == tail) {
                head = tail = null;
            } else {
                Node temp = tail.prev;
                temp.next = null;
                tail = temp;
            }
        }

        void delatidx(int idx) {
            if (head == null || idx < 0) {
                System.out.println("Invalid operation. The list is empty or index is negative.");
                return;
            }

            if (idx == 0) {
                delhead();

            }

            int listSize = size();
            if (idx >= listSize) {
                System.out.println("Index out of bounds.");
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            Node delNode = temp.next;
            temp.next = delNode.next;
            if (delNode.next != null) {
                delNode.next.prev = temp;
            }

            delNode.next = null;
            delNode.prev = null;
            display();
        }


        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
