public class Stack3 {
    private int[] stack;
    private int top;

    public Stack3(int capacity) {
        stack = new int[capacity];
        top = 0;
    }

    public boolean push(int x) {
        if (top >= stack.length) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stack[top++] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
            return -1; // Return a sentinel value
        } else {
            return stack[--top];
        }
    }

    public int peek() {
        if (top <= 0) {
            System.out.println("Stack is Empty");
            return -1; // Return a sentinel value
        } else {
            return stack[top - 1];
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " Popped from stack");
        

        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
