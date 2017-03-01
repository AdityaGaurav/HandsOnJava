package linkedlist.singlylinkedlist;

/**
 * Created by adityag on 2/28/17.
 */
public class SinglyLinkedListOperations {

    //   this method will provide the total number of nodes present in SinglyLinkedList.
    //    It takes headNode of SinglyLinkedList as an parameter. From that node it will start counting.
    public int lenthOfSinglyLinkedList(LinkedListNode headNode) {

        int count = 1;

        LinkedListNode nextNode = headNode;

        if (headNode.getNode() == null) {
            return 1;
        } else {
            while (nextNode.getNode() != null) {

                nextNode = nextNode.getNode();
                ++count;
            }

            return count;
        }
    }

    public LinkedListNode addNodeInSinglyLinkedList(LinkedListNode headNode, LinkedListNode nodeToInsert, int position) {
//        at the beginning of SinglyLinkedList
        int lengthOfSinglyLinkedList = lenthOfSinglyLinkedList(headNode);

        if (position < 0 && position > lengthOfSinglyLinkedList) {
            System.out.println("Range should be <= " + lengthOfSinglyLinkedList);
            System.exit(0);
        } else {
            int count = 1;

            if (position == 1) {

                nodeToInsert.setNode(headNode);
                headNode =nodeToInsert;
                return headNode;

            } else {
                LinkedListNode tempNode = headNode;
                while (count < position - 1) {

                    tempNode = tempNode.getNode();
                    ++count;
                }
                LinkedListNode previous = tempNode.getNode();
                nodeToInsert.setNode(previous);
                tempNode.setNode(nodeToInsert);
            }
        }
        return headNode;
    }


    //    print the all node of SinglyLinkedListOperations
    public void printNodeOfLinkedListNode(LinkedListNode headNode) {

        if (headNode == null) {
            System.out.println("Nothing to print. EmptyList");
            System.exit(0);
        }
        LinkedListNode tempNode = headNode;
        int count = 1;
        int length = lenthOfSinglyLinkedList(headNode);
        while (count <= length) {


            System.out.print(tempNode.getData() + "-> ");
            tempNode = tempNode.getNode();
            count++;
        }


    }
}

