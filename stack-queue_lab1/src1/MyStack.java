public class MyStack {
    protected int top;
    protected int[] list;

    public MyStack(int size) {
        list = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Warning: Stack is full. Cannot push " + x);
            return;
        }
        list[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Warning: Stack is empty. Cannot pop.");
            return -1;
        }
        return list[top--];
    }

    protected boolean isFull() {
        return top == list.length - 1;
    }

    protected boolean isEmpty() {
        return top == -1;
    }
}