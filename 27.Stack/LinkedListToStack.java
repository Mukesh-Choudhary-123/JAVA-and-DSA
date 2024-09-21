public class LinkedListToStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        static Node head = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty())
                head = newNode;
            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (isEmpty())
                return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty())
                return -1;
            int top = head.data;
            return top;

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(2);

        System.out.println(s.peek());

    }
}
