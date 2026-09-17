package QUEUES;
import java.util.*;
public class two {
    public static void main(String[] args){
    Queue<Integer>q=new LinkedList<>();
    q.offer(10);
    q.offer(20);
    q.offer(30);
    q.offer(40);
    q.offer(50);
    System.out.println(q.poll());
    System.out.println(q.poll());
    q.offer(60);
    q.offer(70);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println("front:"+q.peek());
    System.out.println("rear:"+((LinkedList<Integer>)q).getLast());
    System.out.println("size:"+q.size());
    }
}
