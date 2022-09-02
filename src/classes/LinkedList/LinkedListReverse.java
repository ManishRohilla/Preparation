package classes.LinkedList;

import java.sql.SQLOutput;
import java.util.List;

public class LinkedListReverse {
    private ListNode head;
    private ListNode tail;
    int size;
    LinkedListReverse()
    {
        this.size = 0;
    }
    void insertFirst(int val)
    {
        ListNode node = new ListNode(val);
        if(head==null)
        {
            head = node;
            tail = head;
            size += 1;
        }
        else
        {
            node.next = head;
            head = node;
            size += 1;
        }
    }
    void insertLast(int val)
    {
        ListNode node = new ListNode(val);
        if(head == null)
        {
            insertFirst(val);
        }
        else
        {
            tail.next = node;
            tail = node;
            size += 1;
        }
    }
    void display()
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    void reverse()
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next_node = null;
        while(curr != null)
        {
            next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }
        head = prev;
    }
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val = val;
        }
        ListNode(int val,ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
