import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> requests;

    public RecentCounter() {
        // Initialize the queue to store request timestamps
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the new request time
        requests.offer(t);
        
        // Remove all requests that are older than t - 3000
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        
        // Return the number of requests in the last 3000 ms
        return requests.size();
    }
}
