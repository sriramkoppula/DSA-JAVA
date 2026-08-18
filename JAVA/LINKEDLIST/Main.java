import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;

    // Insert at end
    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    // Insert at beginning
    public void insertFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = n1;
            tail = n1;
        } else {
            n1.next = head;
            head = n1;
        }
    }

    // Print Linked List
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MyLinkedList l = new MyLinkedList();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.insert(x);
        }
package JAVA.LINKEDLIST;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;

    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void insertFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = n1;
            tail = n1;
        } else {
            n1.next = head;
            head = n1;
        }
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MyLinkedList l = new MyLinkedList();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.insert(x);
        }

        int k = sc.nextInt();

        l.insertFirst(k);

        l.print();

        sc.close();
    }
}
        int k = sc.nextInt();

        l.insertFirst(k);

        l.print();
    }
}