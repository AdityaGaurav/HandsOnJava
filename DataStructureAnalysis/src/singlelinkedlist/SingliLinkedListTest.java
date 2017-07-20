package singlelinkedlist;

/**
 * Created by adityag on 6/6/2017.
 */
public class SingliLinkedListTest {
    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNodeIntoLinkedList(one,two,2);
        list.insertNodeIntoLinkedList(one,three,3);
        list.insertNodeIntoLinkedList(one,four,4);
        list.printLinkedList(one);
    }
}
