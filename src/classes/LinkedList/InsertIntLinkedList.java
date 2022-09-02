package classes.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertIntLinkedList {
    public static void main(String[] args) {
        LinkedListReverse llr = new LinkedListReverse();
        llr.insertFirst(2);
        llr.insertFirst(1);
        llr.insertLast(3);


        llr.insertLast(4);
        llr.reverse();
        llr.display();
        int[] a = new int[5];
        a[0]=5;
        //System.out.println(a.toString());
        System.out.println("args = " + Arrays.toString(a));

        System.out.println(1<<1);
    }
}
