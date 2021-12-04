package queue;
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Linear_Queue_LL {
    private static Node head = null, tail = null;

    public static void main(String[] args) {
        Linear_Queue_LL linear_Queue_LL = new Linear_Queue_LL();
        linear_Queue_LL.enqueue(23);
        linear_Queue_LL.enqueue(21);
        linear_Queue_LL.enqueue(13);
        linear_Queue_LL.enqueue(22);
        linear_Queue_LL.enqueue(24);
        linear_Queue_LL.dequeue();
        linear_Queue_LL.dequeue();
        linear_Queue_LL.peek();

    }

    public void enqueue(int value) {
        Node node = new Node(value);
        System.out.println("Inserted: " + value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue UnderFlow");
        } else {
            Node current = head;
            System.out.println("Removed item: " + current.value);
            head = head.next;
        }
    }

    public void peek() {
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println(head.value);
        }
    }

    public boolean isQueueEmpty() {
        return head == null && tail == null;
    }

}
