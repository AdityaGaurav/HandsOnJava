package linkedlist.singlylinkedlist;

/**
 * Created by adityag on 2/28/17.
 */
public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data){
        this.data = data;
    }


    public int getData(){
        return this.data;
    }

    public void setNode(LinkedListNode next){
        this.next = next;
    }

    public LinkedListNode getNode(){
        return this.next;
    }


}
