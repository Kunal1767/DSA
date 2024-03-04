package Queue;


public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    static class Queue{
        Node rear;
        Node front;
        void enqueue(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode ;
            rear= newNode;
        }
        int dequeue(){
            if(front==null){
                System.out.println("the queue is empty");
                return 0;
            }
            int result = front.data;
            front = front.next;
            return result;
        }
        void display() {
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(7);
        q.display();
        q.dequeue();
        q.display();
    }

}
