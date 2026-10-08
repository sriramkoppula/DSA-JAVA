import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertionatEnd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        if(head!=null){
            tail.next=head;
        }
    }
Node newnode=new Node(5);
tail.next=newnode;
tail=newnode;
tail.next=head;
    if(head!=null){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
    }
}
