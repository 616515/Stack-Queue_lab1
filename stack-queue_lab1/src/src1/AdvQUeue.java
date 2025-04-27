package src1;

public class AdvQUeue extends Queue {

    public AdvQUeue(int size) {
        super(size);
    }

    public String search(int x) {
        if (isEmpty()) return "false";
        for (int i = front; i <= rear; i++) {
            if (list[i] == x) return "true";
        }
        return "false";
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
            System.out.println("front > rear");
            return -1;
        }
        return list[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("front > rear");
            return -1;
        }
        return list[rear];
    }
}