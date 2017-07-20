package singlelinkedlist;

/**
 * Created by adityag on 5/31/2017.
 */
public class Node {
    private int data;
    private Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public void setNode(Node link) {
        this.link = link;
    }

    public Node getNode() {
        return this.link;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
