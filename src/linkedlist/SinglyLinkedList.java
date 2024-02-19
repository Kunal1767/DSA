package linkedlist;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList out = new SinglyLinkedList();
        SinglyLinkedList.linked ll = out.new linked();

        ll.addend(9);
        ll.addend(8);
        ll.addFirst(12);
        ll.addFirst(10);
        ll.addFirst(31);
        ll.indexat(2, 56);
        ll.indexat(6, 41);
        ll.indexat(0, 11);
        ll.display();
        //System.out.println(ll.getat(4));
        ll.delete(5);
        ll.delete(0);
        ll.display();
        System.out.println(ll.getat(1));

        System.out.println(ll.size());
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public class linked {
        Node head;
        Node tail;

        void addend(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        void indexat(int idx, int value) {
            Node t = new Node(value);
            Node temp = head;
            if (idx == size()) {
                addend(value);
                return;
            } else if (idx == 0) {
                addFirst(value);
                return;
            } else if (idx < size() || idx > size()) {
                System.out.println("Wrong index");
            }

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int getat(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void delete(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }


    }
}
