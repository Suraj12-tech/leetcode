class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> check = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {

            check.add(arr[i]);
            if (check.size() > k) {
                check.poll();
            }
        }

        return check.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna