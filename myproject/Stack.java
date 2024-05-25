/*public class Stack {
    // Stack implementation in Java


    private int arr[];
    private int top;
    private int capacity;
  
    // Creating a stack
    Stack(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
    // Add elements into stack
    public void push(int x) {
      if (isFull()) {
        System.out.println("OverFlow\nProgram Terminated\n");
        System.exit(1);
      }
  
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
  
    // Remove element from stack
    public int pop() {
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        System.exit(1);
      }
      return arr[top--];
    }
  
    // Utility function to return the size of the stack
    public int size() {
      return top + 1;
    }
  
    // Check if the stack is empty
    public Boolean isEmpty() {
      return top == -1;
    }
  
    // Check if the stack is full
    public Boolean isFull() {
      return top == capacity - 1;
    }
  
    public void printStack() {
      for (int i = 0; i <= top; i++) {
        System.out.println(arr[i]);
      }
    }
  
    public static void main(String[] args) {
      Stack stack = new Stack(5);
  
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
  
      stack.pop();
      System.out.println("\nAfter popping out");
  
      stack.printStack();
  
    }
  }/** */
  // Stack implementation in Java
class Stack {
  private int arr[]; // store elements of stack
  private int top; // represent top of stack
  private int capacity; // total capacity of the stack

  // Creating a stack
  Stack(int size) {
      // initialize the array
      arr = new int[size];
      capacity = size;
      top = -1;
  }

  // push elements to the top of stack
  public void push(int x) {
      if (isFull()) {
          System.out.println("Stack Overflow");
          // terminates the program
          System.exit(1);
      }
      // insert element on top of stack
      System.out.println("Inserting " + x);
      arr[++top] = x;
  }

  // pop elements from top of stack
  public int pop() {
      // if stack is empty
      // no element to pop
      if (isEmpty()) {
          System.out.println("STACK EMPTY");
          // terminates the program
          System.exit(1);
      }
      // pop element from top of stack
      return arr[top--];
  }

  // return size of the stack
  public int getSize() {
      return top + 1;
  }

  // check if the stack is empty
  public Boolean isEmpty() {
      return top == -1;
  }

  // check if the stack is full
  public Boolean isFull() {
      return top == capacity - 1;
  }

  // display elements of stack
  public void printStack() {
      for (int i = 0; i <= top; i++) {
          System.out.print(arr[i] + ", ");
      }
  }
  class BinarySearch {
    int binarySearch(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, right, target);
            }
        }
        return -1; // Element not found
    }


  public static void main(String[] args) {
      Stack stack = new Stack(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.print("Stack: ");
      stack.printStack();
      // remove element from stack
      stack.pop();
      System.out.println("\nAfter popping out");
      stack.printStack();
      
      BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
  }


    

