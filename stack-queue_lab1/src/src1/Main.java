package src1;

public class Main {
    public static void main(String[] args) {
        System.out.println("---AdvStack---");
        AdvStack MyStack1 = new AdvStack(4);
        MyStack1.pop();
        MyStack1.push(1);
        MyStack1.push(2);
        MyStack1.push(3);
        MyStack1.push(9);
        MyStack1.push(10);
        System.out.println(+MyStack1.peak());
        MyStack1.clear();
        MyStack1.doublePush(1,2);
        MyStack1.push(3);
        MyStack1.doublePush(4,5);
        MyStack1.peak();
        System.out.println("---AdvQueue---");
        AdvQUeue AdvQueue1 = new AdvQUeue(4);
        AdvQueue1.deQueue();
        AdvQueue1.enQueue(1);
        AdvQueue1.enQueue(2);
        AdvQueue1.enQueue(3);
        AdvQueue1.enQueue(4);
        AdvQueue1.enQueue(9);
        AdvQueue1.deQueue();
        AdvQueue1.deQueue();
        AdvQueue1.clear();
        AdvQueue1.enQueue(1);
        AdvQueue1.enQueue(2);
        AdvQueue1.enQueue(3);
        AdvQueue1.enQueue(4);
        AdvQueue1.enQueue(9);
        System.out.println(AdvQueue1.search(4));
        System.out.println(AdvQueue1.getSize());
        System.out.println(AdvQueue1.getFront());
        System.out.println(AdvQueue1.getRear());
    }
}