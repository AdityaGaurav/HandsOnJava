package singlelinkedlist;

/**
 * Created by adityag on 5/31/2017.
 */
public class SinglyLinkedList {

    public int lengthOfLinkedList(Node headerNode) {
        if (headerNode == null) {
            System.out.println("");
        }
        if (headerNode.getNode() == null) {
            return 1;
        } else {
            int count = 1;
            while (headerNode.getNode() != null) {
                ++count;
                headerNode = headerNode.getNode();
            }
            return count;
        }
    }

    public Node insertNodeIntoLinkedList(Node headerNode, Node nodeToBeInserted, int position) {
        int length = lengthOfLinkedList(headerNode);
        if (position < 0 || position > length + 1) {
            System.out.print("Incorrect position to insert given node. Range should be fallen under");
        }
        if (position == 1) {
            nodeToBeInserted.setNode(headerNode);
            return nodeToBeInserted;
        } else {
            int count = 1;
            Node nextNode = headerNode, previousNode;
            while (count < position - 1) {
                nextNode = nextNode.getNode();
                ++count;
            }
            previousNode = nextNode.getNode();
            nextNode.setNode(nodeToBeInserted);
            nodeToBeInserted.setNode(previousNode);
            return headerNode;
        }
    }


    public Node deletionOfNode(Node headeNode, int position) {
        int length = lengthOfLinkedList(headeNode);
        if (position > length + 1 || position < 0) {
            System.out.print("Incorrect position to insert given node. Range should be fallen under");
        }
        if (position == 1) {
            Node tempNode = headeNode;
            headeNode = tempNode.getNode();
            tempNode.setNode(null);
            return headeNode;
        } else {
            int count = 1;
            Node next = headeNode;
            while (count < position - 1) {
                next = next.getNode();
                ++count;
            }
            Node currentNode = next;
            next = next.getNode();
            Node nextToNextNode = next.getNode();
            currentNode.setNode(nextToNextNode);
            return headeNode;
        }
    }

    public void printLinkedList(Node headerNode) {
        if (headerNode == null) {
            System.out.println("Empty Linked List");
        }
        int count = 0;
        int lengthOfList = lengthOfLinkedList(headerNode);
        while (count < lengthOfList) {
            ++count;
            System.out.print(headerNode.getData()+" -> ");
            headerNode = headerNode.getNode();

        }
    }
}