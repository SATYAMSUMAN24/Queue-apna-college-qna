// Stack using 2 queues
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueD {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }
        public static int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
          
            // case 1
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()) {
                    break;
                }
            }
        }
    }
}
