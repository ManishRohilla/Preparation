package classes.LinkedList;

public class LinkedListRemoveDuplicates {
    private Node head;
    private Node tail;
    int size;
    LinkedListRemoveDuplicates()
    {
        this.size = 0;
    }
    void removeDuplicates()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;

            }
            else {
                temp = temp.next;
            }
            System.out.print(temp.val+"->");
        }
        System.out.println();

    }
    void insertLast(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = head;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
        size += 1;
    }
    void insertFirst(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            insertLast(val);
        }
        else
        {
            node.next = head;
            head = node;
        }
        size += 1;
    }
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node
    {
        private int val;
        private Node next;
        Node(int val)
        {
            this.val = val;
        }
        Node (int val, Node next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
