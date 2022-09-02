package classes.LinkedList;

public class LinkedListDetectCycle {
    private ListNode head;
    private ListNode tail;
    int size;
    LinkedListDetectCycle()
    {
        this.size = 0;
    }
    public Integer hasCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        int sizeCycle = 0;
        if(fast == null)
        {
            return null;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                System.out.println("Has Cycle");
                fast = fast.next;
                size += 1;
                while(fast!=slow)
                {
                    fast = fast.next;
                    size += 1;
                }
                return size;
            }
        }
        return null;
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
            size+=1;
        }
    }
    void insertFirst(int val)
    {
        ListNode node = new ListNode(val);
        if(head == null)
        {
            head = node;
            tail = head;
            size+=1;
        }
        else
        {
            node.next = head;
            head = node;
            size+=1;
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
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val = val;
        }
        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }

}
