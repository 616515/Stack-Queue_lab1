package src1;

public class AdvStack extends MyStack {

    public AdvStack(int size) {
        super(size);
    }

    private int availableSpace() {
        return capacity - (top + 1);
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return list[top];
    }

    public String search(int x) {
        for (int i = 0; i <= top; i++) {
            if (list[i] == x) return "true";
        }
        return "false";
    }

    public void clear() {
        top = -1;
    }

    public void doublePop() {
        if (top >= 1) {
            pop();
            pop();
        } else {
            System.out.println("stack not enough");
        }
    }

    public void doublePush(int x, int y) {
        if (availableSpace() >= 2) {
            push(x);
            push(y);
        } else {
            System.out.println("stack not enough");
        }
    }
}