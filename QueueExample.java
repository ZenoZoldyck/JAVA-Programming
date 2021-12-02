public class QueueExample {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.Enqueue(5);
        q.Enqueue(7);
        q.Enqueue(10);
        q.Enqueue(14);
        System.out.println(q.Dequeue());
        q.Display();
        q.IsEmpty();
        System.out.println(q.GetFront());
    }
}
class Queue {
    int top = -1;
    int rear = -1;
    int[] arr = new int[10];
    
    public void Enqueue (int i) {
        if (rear == -1) {
            arr[++rear] = i;
            top = 0;
            return;
        }
        if (rear == arr.length - 1) {
            System.out.println("Overflow. Queue is already full. Insertion not possible");
            return;
        }
        arr[++rear] = i;
    }
    
    public int Dequeue () {
        int val;
        if (top == -1) {
            System.out.println("Underflow. The Queue is already empty. Deletion cannot be performed");
            return -1;
        }
        val = arr[top];
        if(top == rear) {
            top = rear = -1;
            return val;
        }
        top++;
        return val;
    }
    
    public void Display () {
        if (top == -1 | rear == -1) {
            System.out.println("The Queue is empty. Nothing to Display");
            return;
        }
        for (int i = top; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void IsEmpty () {
        if (rear == -1 | top == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue is not Empty");
    }
    
    public int GetFront() {
        if (rear == -1 | top == -1) {
            System.out.println("No front element in Queue");
            return -1;
        }
        return arr[top];
    }
}