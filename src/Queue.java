public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
        } else {
            data[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deque value is = "+data[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void peek() {
        System.out.println("value is = "+data[front]);
    }

    public void showCurrentQueue(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[front]+"  "+"index is "+front);
            front = (front + 1) % capacity;
        }
        System.out.println();
    }
}
