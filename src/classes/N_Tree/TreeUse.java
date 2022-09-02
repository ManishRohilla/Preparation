package classes.N_Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TreeUse {
    public static void main(String[] args) {
        TressNode<Integer> root = new TressNode(1);
        TressNode<Integer> node3 = new TressNode(3);
        TressNode<Integer> node2 = new TressNode(2);
        TressNode<Integer> node4 = new TressNode(4);
        TressNode<Integer> node5 = new TressNode(5);
        TressNode<Integer> node6 = new TressNode(6);
        TressNode<Integer> node7 = new TressNode(7);
        TressNode<Integer> node8 = new TressNode(8);

        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);
        node2.children.add(node7);
        node2.children.add(node8);
        Stack<TressNode> Node = new Stack<>();
        Node.push(root);
        while(!Node.isEmpty()) {
            TressNode curr = Node.pop();
            if (curr != null)
            {
                for (int i = 0; i < curr.children.size(); i++)
                {
                    Node.add(curr.children.get(i));
                }
            }
        }
        String a = new String();
        int a[] =new int[]{1,2};

        
    }
}
