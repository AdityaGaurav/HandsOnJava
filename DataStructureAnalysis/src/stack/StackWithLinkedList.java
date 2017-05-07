package stack;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by adityag on 4/29/2017.
 */
public class StackWithLinkedList {
    LinkedList<Integer> intarray;
    int top;

    StackWithLinkedList() {
        intarray = new LinkedList<Integer>();
        this.top = -1;
    }

    public String pushElement(int n) {
        if (top == intarray.size()) {
            return "over flow";
        } else {
            intarray.add(n);
            return "";
        }


    }
}