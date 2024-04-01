package Queue;

public class QueueCircularArray {
    int[] a;
    int n;
    int front = -1, rear = -1;

    public QueueCircularArray(int n) {
        this.n = n;
        a = new int[n];
    }

    void enqueue(int data) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % n;
        a[rear] = data;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        int result = a[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }
        System.out.println("Dequeued: " + result);
    }

    int getFront() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return a[front];
    }

    public static void main(String[] args) {
        // Create a circular queue with capacity 5
        QueueCircularArray q = new QueueCircularArray(5);

        // Enqueue elements
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        // Dequeue elements
        q.dequeue();
        q.dequeue();

        // Get the front element
        System.out.println("Front element: " + q.getFront());
    }
}
