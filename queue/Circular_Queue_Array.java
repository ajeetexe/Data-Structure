package queue;
import java.util.Scanner;

class Circular_Queue_Array {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] arr;
    public static int start = -1, top = -1;

    public static void main(String[] args) {
        Circular_Queue_Array cqa = new Circular_Queue_Array();
        System.out.println("Please enter size of array of circular list: ");
        arr = new int[scanner.nextInt()];
        boolean flag = true;
        while (flag) {
            System.out.println("1: Enqueue\n2: Dequeue\n3: Peek\n0: Exit");
            switch (scanner.nextInt()) {
                case 1 -> cqa.enqueue();
                case 2 -> cqa.dequeue();
                case 3 -> cqa.peek();
                case 0 -> flag = false;
                default -> System.out.println("Invalid input");
            }
        }

    }

    public void enqueue() {
        if (isQueueFull()) {
            System.out.println("Queue Overflow");
        } else {
            if(start == -1){
                start = 0;
            }
            if (top + 1 == arr.length) {
                top = 0;
            } else {
                top++;
            }
            arr[top] = scanner.nextInt();
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[start]);
            if (start == top) {
                start = top = -1;
            } else if (start + 1 == arr.length) {
                start = 0;
            } else {
                start++;
            }
        }
    }

    public void peek() {
        if (!isQueueEmpty()) {
            System.out.println(arr[start]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public boolean isQueueFull() {
        if (top + 1 == start) {
            return true;
        } else if (start == 0 && top +1 ==arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isQueueEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}