package circularlinkedlist;

public class CircularLinkedList {
    class CLLNode {
        CLLNode node;
        int data;

        CLLNode(int data) {
            this.data = data;
            node = null;
        }

        public void setNode(CLLNode node) {
            this.node = node;
        }

        public CLLNode getNode() {
            return this.node;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return this.data;
        }
    }

    private CLLNode tail;
    private int length;

    public CircularLinkedList() {
        tail = null;
        length = 0;
    }

    public void add(int data) {
        addToHead(data);
    }

    public void addToHead(int data) {
        CLLNode temp = new CLLNode(data);
        if (tail == null) {
            tail = temp;
            tail.setNode(tail);
        } else {
            temp.setNode(tail.getNode());
            tail.setNode(temp);
        }
        length++;
    }

    public void addToTail(int data) {
        addToHead(data);
        tail = tail.getNode();
    }

    public int peek() {
        return tail.getData();
    }

    public int tailPeek() {
        return tail.getData();
    }

    public int removeFromHead() {
        CLLNode temp = tail.getNode();
        if (tail == tail.getNode()) {
            tail = null;
        } else {
            tail.setNode(temp.getNode());
            temp.setNode(null);
        }
        length--;
        return temp.getData();
    }
//    public int removeFromTail(){
//        if(isEmpty()){
//            return Integer.MIN_VALUE;
//        }
//    }

//    public int lengthOfCLL(CircularLinkedList head) {
//
//    }
}
