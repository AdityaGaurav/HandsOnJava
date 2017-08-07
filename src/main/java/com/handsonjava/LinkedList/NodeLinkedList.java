package com.handsonjava.LinkedList;

/**
 * Created by adityag on 2/6/17.
 */
public class NodeLinkedList {

    private int data;
    private NodeLinkedList nextNode;

    public NodeLinkedList(int data) {

        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNextNode(NodeLinkedList nextNode) {
        this.nextNode = nextNode;

    }

    public NodeLinkedList getNextNode() {
        return this.nextNode;
    }
}
