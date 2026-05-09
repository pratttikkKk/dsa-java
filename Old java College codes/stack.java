import java.util.Scanner;

public class stack {
    int size = 6;
    int stk[] = new int[size];
    int top = -1;

    void push(int ele) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            stk[top] = ele;
            System.out.println(ele + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(stk[top] + " popped from stack");
            top--;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        Scanner sc = new Scanner(System.in);

        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.pop();
        s.pop();
        s.pop(); 

        sc.close();

        
    }
}
