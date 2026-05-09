 interface Stack {
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}
 class IntegerStack implements Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public IntegerStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // Indicates an empty stack
    }

    // Pushes an element onto the stack
    @Override
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    // Pops the top element from the stack
    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Indicates an error
        } else {
            int poppedElement = stack[top--];
            System.out.println("Popped: " + poppedElement);
            return poppedElement;
        }
    }

    // Displays the elements of the stack
    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Checks if the stack is full
    @Override
    public boolean overflow() {
        return top == maxSize - 1;
    }

    // Checks if the stack is empty
    @Override
    public boolean underflow() {
        return top == -1;
    }
}
public class TestIntegerStack {
    public static void main(String[] args) {
        // Create a stack of size 5
        IntegerStack stack = new IntegerStack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempt to push another element to test overflow
        stack.push(60);

        // Display current stack
        stack.display();

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Display current stack
        stack.display();

        // Pop remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        // Attempt to pop from empty stack to test underflow
        stack.pop();

        // Final display
        stack.display();
    }
}
