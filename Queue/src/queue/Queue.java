package queue;
public class Queue {
public static void main(String[] args) {
    QueueClass q = new QueueClass();
    q.enQueue(1);
    q.enQueue(3);
    q.enQueue(5);
    q.enQueue(7);
    q.enQueue(9);
    //q.enQueue(23); //for 2nd method
    //q.enQueue(45); //for 2nd method
    q.show();
    q.deQueue();
    //System.out.println("isEmpty: " + q.isEmpty());
    //System.out.println("isFull: " + q.isFull());
    //System.out.println("Size: " + q.getSize());
    q.show();
    }
}
