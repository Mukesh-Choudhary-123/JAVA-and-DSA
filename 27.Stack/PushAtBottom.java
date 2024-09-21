import java.util.Stack;

public class PushAtBottom {

    public static void pushNiche(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int t = s.pop();
        pushNiche(s, data);
        s.push(t);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushNiche(s, 30);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
