package doublylinkedlist;

/**
 * Created by adityag on 5/6/2017.
 */
public class DoublyLinkedList {

    public int lengthOfDoublyLinkList(DoublyNode headNode) {
        int length = 0;
        if (headNode.getRight() == null) {
            return length = 1;
        } else {
            DoublyNode next;
            next = headNode;
            while (next.getRight() != null) {
                ++length;
                next = next.getRight();
                if (next.getRight() == null) {
                    ++length;
                    break;
                }
            }
        }
        return length;
    }

    public DoublyNode addNodeInDoublyLinkedList(DoublyNode headNode, DoublyNode nodeToInsert, int position) {
        int length = lengthOfDoublyLinkList(headNode);
        if (length + 1 < position || nodeToInsert == null || headNode == null) {
            System.out.println("Not a valid position to add element. Postion should be ");
        }
        DoublyNode next = headNode;
        if (position == 1) {
            nodeToInsert.setRight(next);
            next.setLeft(nodeToInsert);
            return nodeToInsert;
        } else {
            int count = 1;
            DoublyNode previousNode;
            while (count < position) {
                if (next.getRight() == null) {
                    next.setRight(nodeToInsert);
                    nodeToInsert.setLeft(next);
                    ++count;
                } else {
                    previousNode = next.getRight();
                    if (count == position - 1) {
                        next.setRight(nodeToInsert);
                        nodeToInsert.setLeft(next);
                        previousNode.setLeft(nodeToInsert);
                        nodeToInsert.setRight(previousNode);
                    }
                    ++count;
                    next = previousNode;
                }
            }

        }
        printDoublyLinkedList(headNode);
        return headNode;
    }


    public void printDoublyLinkedList(DoublyNode headNode) {
        if (headNode == null) {
            System.out.println("Not a valid position to add element. Postion should be ");
        }
        int length = lengthOfDoublyLinkList(headNode);
        while (length > 0) {
            System.out.print(headNode.getData() + "->");
            headNode = headNode.getRight();
            if (headNode.getRight() == null) {
                System.out.print(headNode.getData());
                break;
            }
            --length;
        }

    }
}
