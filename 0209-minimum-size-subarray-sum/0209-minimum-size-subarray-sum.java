class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int lt = 0;
        int rt = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (rt < arr.length) {
            sum = sum + arr[rt];
            while (sum >= k) {
                ans = Math.min(ans, rt - lt + 1);
                sum = sum - arr[lt];
                lt++;
            }
            rt++;

        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna