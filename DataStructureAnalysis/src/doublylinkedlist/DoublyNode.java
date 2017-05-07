package doublylinkedlist;

/**
 * Created by adityag on 5/6/2017.
 */
public class DoublyNode {
    private int data;
    private DoublyNode right;
    private DoublyNode left;

    public DoublyNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public DoublyNode getRight() {
        return right;
    }

    public DoublyNode getLeft() {
        return left;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRight(DoublyNode right) {
        this.right = right;
    }

    public void setLeft(DoublyNode left) {
        this.left = left;
    }


    public String toString() {
        return "Data : " + this.data;
    }
}