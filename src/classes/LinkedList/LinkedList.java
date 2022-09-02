package classes.LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    void insertLast(int value){
        Node node = new Node(value);
        if(tail == null)
        {
            head = node;
            tail = head;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("End");
    }
    private class Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value = value;
        }
        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }

    }
}
