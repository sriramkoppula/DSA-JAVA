package QUEUES;

public class QueueArray {

    int[] queue;
    int front;
    int rear;
    int size;

    // Constructor
    public QueueArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Add element
    public void enqueue(int value) {

        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear] = value;
        rear++;
        size++;
    }

    // Remove element
    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];

        front++;
        size--;

        return value;
    }

    // See front element
    public int peek() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }
}