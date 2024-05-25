public class Method {
    public static void main(String[] args) {
        System.out.println(myMethod(3,5));
        System.out.println(mymethod(3,5,10));

    }
    static int mymethod(int firstIn, int secondIn , int thirdIn){
        return firstIn + secondIn + thirdIn;

    }
    static int myMethod(int firstIn, int secondIn){
        return firstIn - secondIn;
    }
    
}
public class Queue {
     
    private int[] numbers;
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;
    public Queue(int maxSize) {
    this.maxSize = maxSize;
    numbers = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
    }
    public boolean isEmpty() {
    return nItems == 0;
    }
    public boolean isFull() {
    return nItems == maxSize;
    }
    public int peek() {
    if (isEmpty()) {
    throw new  IllegalStateException("Queue is empty. Cannot
    peek." );
    }
    return numbers[front];
    }
    public void enqueue(int value) {
    if (isFull()) {
    throw new IllegalStateException(
        "Queue is full. Cannot
    enqueue element " + value);
    }
    if (rear == maxSize - 1) {
    rear = -1; // Wrap around
    }
    numbers[++rear] = value;
    nItems++;
    }
    
    public int dequeue() {
    if (isEmpty()) {
    throw new IllegalStateException("Queue is empty. Cannot
    dequeue.");
    }
    int frontValue = numbers[front++];
    if (front == maxSize) {
    front = 0; // Wrap around
    }
    nItems--;
    return frontValue;
    }
    public static void main(String[] args) {
    Queue numQueue = new Queue(5);
    numQueue.enqueue(11);
    numQueue.enqueue(22);
    numQueue.enqueue(33);
    numQueue.enqueue(44);
    numQueue.enqueue(55);
    numQueue.dequeue();
    numQueue.dequeue();
    System.out.println("Front element: " + numQueue.peek());
    System.out.println("Size of the queue: " + numQueue.nItems);
    // Printing all elements in the queue
    while (!numQueue.isEmpty()) {
    System.out.println(numQueue.dequeue());
    }
    }
    }
    
    /*public class Queue {
        int SIZE = 5;
        int items[] = new int[SIZE];
        int front, rear;
    
        Queue() {
            front = -1;
            rear = -1;
        }
    
        boolean isFull() {
            if (front == 0 && rear == SIZE - 1) {
                return true;
            }
            return false;
        }
    
        boolean isEmpty() {
            return front == -1;
        }
    
        void enQueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1) {
                    front = 0;
                }
                rear++;
                items[rear] = element;
                System.out.println("Insert " + element);
            }
        }
    
        int deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int element = items[front];
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                } else {
                    front++;
                }
                System.out.println(element + " Deleted");
                return element;
            }
        }
    
        void display() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
            } else {
                System.out.println("\nFront index -> " + front);
                System.out.print("Items -> ");
                for (int i = front; i <= rear; i++) {
                    System.out.print(items[i] + " ");
                }
                System.out.println("\nRear index -> " + rear);
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue();
            q.deQueue(); // Try to delete element from the empty queue
            for (int i = 1; i < 6; i++) {
                q.enQueue(i);
            }
            q.enQueue(6); // 6th element can't be added because the queue is full
            q.display();
            q.deQueue(); // Removes the first element (1)
            q.display();
        }
    }
    


/** */
