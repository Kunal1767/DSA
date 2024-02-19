package linkedlist;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList out = new CircularLinkedList();
        CircularLinkedList.Circular ll = out.new Circular();
        ll.addlast(2);
        ll.addlast(5);
        ll.addlast(9);
        ll.addlast(8);
        ll.addlast(7);
        ll.addFirst(25);
        ll.display();
        ll.delnode(7);

    }

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    class Circular {
        Node head;
        Node tail;

        void display() {
            Node current = head;
            if (head == null) {
                System.out.println("Circular linked list is empty.");
            } else {
                do {
                    System.out.print(current.data + " ");
                    current = current.next;
                } while (current != head);
                System.out.println();
            }
        }

        void addlast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                newNode.next = head;
                tail.next = newNode;
                head = newNode;
            }
        }

        void delnode(int key) {
            if (head == null) {
                System.out.println("Circular linked list is empty.");
                return;
            }
            Node curr = head;
            Node prev = null;
            do {
                if (curr.data == key) {
                    if (prev == null) {
                        tail.next = curr.next;
                        head = curr.next;
                    } else {
                        prev.next = curr.next;
                    }
                    return;
                }
                prev = curr;
                curr = curr.next;
            } while (curr != head);
            System.out.println("Node with key " + key + " not found.");
        }
    }
}
