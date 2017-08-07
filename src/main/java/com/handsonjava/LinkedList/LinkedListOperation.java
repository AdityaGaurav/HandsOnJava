package com.handsonjava.LinkedList;

/**
 * Created by adityag on 2/6/17.
 */
public class LinkedListOperation {

    public int traverseLinkedList(NodeLinkedList header) {

        int length = 0;
//        NodeLinkedList tempNode = header;
        if (header == null) {
//        if (header.getNextNode() == null) {
//            return 1;
            return 0;
        }
//        } else {

        NodeLinkedList currentNode = header;
        while (currentNode!= null) {
//        while (currentNode.getNextNode() != null) {

            ++length;
            currentNode = currentNode.getNextNode();
        }


        return length;
    }

    public NodeLinkedList insertInLinkedList(NodeLinkedList headerNode, NodeLinkedList nodeToInsert, int position) {


        if (headerNode == null) {
            return headerNode;
        }

        int length = traverseLinkedList(headerNode);
//        if (length < position) {
        if (length + 1 < position || position < 1) {
            System.out.println("Out of Range. Provide inpute with in range");
            System.exit(0);
        }

        if (position == 1) {

            nodeToInsert.setNextNode(headerNode);
            return nodeToInsert;

        } else {
            NodeLinkedList previousNode = headerNode;
//            int count = 0;
            int count = 1;
//            if (length > position) {
            while (count < position - 1) {

                previousNode = previousNode.getNextNode();
                ++count;

            }

            NodeLinkedList currentNode = previousNode.getNextNode();
            previousNode.setNextNode(nodeToInsert);
            nodeToInsert.setNextNode(currentNode);

//            } else if (length == position) {
//
//                while (count <= length) {
//                    tempNode = tempNode.getNextNode();
//                    ++count;
//                }
//
//                tempNode.setNextNode(nodeToInsert);
//            }

        }
        return headerNode;

    }

    //    public NodeLinkedList deleteFromLinkedList(NodeLinkedList header, NodeLinkedList nodetodelete, int position) {
    public NodeLinkedList deleteFromLinkedList(NodeLinkedList headerNode, int position) {
        if (headerNode == null) {

            return headerNode;
        }

        int length = traverseLinkedList(headerNode);

        if (position < length + 1 || position < 0) {
            System.out.println("Out of Range. Provide inpute with in range");
        }

        if(position == 1){
            NodeLinkedList nodeToDelete = headerNode;
            headerNode = nodeToDelete.getNextNode();
            nodeToDelete.setNextNode(null);
        }else{

        }

        return headerNode;
    }

    public void nullifyLinkedList(NodeLinkedList header) {

    }

}
