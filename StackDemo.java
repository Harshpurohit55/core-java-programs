class Stack {
    private static final int MAX_SIZE = 100;
    private int top;
    private int[] stackArray;

    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    
    public void push(int item) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stackArray[++top] = item;
            System.out.println(item + " pushed to the stack.");
        }
    }

    
    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; 
        } else {
            int poppedItem = stackArray[top--];
            System.out.println(poppedItem + " popped from the stack.");
            return poppedItem;
        }
    }

    
    public boolean isEmpty() {
        return (top < 0);
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int poppedItem = stack.pop();
        if (poppedItem != -1) {
            System.out.println("Popped item: " + poppedItem);
        }

        stack.push(40);

        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
