package QUEUES;

public class Main1{
    public static void main(String[] args){
        CircularQueue q=new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Queue:");
        q.display();
        System.out.println("front:"+q.front);
        q.dequeue();
        System.out.println("rear:"+q.rear);
        System.out.println("size:"+q.size);
    }
}