import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    // Push element onto stack (costly)
    public void push(int x) {
        queue2.offer(x); // push new element to queue2
        
        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        
        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    // Removes the element on top of the stack
    public int pop() {
        return queue1.poll(); // top is always at front
    }
    
    // Get the top element
    public int top() {
        return queue1.peek();
    }
    
    // Check if stack is empty
    public boolean empty() {
        return queue1.isEmpty();
    }
}
