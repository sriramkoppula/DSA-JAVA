package QUEUES ;
public class CircularQueue{
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;
    public CircularQueue(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=0;
        size=0;
    }
    public void enqueue(int value){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }
        queue[rear]=value;
        rear=(rear+1)%capacity;
        size++;
    }
    public int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public int dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front=(front+1)%capacity;
        size--;
        return value;
    }
    public void display(){
        for(int i=0;i<size;i++){
            int index=(front+i)%capacity;
            System.out.print(queue[index]+" ");
        }
        System.out.println();
    }
}