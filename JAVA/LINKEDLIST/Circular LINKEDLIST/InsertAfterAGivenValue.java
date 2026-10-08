import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAfterAGivenValue{
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
int newvalue=sc.nextInt();
int aftervalue=sc.nextInt();

Node newnode=new Node(newvalue);
    if(head!=null){
        Node curr=head;
        do{
            if(curr.data==aftervalue){
                newnode.next=curr.next;
                curr.next=newnode;
            if(curr==tail){
                tail=newnode;
            }
            break;
        }
            curr=curr.next;
        }while(curr!=head);
    }
    if(head!=null){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
    }
}
