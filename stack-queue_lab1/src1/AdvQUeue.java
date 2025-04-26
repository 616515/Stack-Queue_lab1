public class AdvQUeue extends MyQueue {

    public AdvQueue(int size) {
        super(size);
    }

    public String search(int x) {
        if (isEmpty()) return "FALSE";
        for (int i = front; i <= rear; i++) {
            if (list[i] == x) return "TRUE";
        }
        return "FALSE";
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    public int getSize() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    public boolean isFull() {
        return super.isFull();
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Warning: Queue is empty. No front element.");
            return -1;
        }
        return list[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Warning: Queue is empty. No rear element.");
            return -1;
        }
        return list[rear];
    }
}