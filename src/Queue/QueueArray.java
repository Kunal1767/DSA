package Queue;

public class QueueArray {
    int[] a;
    int capacity;
    int rear;

    public QueueArray(int n) {
        capacity = n;
        a = new int[n];
        rear = -1;
    }

    public static void main(String[] args) {
        QueueArray q1 = new QueueArray(5);

        // Enqueue elements
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        // Dequeue elements
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());

        // Get the front element
        System.out.println("Front element: " + q1.getfront());
    }

    void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        a[rear] = data;
    }

    int dequeue() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = a[0];
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return result;
    }

    int getfront() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return a[0];
    }
}
