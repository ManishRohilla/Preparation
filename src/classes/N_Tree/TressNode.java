package classes.N_Tree;

import java.util.ArrayList;

public class TressNode<T> {
    T data;
    ArrayList<TressNode<T>> children;
    TressNode(T data)
    {
        this.data = data;
        children = new ArrayList<>();
    }
}
