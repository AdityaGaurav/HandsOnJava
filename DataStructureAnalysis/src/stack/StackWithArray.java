package stack;

/**
 * Created by adityag on 4/29/2017.
 */
public class StackWithArray {

    private int[] inputArray;
    private int size;
    private int top =-1;

  public  StackWithArray(int n){
        this.size = n;
        System.out.println("The size of array:" +n);
        inputArray = new int[size];
        System.out.println("The array created");
    }

    public String addElementInStack(int n){
        if(top == inputArray.length-1){
            return "Statck Overflow.";
        } else{
            inputArray[++top] = n;
            return n+" added to the stack";
        }
    }


public String popElement() {
        System.out.println("The value of top"+ top);
    if (top < 0) {
        return "Stack is underflow";
    } else {
        inputArray[top] = 0;
        --top;
        return "Element deleted";
    }
}
        
        public void traverseStack(){
        for (int roll: inputArray) {
            System.out.println(roll);
        }
    }

    public static void main(String[] args){
    StackWithArray stck = new StackWithArray(4);
    stck.addElementInStack(1);
        stck.addElementInStack(2);
        stck.addElementInStack(3);
        stck.addElementInStack(4);
        stck.addElementInStack(5);
        stck.addElementInStack(6);
        stck.popElement();

        stck.addElementInStack(5);
        stck.traverseStack();
}
}
