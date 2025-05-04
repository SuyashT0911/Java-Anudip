import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(1);
        pq.offer(33);
        pq.offer(7);
        pq.offer(50);
        pq.poll();
        System.out.println(pq);

    }
}
