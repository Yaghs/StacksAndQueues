package Queue;

public class main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.enqueue(4);
        myQueue.enqueue(3);
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
