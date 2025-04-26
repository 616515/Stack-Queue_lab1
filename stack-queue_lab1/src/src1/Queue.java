package src1;

public class Queue {
    protected int front;
    protected int rear;
    protected int[] list;

    public Queue(int size) {
        list = new int[size];
        front = -1;
        rear = -1;
    }

    public void enQueue(int x) {
        if (isFull()) {
            System.out.println("Warning: Queue is full. Cannot enqueue " + x);
            return;
        }
        if (isEmpty()) front = 0;
        list[++rear] = x;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Warning: Queue is empty. Cannot dequeue.");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    protected boolean isFull() {
        return rear == list.length - 1;
    }

    protected boolean isEmpty() {
        return front == -1;
    }
}