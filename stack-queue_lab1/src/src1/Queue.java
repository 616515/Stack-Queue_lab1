package src1;

public class Queue {
    protected int front;
    protected int rear;
    protected int[] list;
    protected int capacity;

    public Queue(int size) {
        capacity = size;
        list = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int x) {
        if (isFull()) {
            System.out.println("queue full");
            return;
        }
        if (isEmpty()) front = 0;
        list[++rear] = x;
        System.out.println("enQueue " + x);
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("front > rear");
            return;
        }
        int removed = list[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("deQueue " + removed);
    }

    protected boolean isFull() {
        return rear == capacity - 1;
    }

    protected boolean isEmpty() {
        return front == -1;
    }
}