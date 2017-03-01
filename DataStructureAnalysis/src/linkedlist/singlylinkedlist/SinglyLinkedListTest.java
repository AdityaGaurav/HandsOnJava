package linkedlist.singlylinkedlist;

/**
 * Created by adityag on 3/1/17.
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(5);
        LinkedListNode node4 = new LinkedListNode(6);
        LinkedListNode node5 = new LinkedListNode(1);
        SinglyLinkedListOperations operation = new SinglyLinkedListOperations();
        System.out.println(node1.getData());
        node1.setNode(node2);
        node2.setNode(node3);

//        Addition of nodes
        System.out.println("Addition of nodes");
        operation.addNodeInSinglyLinkedList(node1,node4, 4);
        operation.addNodeInSinglyLinkedList(node1,node5, 1);
        System.out.println(operation.lenthOfSinglyLinkedList(node5));
        operation.printNodeOfLinkedListNode(node5);

//        Deletion of  nodes
        System.out.println("\n Deletion of  nodes");
        operation.deleteNodeFromSinglyLinkedListOperations(node5,1);
        operation.printNodeOfLinkedListNode(node5);
       System.out.println("\n");//+operation.lenthOfSinglyLinkedList(node5));


    }
}
