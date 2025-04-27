package src1;

public class MyStack {
    protected int top;
    protected int[] list;
    protected int capacity;

    public MyStack(int size) {
        capacity = size;
        list = new int[capacity];
        top = -1;
    }

    protected boolean isFull() {
        return top == capacity - 1;
    }

    protected boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("stack full");
            return;
        }
            list[++top] = x;
            System.out.println("push " + x);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return list[top--];
    }
}