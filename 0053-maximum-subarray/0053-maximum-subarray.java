class Solution {
    public int maxSubArray(int[] arr) {
        int best = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i] + best;
            int curr = arr[i];
            best = Math.max(curr, prev);
            ans = Math.max(ans,best);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna