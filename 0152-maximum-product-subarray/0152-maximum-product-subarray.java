class Solution {
    public int maxProduct(int[] arr) {
        int positive_best = 1;
        int negative_best = 1;
        int add = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prev = positive_best * arr[i];
            int neg = negative_best * arr[i];
            int curr = arr[i];
            positive_best = Math.max(curr, Math.max(prev, neg));
            negative_best = Math.min(curr, Math.min(prev, neg));
            ans = Math.max(ans, Math.max(positive_best, negative_best));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna