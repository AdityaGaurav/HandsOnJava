package doublylinkedlist;

/**
 * Created by adityag on 5/6/2017.
 */
public class TestDoublyLinkList {

    public static void main(String[] args){

        DoublyNode node1 = new DoublyNode(1),
                   node2 = new DoublyNode(2),
                   node3 = new DoublyNode(3);

        DoublyLinkedList list = new DoublyLinkedList();
        list.addNodeInDoublyLinkedList(node1, node2,2);
        list.addNodeInDoublyLinkedList(node1, node3,3);
    }
}
