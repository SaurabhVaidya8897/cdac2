
package Queue;
import java.util.Scanner;
import java.util.*;
public class Double_Ended_Queue {			
    int queue[], MaxSize, front, rear;

    void createQueue(int size) {
        rear = -1;
        front = 0;
        MaxSize = size;
        queue = new int[MaxSize];
    }

    void enqueueRear(int element) {
        if (!isFull()) {
            rear++;
            queue[rear] = element;
            System.out.println("Data enqueued at rear: " + element);
        } else {
            System.out.println("Queue Full");
        }
    }

    void enqueueFront(int element) {
        if (!isFull()) {
            for (int i = rear; i >= front; i--) {
                queue[i + 1] = queue[i];
            }
            rear++;
            queue[front] = element;
            System.out.println("Data enqueued at front: " + element);
        } else {
            System.out.println("Queue Full");
        }
    }

    int dequeueFront() {
        if (!isEmpty()) {
            int temp = queue[front];
            front++;
            return temp;
        } else {
            System.out.println("Queue Empty");
            return -1;
        }
    }

    int dequeueRear() {
        if (!isEmpty()) {
            int temp = queue[rear];
            rear--;
            return temp;
        } else {
            System.out.println("Queue Empty");
            return -1;
        }
    }

    boolean isFull() {
        return (rear == MaxSize - 1);
    }

    boolean isEmpty() {
        return (front > rear);
    }

    void printQueue() {
        if (!isEmpty()) {
            System.out.println("Data in queue:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue Empty");
        }
    }

    public static void main(String args[]) {
        int ch;
        Scanner in = new Scanner(System.in);
        Double_Ended_Queue obj = new Double_Ended_Queue();
        System.out.println("Enter size of queue:");
        int size = in.nextInt();
        obj.createQueue(size);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. EnqueueRear");
            System.out.println("2. EnqueueFront");
            System.out.println("3. DequeueFront");
            System.out.println("4. DequeueRear");
            System.out.println("5. Print");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data to enqueue at rear: ");
                    int eRear = in.nextInt();
                    obj.enqueueRear(eRear);
                    break;
                case 2:
                    System.out.print("Enter data to enqueue at front: ");
                    int eFront = in.nextInt();
                    obj.enqueueFront(eFront);
                    break;
                case 3:
                    int dequeuedFront = obj.dequeueFront();
                    if (dequeuedFront != -1) {
                        System.out.println("Data dequeued from front: " + dequeuedFront);
                    }
                    break;
                case 4:
                    int dequeuedRear = obj.dequeueRear();
                    if (dequeuedRear != -1) {
                        System.out.println("Data dequeued from rear: " + dequeuedRear);
                    }
                    break;
                case 5:
                    obj.printQueue();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
        in.close();
    }
}
