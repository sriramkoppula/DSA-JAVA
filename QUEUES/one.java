package QUEUES;
import java.util.Queue;
import java.util.LinkedList;
public class one {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.poll());
        q.offer(40);
        System.out.println(q.peek());
    }
}
