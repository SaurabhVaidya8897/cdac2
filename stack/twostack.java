package stack;
import java.util.*;
public class twostack {
	private int[] arr;
    private int size;
    private int top1, top2;

    public twostack(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void pushStack1(int value) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = value;
            System.out.println("Pushed element to Stack 1: " + value);
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public void pushStack2(int value) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = value;
            System.out.println("Pushed element to Stack 2: " + value);
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public int popStack1() {
        if (top1 >= 0) {
            int value = arr[top1];
            top1--;
            return value;
        } else {
            System.out.println("Stack 1 Underflow!");
            return -1;
        }
    }

    public int popStack2() {
        if (top2 < size) {
            int value = arr[top2];
            top2++;
            return value;
        } else {
            System.out.println("Stack 2 Underflow!");
            return -1;
        }
    }

    public void displayStack1() {
        if (top1 >= 0) {
            System.out.println("Elements in Stack 1:");
            for (int i = 0; i <= top1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 1 is empty.");
        }
    }

    public void displayStack2() {
        if (top2 < size) {
            System.out.println("Elements in Stack 2:");
            for (int i = size - 1; i >= top2; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 2 is empty.");
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        twostack twoStacks = new twostack(n);

        int choice;
        do {
            System.out.println("\n1. Push to Stack 1");
            System.out.println("2. Push to Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Display Stack 1");
            System.out.println("6. Display Stack 2");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push to Stack 1: ");
                    int val1 = scanner.nextInt();
                    twoStacks.pushStack1(val1);
                    break;
                case 2:
                    System.out.print("Enter element to push to Stack 2: ");
                    int val2 = scanner.nextInt();
                    twoStacks.pushStack2(val2);
                    break;
                case 3:
                    int popped1 = twoStacks.popStack1();
                    if (popped1 != -1)
                        System.out.println("Popped element from Stack 1: " + popped1);
                    break;
                case 4:
                    int popped2 = twoStacks.popStack2();
                    if (popped2 != -1)
                        System.out.println("Popped element from Stack 2: " + popped2);
                    break;
                case 5:
                    twoStacks.displayStack1();
                    break;
                case 6:
                    twoStacks.displayStack2();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
