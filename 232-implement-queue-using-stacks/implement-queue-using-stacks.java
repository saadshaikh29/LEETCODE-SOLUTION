import java.util.Stack;

class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    // Push element to the back of the queue
    public void push(int x) {
        stackIn.push(x);
    }
    
    // Removes the element from the front of the queue
    public int pop() {
        peek(); // Ensure stackOut has elements
        return stackOut.pop();
    }
    
    // Get the front element
    public int peek() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }
    
    // Returns whether the queue is empty
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
